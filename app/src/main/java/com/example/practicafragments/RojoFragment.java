package com.example.practicafragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RojoFragment extends Fragment {

    private TextView fragmentRojoTextView;


    public RojoFragment() {
        //vacio
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View vistaDelFragment = inflater.inflate(R.layout.fragment_rojo, container, false);

        fragmentRojoTextView = vistaDelFragment.findViewById(R.id.fragmentRojoTextView);

        fragmentRojoTextView.setText("hola soy el fragmento rojo");


        return vistaDelFragment;
    }
}
