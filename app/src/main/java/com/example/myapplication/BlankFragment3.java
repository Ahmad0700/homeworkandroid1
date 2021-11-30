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

public class BlankFragment3 extends Fragment {

    private TextView textView;

    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initi(view);
        ijin();
    }
    private void initi(View view) {
        textView = view.findViewById(R.id.textv2);
        btn = view.findViewById(R.id.newt);
        if (getArguments().getString("key4") != null ){
            textView.setText(getArguments().getString("key4"));
        }
    }
    private  void ijin(){
        btn.setOnClickListener(v -> {
            BlankFragment4 fragment4 = new BlankFragment4();
            FragmentTransaction ft = getParentFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, fragment4);
            Bundle bundle = new Bundle();
            bundle.putString("key5", textView.getText().toString());
            ft.replace(R.id.fragment_container, fragment4);
            fragment4.setArguments(bundle);
            ft.commit();
        });
    }
}