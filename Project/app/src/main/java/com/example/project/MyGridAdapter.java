package com.example.project;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyGridAdapter extends ArrayAdapter<String> {
    Activity context;
    String[] pname;
    String[] pprice;
    Integer[] pimage;

    public MyGridAdapter(@NonNull Activity context, String[] pname, String[] pprice, Integer[] pimage) {
        super(context,R.layout.mygriditem);
        this.context = context;
        this.pname = pname;
        this.pprice = pprice;
        this.pimage = pimage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflator=context.getLayoutInflater();
        View rowView=inflator.inflate(R.layout.mygriditem,null,true);
        TextView name=rowView.findViewById(R.id.pname);
        TextView price=rowView.findViewById(R.id.pprice);
        ImageView image=rowView.findViewById(R.id.pimage);

        name.setText(pname[position]);
        price.setText(pprice[position]);
        image.setImageResource(Integer.parseInt(String.valueOf(pimage[position])));
        return rowView;
    }
}
