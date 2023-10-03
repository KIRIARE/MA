package com.rule64.ma.accountlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ma.R;

import java.util.ArrayList;
import java.util.List;

public class AccountListFragment extends Fragment {

    RecyclerView recyclerView;

    public static AccountListFragment newInstance(){
        return new AccountListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account_list,null);

        final ArrayList<AccountListItem> itemList = new ArrayList<>();

        itemList.add(new AccountListItem("test","SITE1","20XX-XX-XX"));
        itemList.add(new AccountListItem("test","SITE2","20XX-XX-XX"));
        itemList.add(new AccountListItem("test","SITE3","20XX-XX-XX"));

        AccountListAdapter accountListAdapter = new AccountListAdapter(itemList);

        accountListAdapter.setOnItemClickListener(new AccountListAdapter.OnItemClickEventListener() {
            @Override
            public void onItemClick(View a_view, int a_position) {
                final AccountListItem item = itemList.get(a_position);
                Toast.makeText(getContext(), item.getSite(), Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView = (RecyclerView) view.findViewById(R.id.accountListView);
        recyclerView.setAdapter(accountListAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}

