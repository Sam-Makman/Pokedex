package com.makman.pokedex;

import android.app.Activity;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class PokemonDetailActivity extends AppCompatActivity {
    public static final  String ARG_Pokemon = "POKEMON";
    private static final String TAG = PokemonDetailActivity.class.getSimpleName();

    TextView mId, mWeight, mHeight, mHp, mExp, mAttack, mDefense, mSpeed, mSpecAttack, mSpecDefence;
    ImageView mPokeImage;
    ProgressBar mPBar;
    Pokemon mPokemon;
    private PokemonAsyncLoadTask mTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPokemon =(Pokemon) getIntent().getSerializableExtra(ARG_Pokemon);
        setContentView(R.layout.activity_pokemon_detail);
        mId = (TextView) findViewById(R.id.detail_pokemon_id);
        mWeight = (TextView) findViewById(R.id.detail_pokemon_height);
        mHeight = (TextView) findViewById(R.id.detail_pokemon_weight);

        mHp = (TextView) findViewById(R.id.detail_pokemon_hp);
        mExp = (TextView) findViewById(R.id.detail_pokemon_base_exp);
        mAttack = (TextView) findViewById(R.id.detail_pokemon_attack);
        mDefense = (TextView) findViewById(R.id.detail_pokemon_defense);
        mSpeed = (TextView) findViewById(R.id.detail_pokemon_speed);
        mSpecAttack = (TextView) findViewById(R.id.detail_pokemon_spc_att);
        mSpecDefence = (TextView) findViewById(R.id.detail_pokemon_spc_def);



        mPokeImage = (ImageView) findViewById(R.id.detail_pokemon_image);
        mPBar = (ProgressBar) findViewById(R.id.detail_pokemon_progress);
        mPBar.setIndeterminate(true);
        mPBar.setVisibility(View.GONE);

        Picasso.with(this).load(mPokemon.getImageUrl()).fit().centerInside().into(mPokeImage);

        mId.setText(mPokemon.getId());
        String weight = getString(R.string.pokemon_weight,mPokemon.getWeight());
        String height = getString(R.string.pokemon_height,mPokemon.getHeight());

        mHeight.setText(height);
        mWeight.setText(weight);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle(mPokemon.getName());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ConnectivityManager manager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo network = manager.getActiveNetworkInfo();

        if(!mPokemon.updated()){
            if(network == null || !network.isConnected() ){
                Toast.makeText(this, R.string.no_internet, Toast.LENGTH_SHORT).show();
            }else {
                mTask = new PokemonAsyncLoadTask(mPokemon, this);
                mTask.execute(mPokemon.getStatsUrl());
            }
        }else{
            updateStats();
        }

    }

    public void updateStats(){
        Log.d(TAG, "exp = " + mPokemon.getBaseExp());
        String hp = getString(R.string.pokemon_hp,mPokemon.getmHp());
        mHp.setText(hp);

        String exp = getString(R.string.pokemon_exp,mPokemon.getBaseExp());
        mExp.setText(exp);

        String attack = getString(R.string.pokemon_attack,mPokemon.getmAttack());
        mAttack.setText(attack);

        String defense = getString(R.string.pokemon_defense,mPokemon.getmDefence());
        mDefense.setText(defense);

        String speed = getString(R.string.pokemon_speed,mPokemon.getmSpeed());
        mSpeed.setText(speed);

        String specattack = getString(R.string.pokemon_specattack,mPokemon.getmHp());
        mSpecAttack.setText(specattack);

        String specdefence = getString(R.string.pokemon_special_defense,mPokemon.getmSpecDef());
        mSpecDefence.setText(specdefence);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                endActivity();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        endActivity();
    }

    public void endActivity(){
        if(mTask != null && !mTask.isCancelled()) {
            mTask.cancel(true);
        }

        Intent data = new Intent();
        data.putExtra(ARG_Pokemon, mPokemon);
        setResult(Activity.RESULT_OK, data);
        finish();
    }

}
