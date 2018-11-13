package com.example.practice_webant.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practice_webant.R;
import com.example.practice_webant.dto.DTO;

import java.util.List;

public class ListAdapter  extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<DTO> data;

    public ListAdapter(List<DTO> data) {
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.remind_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        DTO item = data.get(i);
        holder.title.setText(item.getTitle());
        holder.img.setText(item.getTitle());

        int a = R.drawable.catlove;
        holder.icon.setImageResource(a);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<DTO> data) {
        this.data = data;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView title;
        TextView img;
        ImageView icon;

        public ViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.cardView);
            title = (TextView) itemView.findViewById(R.id.title);
            img = (TextView) itemView.findViewById(R.id.img);
            icon = (ImageView) itemView.findViewById(R.id.icon);
        }
    }

}