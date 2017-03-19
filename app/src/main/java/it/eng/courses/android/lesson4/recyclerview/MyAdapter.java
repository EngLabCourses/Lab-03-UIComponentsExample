package it.eng.courses.android.lesson4.recyclerview;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import it.eng.courses.android.lesson4.R;

/**
 * Created by Peppe on 12/01/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<String> items;

    //La prima cosa da fare è creare il layout per il singolo elemento
    private static final int LAYOUT = R.layout.item_recyclerview_example;

    public MyAdapter() {
        items = new ArrayList<>();
    }


    public void setList(List<String> items) {
        this.items.clear();
        this.items.addAll(items);

        //Il metodo notifyDataSetChanged() serve per eseguire un refresh della lista. Da chiamare quando cambia il dataset.
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(LAYOUT, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String mString = items.get(position);

        holder.text.setText(mString);

        if (position % 2 == 0) {
            //Imposto il colore di background in maniera alterna
            holder.itemView.setBackgroundColor(ContextCompat.getColor(holder.itemView.getContext(), R.color.light_grey));
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    //La classe ViewHolder rispecchia il layout XML del singolo elemento
    class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;

        ViewHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.text);
        }
    }
}
