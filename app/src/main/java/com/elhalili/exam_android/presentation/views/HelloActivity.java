package com.elhalili.exam_android.presentation.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.elhalili.exam_android.R;
import com.elhalili.exam_android.models.User;

public class HelloActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        textView = findViewById(R.id.hello_textView);
        User user = (User) getIntent().getSerializableExtra("user");

        textView.setText("Hello " + user.getFulName());
    }
}