package com.makman.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class PokemonDetailActivity extends AppCompatActivity {
    public static final  String ARG_Pokemon = "POKEMON";

    TextView mId, mWeight, mHeight, mHp, mExp, mAttack, mDefense, mSpeed, mSpecAttack, mSpecDefence;
    ImageView mPokeImage;
    ProgressBar mPBar;
    Pokemon mPokemon;
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
        mSpecAttack = (TextView) findViewById(R.id.detail_pokemon_weight);
        mSpecDefence = (TextView) findViewById(R.id.detail_pokemon_weight);



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

        if(!mPokemon.updated()){
            PokemonAsyncLoadTask task = new PokemonAsyncLoadTask(mPokemon, this);
            task.execute(mPokemon.getStatsUrl());
        }else{

        }

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
