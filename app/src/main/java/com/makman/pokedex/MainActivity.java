package com.makman.pokedex;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

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
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
          MainActivity.this,
                new Pair<View, String>(findViewById(R.id.pokemon_row_image),
                        getString(R.string.transition_name_image)),
                new Pair<View, String>(findViewById(R.id.pokemon_row_id_number),
                        getString(R.string.transition_name_id)),
                new Pair<View, String>(findViewById(R.id.pokemon_row_height),
                        getString(R.string.transition_name_height)),
                new Pair<View, String>(findViewById(R.id.pokemon_row_weight),
                        getString(R.string.transition_name_weight))
        );

        Intent intent = new Intent(MainActivity.this, PokemonDetailActivity.class);
        intent.putExtra(PokemonDetailActivity.ARG_Pokemon, pokemon);
        ActivityCompat.startActivityForResult(MainActivity.this, intent, CODE_POKEMON, options.toBundle());
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == Activity.RESULT_OK  && requestCode == CODE_POKEMON){
            Pokemon pokemon = (Pokemon) data.getSerializableExtra(PokemonDetailActivity.ARG_Pokemon);
            if(mPokemon != null) {
                mPokemon.setPokemon(Integer.parseInt(pokemon.getId()), pokemon);
                mAdapter.notifyItemChanged(Integer.parseInt(pokemon.getId()) - 1);
            }
        }
    }
}
