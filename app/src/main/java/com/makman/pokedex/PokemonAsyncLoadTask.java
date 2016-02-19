package com.makman.pokedex;

import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by sam on 2/16/16.
 */
public class PokemonAsyncLoadTask extends AsyncTask<String, Void, String> {

    Pokemon mPokemon;
    PokemonDetailActivity mPokemonContext;
    public PokemonAsyncLoadTask(Pokemon pokemon, PokemonDetailActivity context) {
        mPokemon = pokemon;
       mPokemonContext = context;
    }

    @Override
    protected String doInBackground(String... params) {
        StringBuilder builder = new StringBuilder();
        JSONArray jsonArray = null;
        if(params == null)return null;

        try {
            URL url = new URL(params[0]);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            InputStreamReader inputStream = new InputStreamReader(connection.getInputStream());
            BufferedReader reader = new BufferedReader(inputStream);

            if(isCancelled()){
                return null;
            }
            String line;
            while((line = reader.readLine()) != null){
                builder.append(line);

                if(isCancelled()){
                    return null;
                }
            }
            jsonArray = new JSONArray(builder.toString());

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mPokemonContext.mPBar.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        mPokemonContext.mPBar.setVisibility(View.GONE);
    }
}
