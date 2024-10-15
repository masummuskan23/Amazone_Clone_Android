package com.example.amazon1.viewholder;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;

import androidx.annotation.NonNull;


import com.example.amazon1.Interfaces.ItemClickListener;
import com.example.amazon1.R;

import org.jetbrains.annotations.NotNull;

public class OrdersViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView orderName, orderDate, orderAddr, orderCity, orderPrice, orderPhone;
    private ItemClickListener itemClickListener;

    public OrdersViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);

        orderName=itemView.findViewById(R.id.orderName);
        orderPhone=itemView.findViewById(R.id.orderPhone);
        orderAddr=itemView.findViewById(R.id.orderAddr);
        orderCity=itemView.findViewById(R.id.orderCity);
        orderDate=itemView.findViewById(R.id.orderDate);
        orderPrice=itemView.findViewById(R.id.orderPrice);

    }

    @Override
    public void onClick(View view) {
        itemClickListener.OnClick(view,getAdapterPosition(),false);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}

