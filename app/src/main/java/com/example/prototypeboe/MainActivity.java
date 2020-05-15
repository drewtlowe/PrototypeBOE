package com.example.prototypeboe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.prototypeboe.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_Login = (Button) findViewById(R.id.button_LogIn);
        button_Login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button_LogIn:
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                break;
        }
    }
}
