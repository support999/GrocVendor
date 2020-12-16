package com.amit.grochousevendor;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ViewOrderAdapter extends RecyclerView.Adapter<ViewOrderAdapter.Holder> {

    AppCompatActivity activity;
    Context context;
    List<ViewOrderModal> viewOrderModals;

    public ViewOrderAdapter(AppCompatActivity activity, Context context, List<ViewOrderModal> viewOrderModals) {
        this.activity = activity;
        this.context = context;
        this.viewOrderModals = viewOrderModals;
    }

    @NonNull
    @Override
    public ViewOrderAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_view_order, parent, false);
        ViewOrderAdapter.Holder holder = new ViewOrderAdapter.Holder(v);
        return holder ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewOrderAdapter.Holder holder, int position) {
        holder.viewOrderButton.setOnClickListener((view) -> {
            Intent intent = new Intent(activity, OrderDetailActivity.class);
            activity.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return viewOrderModals.size();
    }
    
    public class Holder extends RecyclerView.ViewHolder {
        TextView userName, timer, orderNum, itemNum, totalAmount;
        Button viewOrderButton;
        
        public Holder(@NonNull View itemView) {
            super(itemView);
            
            userName = itemView.findViewById(R.id.user_name);
            timer = itemView.findViewById(R.id.time_id);
            orderNum = itemView.findViewById(R.id.order_number);
            itemNum = itemView.findViewById(R.id.item_number);
            totalAmount = itemView.findViewById(R.id.amount_number);
            viewOrderButton = itemView.findViewById(R.id.view_order_btn);
        }
    }
}
