package com.example.crimereporter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PoliceCaseList extends ArrayAdapter<Case> {
    private Activity context;
    private List<Case> caseList;
    public PoliceCaseList(Activity context,List<Case> caseList){
        super(context,R.layout.list_layout,caseList);
        this.context = context;
        this.caseList = caseList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout,null,true);
        TextView listViewVictimName = (TextView) listViewItem.findViewById(R.id.listViewVicName);
        TextView listViewDescription = (TextView) listViewItem.findViewById(R.id.listViewDesc);
        TextView listViewMobNumber = (TextView) listViewItem.findViewById(R.id.listViewMobNo);
        Case casee = caseList.get(position);
        listViewMobNumber.setText(casee.getMobnouccc());
        listViewVictimName.setText(casee.getVicnameuccc());
        listViewDescription.setText(casee.getDescuccc());
        return listViewItem;
    }
}
