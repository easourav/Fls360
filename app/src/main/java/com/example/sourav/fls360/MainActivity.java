package com.example.sourav.fls360;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sourav.fls360.Fragments.HomeFragment;
import com.example.sourav.fls360.Fragments.LoginFragment;
import com.example.sourav.fls360.Fragments.RegistationFragment;

public class MainActivity extends AppCompatActivity implements LoginFragment.OnLoginFromActivityListener {
    public PrefConfig prefConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prefConfig =new PrefConfig(this);

        if (findViewById(R.id.contenerViwe)!=null)
        {
            if (savedInstanceState!=null)
            {
                return;
            }
            if (prefConfig.readLofinStatus())
            {
                getSupportFragmentManager().beginTransaction().add(R.id.contenerViwe,new HomeFragment()).commit();
            }
            else {
                getSupportFragmentManager().beginTransaction().add(R.id.contenerViwe,new LoginFragment()).commit();
            }
        }
    }

    @Override
    public void performRegister() {
        getSupportFragmentManager().beginTransaction().replace(R.id.contenerViwe, new RegistationFragment()).addToBackStack(null).commit();
    }

    @Override
    public void performLogin(String name) {

    }
}
