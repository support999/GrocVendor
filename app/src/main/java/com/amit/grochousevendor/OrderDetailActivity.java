package com.amit.grochousevendor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderDetailActivity extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.item_exp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    private void prepareListData() {

        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // list Header
        listDataHeader.add("Item");

        // Add Child Data
        List<String> item = new ArrayList<String>();
        item.add("Cornitos Nacho Crisps 60 g x 3 ");
        item.add("Cornitos Nacho Crisps 60 g x 3");
        item.add("Cornitos Nacho Crisps 60 g x 3");
        item.add("Cornitos Nacho Crisps 60 g x 3");
        item.add("Cornitos Nacho Crisps 60 g x 3");

        listDataChild.put(listDataHeader.get(0), item);
    }
}