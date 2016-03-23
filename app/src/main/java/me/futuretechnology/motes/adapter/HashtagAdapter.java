package me.futuretechnology.motes.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import me.futuretechnology.motes.R;

import java.util.List;

/**
 * Created by poliveira on 24/10/2014.
 */
public class HashtagAdapter extends BaseAdapter {

    private List<String> hashtags;

    public HashtagAdapter(List<String> data) {
        hashtags = data;
    }

    @Override
    public int getCount() {
        return hashtags.size();
    }

    @Override
    public Object getItem(int position) {
        return hashtags.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null){
            convertView=LayoutInflater.from(parent.getContext()).inflate(R.layout.drawer_row, parent, false);
            holder=new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder= (ViewHolder) convertView.getTag();
        }
        holder.textView.setText(hashtags.get(position));
        return convertView;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.item_name);
        }
    }
}
