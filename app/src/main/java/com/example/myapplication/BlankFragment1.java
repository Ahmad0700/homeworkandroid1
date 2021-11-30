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
import android.widget.EditText;
import android.widget.FrameLayout;

import com.google.android.material.textfield.TextInputEditText;


public class BlankFragment1 extends Fragment {

    private EditText email;
    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn = view.findViewById(R.id.newt);
        email = view.findViewById(R.id.infho);

        logic();
    }

    private void logic() {
        btn.setOnClickListener(v -> {
            BlankFragment2 fragment2 = new BlankFragment2();
            Bundle bundle = new Bundle();
            bundle.putString("key3", email.getText().toString());
            fragment2.setArguments(bundle);
            FragmentTransaction ft = getParentFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, fragment2);
            ft.commit();
        });
    }

}