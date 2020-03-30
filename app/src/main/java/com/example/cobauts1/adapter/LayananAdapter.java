package com.example.cobauts1.adapter;
import com.squareup.picasso.Picasso;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import com.example.cobauts1.R;
import com.example.cobauts1.models.TeamLogo;


public class LayananAdapter extends RecyclerView.Adapter<LayananAdapter.ViewHolder> {
    private Context context;
    private List<TeamLogo> items;

    public LayananAdapter(Context context, List<TeamLogo> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_layanan, parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TeamLogo item = items.get(position);
        //atur image, dapat menggunakan Picasso atau Glide
        Picasso.get().load(item.getLogo()).into(holder.logoImage);
        holder.nameText.setText(item.getName());
        holder.descText.setText(item.getDesc());
    }

    @Override
    public int getItemCount() {
        return(items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;
        TextView descText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
            descText = itemView.findViewById(R.id.text_desc);
        }
    }
}