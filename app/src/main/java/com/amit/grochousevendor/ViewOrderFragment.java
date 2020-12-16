package com.amit.grochousevendor;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ViewOrderFragment extends Fragment {
    RecyclerView viewOrderRecycler;
    ViewOrderAdapter viewOrderAdapter;
    LinearLayoutManager linearLayoutManager;
    List<ViewOrderModal> models;
    AppCompatActivity activity;

    public ViewOrderFragment() {
        // Required empty public constructor
    }


    public static ViewOrderFragment newInstance() {
        return new ViewOrderFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_view_order, container, false);

        models = new ArrayList<>();

        activity = (AppCompatActivity) v.getContext();

        models.add(new ViewOrderModal("Rajesh Sharma", "21:45", "1212", "5", "₹ 243", (R.id.view_order_btn)));
        models.add(new ViewOrderModal("Pankaj Sharma", "15:45", "3321", "3", "₹ 180", (R.id.view_order_btn)));

        viewOrderRecycler = v.findViewById(R.id.view_order_recyclerview);
        viewOrderAdapter = new ViewOrderAdapter(activity, v.getContext(), models);
        linearLayoutManager = new LinearLayoutManager(v.getContext());
        viewOrderRecycler.setAdapter(viewOrderAdapter);
        viewOrderRecycler.setLayoutManager(linearLayoutManager);

        return v;
    }
}

















