package com.rule64.ma.accountlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ma.R;

import java.util.ArrayList;

public class AccountListAdapter extends RecyclerView.Adapter <AccountListAdapter.AccountListHolder> {

    ArrayList<AccountListItem> items = new ArrayList<AccountListItem>();

    public AccountListAdapter(){
        AccountListItem item1 = new AccountListItem();
        item1.setId("ASDF1");
        item1.setSite("www.test1.com");
        item1.setLastUpdated("2023-08-27");

        items.add(item1);

        AccountListItem item2 = new AccountListItem();
        item2.setId("ASDF2");
        item2.setSite("www.test2.com");
        item2.setLastUpdated("2023-08-28");

        items.add(item2);

        AccountListItem item3 = new AccountListItem();
        item3.setId("ASDF3");
        item3.setSite("www.test3.com");
        item3.setLastUpdated("2023-08-29");

        items.add(item3);
    }

    public static class AccountListHolder extends RecyclerView.ViewHolder {

        TextView idView;
        TextView siteView;
        TextView lastUpdatedView;

        public AccountListHolder(@NonNull View itemView) {
            super(itemView);

            idView = itemView.findViewById(R.id.item_account_list_view_id);
            siteView = itemView.findViewById(R.id.item_account_list_view_site);
            lastUpdatedView = itemView.findViewById(R.id.item_account_list_view_last_updated);

        }

        public void setItem(AccountListItem item){
            idView.setText(item.getId());
            siteView.setText(item.getSite());
            lastUpdatedView.setText(item.getLastUpdated());
        }
    }

    @NonNull
    @Override
    public AccountListAdapter.AccountListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_account_list_view,parent,false);

        return new AccountListHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountListAdapter.AccountListHolder holder, int position) {
        AccountListItem accountListItem = items.get(position);
        holder.setItem(accountListItem);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
