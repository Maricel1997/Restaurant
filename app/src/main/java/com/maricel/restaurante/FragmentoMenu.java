package com.maricel.restaurante;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoMenu extends Fragment {
    View view;
    Button boton1;
    Button boton2;

    Button boton3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmento_menu, container, false);

        boton1 = (Button) view.findViewById(R.id.btn1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Disfrute el exquisito platillo que ofrece el restauran" +
                        "", Toast.LENGTH_SHORT).show();
            }
        });

//        Boton Dos
        boton2 = (Button) view.findViewById(R.id.btn2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Disfrute el exquisito platillo que ofrece el restaurant", Toast.LENGTH_SHORT).show();
            }
        });
        //Boton tres
        boton3 = (Button) view.findViewById(R.id.btn3);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Disfrute el delicioso Postre", Toast.LENGTH_SHORT).show();
            }
        });
//
        return view;
    }
}
