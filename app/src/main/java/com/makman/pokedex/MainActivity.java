package com.makman.pokedex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements PokemonRecyclerViewAdapter.OnPokemonRowClickListener {


    private static final int CODE_POKEMON = 0;
    RecyclerView mRecyclerView;
    Pokedex mPokemon;
    PokemonRecyclerViewAdapter mAdapter;
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.main_activity_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mPokemon = new Pokedex();
        mAdapter = new PokemonRecyclerViewAdapter(mPokemon.getmPokemons(), this);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    public void onPokemonRowClicked(Pokemon pokemon) {
        Intent intent = new Intent(MainActivity.this, PokemonDetailActivity.class);
        intent.putExtra(PokemonDetailActivity.ARG_Pokemon, pokemon);
        startActivityForResult(intent, CODE_POKEMON);
    }
}
