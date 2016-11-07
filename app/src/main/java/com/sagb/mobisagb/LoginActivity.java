package com.sagb.mobisagb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = (Button) findViewById(R.id.connexion_btn);
        usernameEditText = (EditText) findViewById(R.id.username_et);
        passwordEditText = (EditText) findViewById(R.id.password_et);

        loginBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        boolean isError = false;

        if(TextUtils.isEmpty(username)){
            usernameEditText.setError(getString(R.string.champ_obligatoir));
            isError = true;
        }

        if (TextUtils.isEmpty(password)){
            passwordEditText.setError(getString(R.string.champ_obligatoir));
            isError = true;
        }

        if (!isError) {
            Intent intent = new Intent(getApplicationContext(),MainSAGBActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
