package com.elhalili.exam_android.presentation.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.elhalili.exam_android.R;
import com.elhalili.exam_android.models.User;
import com.elhalili.exam_android.presentation.actions.SignInAction;
import com.elhalili.exam_android.presentation.actions.SwitchToSignUpAction;

public class LoginActivity extends AppCompatActivity {

    EditText emailEditText;
    EditText passwordEditText;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView signUpTextView = findViewById(R.id.sign_up_textView);
        emailEditText = findViewById(R.id.email_editText);
        passwordEditText = findViewById(R.id.editTextTextPassword);
        loginBtn = findViewById(R.id.login_button);
        signUpTextView.setOnClickListener(new SwitchToSignUpAction(this));
        loginBtn.setOnClickListener(new SignInAction(this));

        User user = (User) getIntent().getSerializableExtra("user");
        if (user != null) {
            emailEditText.setText(user.getEmail());
        }
    }
    public String getEmail() {
        return emailEditText.getText().toString();
    }

    public String getPassword() {
        return passwordEditText.getText().toString();
    }
}