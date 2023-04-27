package org.cadenzu.lutemon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class LutemonViewAdapter extends RecyclerView.Adapter<LutemonViewHolder> {

    private Context context;
    private ArrayList<Lutemon> lutemons;

    public LutemonViewAdapter(Context context, ArrayList<Lutemon> lutemons) {
        this.context = context;
        this.lutemons = lutemons;
    }

    @NonNull
    @Override
    public LutemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LutemonViewHolder(LayoutInflater.from(context).inflate(R.layout.lutemon_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LutemonViewHolder holder, int position) {
        holder.lutemonName.setText(lutemons.get(position).getName());
        holder.lutemonColor.setText(lutemons.get(position).getColor());
        holder.lutemonExperienceInt.setText(String.valueOf(lutemons.get(position).getExp()));
        holder.lutemonMaxHealthInt.setText(String.valueOf(lutemons.get(position).getMaxHealth()));
        holder.lutemonAttackInt.setText(String.valueOf(lutemons.get(position).getAttack()));
        holder.lutemonDefenseInt.setText(String.valueOf(lutemons.get(position).getDefense()));

    }

    @Override
    public int getItemCount() {
        return lutemons.size();
    }
}
