package com.example.practicafragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class AzulFragment extends Fragment {

    public AzulFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //se infla la vista de xml a view y se guarda en una variable local
        View view = inflater.inflate(R.layout.fragment_azul, container, false);

        //se retorna la view q se inflo
        return view;
    }
}
