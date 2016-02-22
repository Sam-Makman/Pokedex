package com.makman.pokedex;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
public class PokemonAsyncLoadTask extends AsyncTask<String, Void, JSONObject> {

    private static final String TAG = PokemonAsyncLoadTask.class.getSimpleName();
    Pokemon mPokemon;
    PokemonDetailActivity mPda;
    public PokemonAsyncLoadTask(Pokemon pokemon, PokemonDetailActivity pda) {
        mPokemon = pokemon;
       mPda = pda;
    }

    @Override
    protected JSONObject doInBackground(String... params) {
        StringBuilder builder = new StringBuilder();
        JSONObject jsonObject = null;
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
            jsonObject = new JSONObject(builder.toString());

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        return jsonObject;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mPda.mPBar.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCancelled(JSONObject jsonObject) {
        super.onCancelled(jsonObject);
        mPda.mPBar.setVisibility(View.INVISIBLE);

    }

    @Override
    protected void onPostExecute(JSONObject jsonObject) {
        super.onPostExecute(jsonObject);


        if(jsonObject == null){
            Log.d(TAG, "JSON array is null");
        }else{
                try {
                    String exp = jsonObject.getString("base_experience");

                    mPokemon.setBaseExp(exp);

                    JSONArray stats = jsonObject.getJSONArray("stats");
                    for(int i = 0; i< stats.length();i++){
                        JSONObject stat = stats.getJSONObject(i);
                        String baseStat = stat.getString("base_stat");
                        switch (i){
                            case 0:
                                mPokemon.setmSpeed(baseStat);
                                break;
                            case 1:
                                mPokemon.setmSpecDef(baseStat);
                                break;
                            case 2:
                                mPokemon.setmSpecAtk(baseStat);
                                break;
                            case 3:
                                mPokemon.setmDefence(baseStat);
                                break;
                            case 4:
                                mPokemon.setmAttack(baseStat);
                                break;
                            case 5:
                                mPokemon.setmHp(baseStat);
                                break;
                        }
                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }


        }
        mPda.mPBar.setVisibility(View.INVISIBLE);
        mPda.updateStats();
    }
}
