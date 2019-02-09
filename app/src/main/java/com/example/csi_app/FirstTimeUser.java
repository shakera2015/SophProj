package com.example.csi_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;
import android.widget.Button;
import android.view.View.*;

import java.util.LinkedList;

public class FirstTimeUser extends AppCompatActivity {




    int[] edit_text_ids = new int[]{R.id.editText1, R.id.editText2, R.id.editText3, R.id.editText4};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_time_user);
    }

    public void tryCreateUser(View v)
    {

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {


                if (checkEmpty()) {
                    Context context = getApplicationContext();
                    Toast empty_field_error = Toast.makeText(context, "One or more fields are empty", Toast.LENGTH_LONG);
                } else if (sameUsername()) {
                    Context context = getApplicationContext();
                    Toast same_name_error = Toast.makeText(context, "Username already taken.", Toast.LENGTH_LONG);
                } else {
                    EditText e0 = (EditText) findViewById(edit_text_ids[0]);
                    String usn = e0.getText().toString();

                    EditText e1 = (EditText) findViewById(edit_text_ids[1]);
                    String securityQuestion = e1.getText().toString();

                    EditText e2 = (EditText) findViewById(edit_text_ids[2]);
                    String securityAnswer = e2.getText().toString();

                    EditText e3 = (EditText) findViewById(edit_text_ids[3]);
                    String emailAddress = e3.getText().toString();

                    User u = new User(usn, securityQuestion, securityAnswer, emailAddress);
                    User.accounts.add(u);

                    startActivity(new Intent(FirstTimeUser.this, newUserConfirm.class));


                }

            }
        });
    }

    public boolean checkEmpty()
    {

        boolean track = false;
        for(int i = 0; i<4; i++)
        {
            EditText et = (EditText) findViewById(edit_text_ids[i]);
            String a = et.getText().toString();
            if(a.equals(""))
            {

                track = true;
                break;
            }

        }
        return track;
    }

    public boolean sameUsername()
    {
        String proposedUsername;
        EditText t = (EditText) findViewById(edit_text_ids[0]);
        proposedUsername = t.getText().toString();
        boolean same = false;

        for(User temp : User.accounts)
        {

            if((temp.username).equals(proposedUsername))
            {

                same = true;
                break;
            }


        }

        return same;

    }

   /* public void createUser(View view)
    {
        openCreateUser();
    }

    public void openCreateUser()
    {
        Intent intent = new Intent(this,newUserConfirm.class);
        startActivity(intent);
    }

*/





}
