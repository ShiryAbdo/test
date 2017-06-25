package com.example.shaymaa.uicompany.activites;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.shaymaa.uicompany.R;

public class loginCompany extends AppCompatActivity {
    TextView forget_password ,acount_new;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_login );

        forget_password = (TextView)findViewById(R.id.forgetpassword);
        acount_new=(TextView)findViewById(R.id.acount_new);
        forget_password.setPaintFlags(forget_password.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        acount_new.setPaintFlags(acount_new.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }
}
