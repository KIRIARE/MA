package com.rule64.ma.accountlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ma.R;

import java.util.ArrayList;

public class AccountListAdapter extends RecyclerView.Adapter <AccountListHolder> {

    private ArrayList<AccountListItem> items;

    // Item click event 를 위한 listener
    public interface OnItemClickEventListener {
        void onItemClick(View a_view, int a_position);
    }
    private OnItemClickEventListener mItemClickListener;
    public void setOnItemClickListener(OnItemClickEventListener a_listener) {
        mItemClickListener = a_listener;
    }


    public AccountListAdapter(ArrayList<AccountListItem> list){
        items = list;
    }
    @NonNull
    @Override
    public AccountListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_account_list_view,parent,false);

        return new AccountListHolder(v,mItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountListHolder holder, int position) {
        AccountListItem accountListItem = items.get(position);
        holder.idView.setText(accountListItem.getId());
        holder.siteView.setText(accountListItem.getSite());
        holder.lastUpdatedView.setText(accountListItem.getLastUpdated());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
