package com.maricel.restaurante;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoEvento extends Fragment {

    View view;
    Button botonEventoReservar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmento_eventos, container, false);
        botonEventoReservar = (Button) view.findViewById(R.id.btnEvento);
        botonEventoReservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Reservando lugar...", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}