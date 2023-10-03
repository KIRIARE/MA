package com.rule64.ma.accountlist;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ma.R;

public class AccountListHolder extends RecyclerView.ViewHolder {
    TextView idView;
    TextView siteView;
    TextView lastUpdatedView;
    public AccountListHolder(@NonNull View itemView, final AccountListAdapter.OnItemClickEventListener a_itemClickListener) {
        super(itemView);

        idView = itemView.findViewById(R.id.item_account_list_view_id);
        siteView = itemView.findViewById(R.id.item_account_list_view_site);
        lastUpdatedView = itemView.findViewById(R.id.item_account_list_view_last_updated);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    a_itemClickListener.onItemClick(view, position);
                }
            }
        });
    }

}
