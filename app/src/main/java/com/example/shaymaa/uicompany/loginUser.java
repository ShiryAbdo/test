package com.example.shaymaa.uicompany;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class loginUser extends AppCompatActivity {
    EditText email ,password ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_company);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.paspassword);
        email.getBackground().clearColorFilter();
        password.getBackground().clearColorFilter();

    }
}