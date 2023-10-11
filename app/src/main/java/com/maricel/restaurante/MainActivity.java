package com.maricel.restaurante;

import static android.widget.Toast.*;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout dLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activyty_main);
        setNavigationDrawer();
    }

    private void setNavigationDrawer(){
        dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navView;
        navView = (NavigationView) findViewById(R.id.navigation);

        navView.setNavigationItemSelectedListener( new NavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem){
                Fragment frag = null;
                int itemId = menuItem.getItemId();
                   if(itemId == R.id.mnuInicio){
                    frag = new FragmentoInicio();
                }else if(itemId == R.id.mnuMenu){
                    frag = new FragmentoMenu();
                }else if(itemId == R.id.mnuEvento){
                    frag = new FragmentoEvento();
                }

                makeText(getApplicationContext(), menuItem.getTitle(), LENGTH_SHORT).show();

                if(frag !=null){
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame, frag);
                    transaction.commit();
                    dLayout.closeDrawers();
                    return  true;
                }
                return false;
            }
        } );
    }

}