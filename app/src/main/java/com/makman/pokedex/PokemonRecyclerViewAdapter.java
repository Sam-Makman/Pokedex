package com.makman.pokedex;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Sam made this!
 * Be Jealous
 */
public class PokemonRecyclerViewAdapter extends RecyclerView.Adapter<PokemonRecyclerViewAdapter.PokemonViewHolder>{
    public static final String Tag = PokemonRecyclerViewAdapter.class.getSimpleName();

    public interface OnPokemonRowClickListener{
        void onPokemonRowClicked(Pokemon pokemon);
    }

    ArrayList<Pokemon> mPokeList;
    OnPokemonRowClickListener mListener;
    public PokemonRecyclerViewAdapter(ArrayList<Pokemon> pokeList, OnPokemonRowClickListener listener){
        mPokeList = pokeList;
        mListener = listener;
    }

    @Override
    public PokemonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View row = inflater.inflate(R.layout.row_pokemon, parent, false);
        return new PokemonViewHolder(row);
    }

    @Override
    public void onBindViewHolder(final PokemonViewHolder holder, int position) {
        Context context = holder.name.getContext();
        Pokemon pokemon = mPokeList.get(position);
        holder.name.setText(pokemon.getName());
        holder.id.setText(pokemon.getId());
        String weight = context.getString(R.string.pokemon_weight,pokemon.getWeight());
        holder.weight.setText(weight);
        String height = context.getString(R.string.pokemon_height,pokemon.getHeight());
        holder.height.setText(height);

        Picasso.with(context).load(pokemon.getImageUrl()).fit().centerInside().into(holder.image);

        holder.fullView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(mListener != null){
                    mListener.onPokemonRowClicked(mPokeList.get(holder.getAdapterPosition()));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mPokeList.size();
    }

    static class PokemonViewHolder extends RecyclerView.ViewHolder{
        TextView name , id , height, weight;
        ImageView image;
        View fullView;
        public PokemonViewHolder(View itemView) {
            super(itemView);
            fullView = itemView;
            image = (ImageView) itemView.findViewById(R.id.pokemon_row_image);
            name = (TextView) itemView.findViewById(R.id.pokemon_row_name);
            id = (TextView) itemView.findViewById(R.id.pokemon_row_id_number);
            height = (TextView) itemView.findViewById(R.id.pokemon_row_height);
            weight = (TextView) itemView.findViewById(R.id.pokemon_row_weight);
        }
    }
}
