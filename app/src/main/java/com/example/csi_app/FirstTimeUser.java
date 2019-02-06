package com.example.csi_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;

public class FirstTimeUser extends User {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_time_user);
    }

    public void createUser(View view)
    {
        int[] edit_text_ids = new int[]{R.id.editText1, R.id.editText2, R.id.editText3, R.id.editText4};

        for(int i = 0; i<4; i++)
        {
            EditText et = (EditText) findViewById(edit_text_ids[i]);
            String a = et.getText().toString();
            if(isEmpty(a))
            {
                Context context = getApplicationContext();
                Toast empty_field_error = Toast.makeText(context, "One or more fields are empty", Toast.LENGTH_LONG);

                break;
            }

        }




    }

    public boolean isEmpty(String s)
    {
        return s.equals("");
    }



}
