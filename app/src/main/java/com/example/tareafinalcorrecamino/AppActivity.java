package com.example.tareafinalcorrecamino;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

import com.example.tareafinalcorrecamino.databinding.ActivityAppBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AppActivity extends AppCompatActivity {
 ActivityAppBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);





        getSupportActionBar().hide();

        binding = ActivityAppBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new TramitesFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.entrar:
                    replaceFragment(new LoginFragment());
                    break;
                case R.id.mas:
                    replaceFragment(new MasFragment());
                    break;
                case R.id.tramites:
                    replaceFragment(new TramitesFragment());
            }

            return true;
        });

//        aSwitch.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (!(aSwitch.isChecked())) {
//                    aSwitch.setText("jhejfhjd");
//                }
////                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
////                else
////                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//
//            }
//        });
//        switcher.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (switcher.isChecked())
//            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//                else
//            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//
//            }
//        });

    }




        private void replaceFragment(Fragment fragment){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame_layout,fragment);
            fragmentTransaction.commit();
        }



//    public void onSwitchClick(View view) {
//        if (switcher.isChecked())
//            switcher.setText("hola");
////            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
////                else
////            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//    }
//
//        bottomNavigationView = findViewById(R.id.bottomNavigationView);
//        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener(){
//
//            @Override
//            public boolean onNavigationItemSelected(MenuItem item) {
//                Fragment selectedFragment = null;
//                switch (item.getItemId()){
//                    case R.id.entrar:selectedFragment= new LoginFragment();
//                        break;
//                }
////        getSupportFragmentManager().beginTransaction().replace(selectedFragment).commit();
//                return false;
//            }
//
//
//
//        });
    }
