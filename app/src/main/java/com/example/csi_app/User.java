package com.example.csi_app;

import android.support.v7.app.AppCompatActivity;
import java.util.LinkedList;


public class User {  //has to be abstract? if not working change to abstract


    static LinkedList<User> accounts = new LinkedList<User>();

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

    public String getUsername()
    {
        return username;
    }

    public String getEmail_address()
    {
        return email_address;
    }

    public String getSecurity_question()
    {
        return security_question;
    }

    public String getSecurity_answer()
    {
        return security_answer;
    }

    public void setUsername(String s)
    {
        username = s;
    }

    public void setEmailAddress(String s)
    {
        email_address = s;
    }

    public void setSecurityQuestion(String s)
    {
        security_question = s;
    }

    public void setSecurityAnswer(String s)
    {
        security_answer = s;
    }

    public LinkedList<User> getAccounts()
    {
        return accounts;
    }









}
