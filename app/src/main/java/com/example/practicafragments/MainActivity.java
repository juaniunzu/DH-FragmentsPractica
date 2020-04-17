package com.example.practicafragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mainActivityButtonRojo;
    private Button mainActivityButtonVerde;
    private Button mainActivityButtonAzul;

    private void pegarFragment(Fragment fragmentAPegar){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.mainActivityFrameLayoutContainer, fragmentAPegar);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //la actividad arranca con un fragment rojo
        pegarFragment(new RojoFragment());

        this.mainActivityButtonRojo = findViewById(R.id.mainActivityButtonRojo);
        this.mainActivityButtonVerde = findViewById(R.id.mainActivityButtonVerde);
        this.mainActivityButtonAzul = findViewById(R.id.mainActivityButtonAzul);

        mainActivityButtonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pegarFragment(new RojoFragment());

            }
        });

        mainActivityButtonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pegarFragment(new VerdeFragment());

            }
        });

        mainActivityButtonAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creo el manager
                FragmentManager fragmentManager = getSupportFragmentManager();

                //creo la transaction pidiendosela al manager
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                //se le agrega a la transaction los layouts, primero el container y dps el fragment
                fragmentTransaction.add(R.id.mainActivityFrameLayoutContainer, new AzulFragment());

                //no se que hace esto
                fragmentTransaction.addToBackStack(null);

                //commiteo
                fragmentTransaction.commit();

            }
        });

    }


}
