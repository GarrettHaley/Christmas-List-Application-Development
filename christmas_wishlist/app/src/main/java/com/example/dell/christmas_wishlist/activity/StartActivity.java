package com.example.dell.christmas_wishlist.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.dell.christmas_wishlist.R;

public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        moveToSignUpPage();
        moveToLoginPage();
    }
    private void moveToSignUpPage(){
        Button nextButton = (Button) findViewById(R.id.signup_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                //  Toast.makeText(main_screen.this,"clicked 'launch second'", Toast.LENGTH_SHORT);
                Intent signUp = new Intent(StartActivity.this,RegisterActivity.class);
                startActivity(signUp);
            }
        });
    }
    private void moveToLoginPage(){
        Button nextButton = (Button) findViewById(R.id.login_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                //  Toast.makeText(main_screen.this,"clicked 'launch second'", Toast.LENGTH_SHORT);
                Intent login = new Intent(StartActivity.this,LoginActivity.class);
                startActivity(login);
            }
        });
    }
}
