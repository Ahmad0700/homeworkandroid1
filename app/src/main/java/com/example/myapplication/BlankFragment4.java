package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class BlankFragment4 extends Fragment {

    private Button btn;
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank4, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initi(view);
        ijin();
    }
    private void initi(View view) {
        textView = view.findViewById(R.id.textv3);

        btn = view.findViewById(R.id.newt);
        if (getArguments().getString("key5") != null ){
            textView.setText(getArguments().getString("key5"));
        }
    }
    private  void ijin(){
        btn.setOnClickListener(v -> {
            BlankFragment5 fragment5 = new BlankFragment5();
            FragmentTransaction ft = getParentFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, fragment5);
            Bundle bundle = new Bundle();
            bundle.putString("key6", textView.getText().toString());
            ft.replace(R.id.fragment_container, fragment5);
            fragment5.setArguments(bundle);
            ft.commit();
        });
    }
}