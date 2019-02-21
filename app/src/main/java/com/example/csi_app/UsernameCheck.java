package com.example.csi_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;
import android.widget.ImageButton;


public class UsernameCheck extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username_check);
        ImageButton button = (ImageButton)findViewById(R.id.imageButton);
        button.setOnClickListener(this);
    }

    public void onClick(View view) {

        String usn;
        EditText t = (EditText) findViewById(R.id.editText6);
        usn = t.getText().toString();
        User u = searchUsn(usn);




        if(u != null) {

            startActivity(new Intent(UsernameCheck.this, ForgotPassword.class));
        }

        else{
            Context context = getApplicationContext();
            Toast unknown_usn = Toast.makeText(context, "Username not found.", Toast.LENGTH_LONG);
            unknown_usn.show();
        }
    }

    public User searchUsn(String s)
    {
        for(User temp: User.accounts)
        {
            boolean b = s.equalsIgnoreCase(temp.getUsername());
            if(b)
            {
                return temp;
            }
        }

        return null;


    }




}
