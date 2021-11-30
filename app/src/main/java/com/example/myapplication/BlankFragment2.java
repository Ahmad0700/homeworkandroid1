package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class BlankFragment2 extends Fragment {

    private Button btn;
    private TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initi(view);
        ijin();
    }
    private void initi(View view) {
        textView = view.findViewById(R.id.textv1);
        btn = view.findViewById(R.id.newt);
        if (getArguments().getString("key3") != null ){
            textView.setText(getArguments().getString("key3"));
        }

    }
    private  void ijin(){
        btn.setOnClickListener(v -> {
            BlankFragment3 fragment3 = new BlankFragment3();
            FragmentTransaction ft = getParentFragmentManager().beginTransaction();
            Bundle bundle = new Bundle();
            bundle.putString("key4", textView.getText().toString());
            ft.replace(R.id.fragment_container, fragment3);
            fragment3.setArguments(bundle);
            ft.commit();

        });
    }
}