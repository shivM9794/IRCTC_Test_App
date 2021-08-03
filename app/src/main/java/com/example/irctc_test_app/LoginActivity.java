package com.example.irctc_test_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    Button button;
    TextInputEditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = findViewById(R.id.login);
        username = findViewById(R.id.text_user_field);
        password = findViewById(R.id.textInputEditText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });
    }
}

//    private boolean CheckAllFields() {
//        if (username.length() == 0) {
//            username.setError("This field is required");
//            return false;
//        }
//
//
//        if (password.length() == 0) {
//            password.setError("Password is required");
//            return false;
//        } else if (password.length() < 8) {
//            password.setError("Password must be minimum 8 characters");
//            return false;
//        }
//
//        // after all validation return true.
//        return true;
