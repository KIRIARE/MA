package com.rule64.ma.accountlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ma.R;

public class AccountListFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    public static AccountListFragment newInstance(){
        return new AccountListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account_list,null);

        recyclerView = (RecyclerView) view.findViewById(R.id.accountListView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new AccountListAdapter();

        recyclerView.setAdapter(adapter);

        return view;
    }
}
