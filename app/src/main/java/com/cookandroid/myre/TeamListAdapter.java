package com.cookandroid.myre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TeamListAdapter extends BaseAdapter {
    ArrayList<Teamlist> teamlists = new ArrayList<Teamlist>();
    Context context;

    @Override
    public int getCount() {
        return teamlists.size();
    }

    @Override
    public Object getItem(int i) {
        return teamlists.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        context=parent.getContext();
        Teamlist teamlist = teamlists.get(position);
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.idealist,parent,false);
        }
        TextView idealistitem = convertView.findViewById(R.id.idealistitem);
        idealistitem.setText("집에 가고 싶다");

        return convertView;
    }
    public void addITem(Teamlist teamlist){
        this.teamlists.add(teamlist);
    }
}
