package com.elhalili.exam_android.presentation.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.elhalili.exam_android.R;
import com.elhalili.exam_android.presentation.actions.SignUpAction;
import com.elhalili.exam_android.presentation.actions.SwitchToSignInAction;

public class RegisterActivity extends AppCompatActivity {
    private EditText fullNameEditText;
    private EditText phoneEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText confirmedPasswordEditText;
    private Button registerBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullNameEditText = findViewById(R.id.fullName_editText);
        phoneEditText = findViewById(R.id.phone_editText);
        emailEditText = findViewById(R.id.email_sign_up_editText);
        passwordEditText = findViewById(R.id.psw_editText);
        confirmedPasswordEditText = findViewById(R.id.confirm_psw_editText);
        registerBtn = findViewById(R.id.button);

        TextView signInTextView = findViewById(R.id.signin_textView);
        signInTextView.setOnClickListener(new SwitchToSignInAction(this));
        registerBtn.setOnClickListener(new SignUpAction(this));
    }

    public String getName() {
        return fullNameEditText.getText().toString();
    }

    public String getPhone() {
        return phoneEditText.getText().toString();
    }

    public String getEmail() {
        return emailEditText.getText().toString();
    }

    public String getPassword() {
        return passwordEditText.getText().toString();
    }

    public String getConfirmedPassword() {
        return confirmedPasswordEditText.getText().toString();
    }
}