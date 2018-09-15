package com.kuliah.fahrulyurisnan.contohrecyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kuliah.fahrulyurisnan.contohrecyclerview.R;
import com.kuliah.fahrulyurisnan.contohrecyclerview.models.MyData;

import org.w3c.dom.Text;

import java.util.List;

public class MyDataAdapter extends RecyclerView.Adapter<MyDataAdapter.ViewHolder> {
    public List<MyData> myData;
    public MyDataAdapter(List<MyData> myData) {
        this.myData = myData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list,viewGroup,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        MyData data = myData.get(i);
        viewHolder.nama.setText(data.getNama());
        viewHolder.judul.setText(data.getJudul());
        viewHolder.tahun.setText(data.getTahun());
        viewHolder.gambar.setImageResource(data.getGambar());
    }

    @Override
    public int getItemCount() {
        return myData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView judul,nama,tahun;
        public ImageView gambar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.nama);
            judul = itemView.findViewById(R.id.judul);
            tahun = itemView.findViewById(R.id.tahun);
            gambar = itemView.findViewById(R.id.gambar);
        }
    }
}
