package com.salim.seelaptop;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by salim on 4/29/18.
 */

class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    Context context;
    List<DataLaptop> dataLaptop;

    public ListAdapter(Context context, List<DataLaptop> databuku) {
        this.context = context;
        this.dataLaptop = databuku;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        String url_image = "http://192.168.20.30/Laptop/gambar/" + dataLaptop.get(position).getGambar();
        Glide.with(context)
                .load(url_image)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.imgGambar);

        holder.txtNama.setText("" + dataLaptop.get(position).getNama());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kirim = new Intent(context, DetailActivity.class);
                kirim.putExtra("NAMA", dataLaptop.get(position).getNama());
                kirim.putExtra("HARGA", dataLaptop.get(position).getHarga());
                kirim.putExtra("GAMBAR", dataLaptop.get(position).getGambar());

                context.startActivity(kirim);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataLaptop.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtNama;
        ImageView imgGambar;
        public MyViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView)itemView.findViewById(R.id.txtNama);
            imgGambar = (ImageView)itemView.findViewById(R.id.imgGambar);

        }
    }
}
