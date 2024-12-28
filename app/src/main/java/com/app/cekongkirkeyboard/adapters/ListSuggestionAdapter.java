package com.app.cekongkirkeyboard.adapters;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;

import com.app.cekongkirkeyboard.R;

public class ListSuggestionAdapter extends RecyclerView.Adapter <ListSuggestionAdapter.ViewHolder>{

    ArrayList<String>suggestsList;
    Context context;

    public ListSuggestionAdapter(Context context, ArrayList<String> suggestsList) {
        super();
        this.context = context;
        this.suggestsList = suggestsList;
    }

    public void UpdateListSuggestionAdapter(ArrayList<String> suggestsList) {
        this.suggestsList = suggestsList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.suggest_item_list, viewGroup, false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.textView.setText(suggestsList.get(i));

        /*viewHolder.setClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                if (isLongClick) {
                    Toast.makeText(context, "#" + position + " - " + numberName.get(position) + " (Long
                            click)", Toast.LENGTH_SHORT).show();
                    context.startActivity(new Intent(context, MainActivity.class));
                } else {
                    Toast.makeText(context, "#" + position + " - " + numberName.get(position),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });*/

    }
    @Override
    public int getItemCount() {
        return suggestsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textView;
        ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_ac);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            //clickListener.onClick(view, getPosition(), false);

            Intent i = new Intent("com.app.cekongkirkeyboard.SELECT_SUGGEST");
            i.putExtra("suggest_selected", getPosition());
            context.sendBroadcast(i);
        }

    }
}