package com.example.csi_app;

import android.support.v7.app.AppCompatActivity;
import java.util.LinkedList;

public  class User extends AppCompatActivity {  //has to be abstract? if not working change to abstract


    LinkedList<User> accounts = new LinkedList<User>();

    String email_address;
    String username;
    String security_question;
    String security_answer;
    //add QR code variable here and change constructors

    public User(String username, String security_question, String security_answer, String email_address)
    {
        this.email_address = email_address;
        this.username = username;
        this.security_question = security_question;
        this.security_answer = security_answer;
    }

    public User()
    {
        email_address = null;
        username = null;
        security_answer = null;
        security_question = null;
    }









}
