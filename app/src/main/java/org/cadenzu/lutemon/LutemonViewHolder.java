package org.cadenzu.lutemon;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LutemonViewHolder extends RecyclerView.ViewHolder {

    TextView lutemonName, lutemonColor, lutemonExperience, lutemonExperienceInt, lutemonMaxHealth,
            lutemonMaxHealthInt, lutemonAttack, lutemonAttackInt, lutemonDefense, lutemonDefenseInt;

    public LutemonViewHolder(@NonNull View itemView) {
        super(itemView);
        lutemonName = itemView.findViewById(R.id.txtName);
        lutemonColor = itemView.findViewById(R.id.txtColor);
        lutemonExperience = itemView.findViewById(R.id.txtExp);
        lutemonExperienceInt = itemView.findViewById(R.id.txtExpInt);
        lutemonMaxHealth = itemView.findViewById(R.id.txtMaxHealth);
        lutemonMaxHealthInt = itemView.findViewById(R.id.txtMaxHealthInt);
        lutemonAttack = itemView.findViewById(R.id.txtAttack);
        lutemonAttackInt = itemView.findViewById(R.id.txtAttackInt);
        lutemonDefense = itemView.findViewById(R.id.txtDefense);
        lutemonDefenseInt = itemView.findViewById(R.id.txtDefenseInt);
    }
}
