package com.example.dh.kukgel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class Gallery_listview_adapter extends BaseAdapter {

    private ArrayList<Gallery_listview_item> listViewItemList = new ArrayList<Gallery_listview_item>() ;

    public Gallery_listview_adapter() {

    }


    @Override
    public int getCount() {
        return listViewItemList.size() ;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();


        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.gallery_listview_item, parent, false);
        }


        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.imageView1) ;
        TextView titleTextView = (TextView) convertView.findViewById(R.id.textView1) ;
        TextView descTextView = (TextView) convertView.findViewById(R.id.textView2) ;


        Gallery_listview_item listViewItem = listViewItemList.get(position);


        iconImageView.setImageDrawable(listViewItem.getIcon());
        titleTextView.setText(listViewItem.getTitle());
        descTextView.setText(listViewItem.getDesc());

        return convertView;
    }


    @Override
    public long getItemId(int position) {
        return position ;
    }


    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position) ;
    }


    public void addItem(Drawable icon, String title, String desc) {
        Gallery_listview_item item = new Gallery_listview_item();

        item.setIcon(icon);
        item.setTitle(title);
        item.setDesc(desc);


        listViewItemList.add(item);
    }
}
