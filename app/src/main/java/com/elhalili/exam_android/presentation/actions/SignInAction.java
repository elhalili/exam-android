package com.elhalili.exam_android.presentation.actions;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.elhalili.exam_android.MyContext;
import com.elhalili.exam_android.models.User;
import com.elhalili.exam_android.presentation.views.HelloActivity;
import com.elhalili.exam_android.presentation.views.LoginActivity;

public class SignInAction implements View.OnClickListener {
    private Activity activity;
    public SignInAction(Activity activity) {
        this.activity = activity;
    }
    @Override
    public void onClick(View view) {
        LoginActivity loginActivity = (LoginActivity) activity;

        String email = loginActivity.getEmail();
        String psw = loginActivity.getPassword();

        try {
            if (email.isBlank()) throw new Exception("email is required");
            else if (psw.isBlank()) throw new Exception("password is required");

            User user = ((MyContext) activity.getApplicationContext()).getServices().searchUserByEmail(email);

            if (user == null) throw new Exception("user is not exist");
            else if (!user.getPassword().equals(psw)) throw new Exception("password is wrong");

            Intent intent = new Intent(activity, HelloActivity.class);
            intent.putExtra("user", user);
            activity.startActivity(intent);
            activity.finish();
        } catch (Exception exception) {
            Toast toast = Toast.makeText(activity.getApplicationContext(), exception.getMessage(), Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
