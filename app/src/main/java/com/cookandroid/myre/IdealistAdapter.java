package com.cookandroid.myre;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class IdealistAdapter extends BaseAdapter {
    ArrayList<idealist> idealist = new ArrayList<idealist>();
    Context context;

    @Override
    public int getCount() {
        return idealist.size();
    }

    @Override
    public Object getItem(int i) {
        return idealist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        context=parent.getContext();
        idealist idealist1 = idealist.get(position);
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.idealist,parent,false);
        }
        TextView idealistitem = convertView.findViewById(R.id.idealistitem);
        idealistitem.setText("집에 가고 싶다");

        return convertView;
    }
    public void addITem(idealist idealist){
        this.idealist.add(idealist);
    }
}
