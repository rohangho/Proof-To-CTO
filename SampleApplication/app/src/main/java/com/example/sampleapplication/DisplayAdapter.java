package com.example.sampleapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class DisplayAdapter extends RecyclerView.Adapter<DisplayAdapter.ViewHolder> {

    Context context;
    View v1;

    public DisplayAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutcard, parent, false);
        v1 = v;
        return new ViewHolder(v, 0);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        // int resAnime=R.anim.animation_go_up;
        //LayoutAnimationController animationController= AnimationUtils.loadLayoutAnimation(context,resAnime);
        // holder.cardView.setLayoutAnimation(animationController);
        if (position == 2) {
            new ViewHolder(v1, 1);
        }
        if (position == 3) {
            new ViewHolder(v1, 2);
        }


    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView textView;
        LinearLayout layout;
        LayoutAnimationController animationController;


        public ViewHolder(@NonNull View itemView, int i) {
            super(itemView);
            if (i == 0) {
                layout = (LinearLayout) itemView.findViewById(R.id.linear);
                cardView = (CardView) itemView.findViewById(R.id.card);
            }
            if (i == 1) {
                layout = (LinearLayout) itemView.findViewById(R.id.linear);
                int resAnime = R.anim.animation_fromright;
                animationController = AnimationUtils.loadLayoutAnimation(context, resAnime);
                layout.setLayoutAnimation(animationController);
            }
            if (i == 2) {
                layout = (LinearLayout) itemView.findViewById(R.id.linear);
                int resAnime = R.anim.animation_fromleft;
                animationController = AnimationUtils.loadLayoutAnimation(context, resAnime);
                layout.setLayoutAnimation(animationController);
            }

        }

//        public void amimate()
//        {
//
//
//        }

    }
}
