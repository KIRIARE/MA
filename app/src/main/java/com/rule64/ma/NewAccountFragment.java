package com.rule64.ma;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ma.R;

public class NewAccountFragment extends Fragment {

    public static NewAccountFragment newInstance(){
        return new NewAccountFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_account,null);

        //만들기 버튼
        Button makeButton = (Button) view.findViewById(R.id.buttonMakeAccount);
        makeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //취소 버튼
        Button cancelButton = (Button) view.findViewById(R.id.buttonMakeAccountCancel);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //로그인 화면으로 이동
                ((MainActivity)getActivity()).replaceFragment(LoginFragment.newInstance());
            }
        });

        return view;
    }
}
