package com.example.csi_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.content.Intent;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void forgotPassword(View view) {

        openForgotPassword();


    }

    public void newUser(View view){
        openNewUser();
    }

    public void openForgotPassword(){

        Intent intent = new Intent(this,ForgotPassword.class);
        startActivity(intent);
    }

    public void openNewUser(){
        Intent i2 = new Intent(this, FirstTimeUser.class);
        startActivity(i2);
    }


}
