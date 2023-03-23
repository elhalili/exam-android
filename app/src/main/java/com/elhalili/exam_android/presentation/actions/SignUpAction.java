package com.elhalili.exam_android.presentation.actions;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.elhalili.exam_android.MyContext;
import com.elhalili.exam_android.business.Services;
import com.elhalili.exam_android.models.User;
import com.elhalili.exam_android.presentation.views.LoginActivity;
import com.elhalili.exam_android.presentation.views.RegisterActivity;

public class SignUpAction implements View.OnClickListener {
    private Activity activity;
    public SignUpAction(Activity activity) {
        this.activity = activity;
    }
    @Override
    public void onClick(View view) {
        RegisterActivity registerActivity = (RegisterActivity) activity;

        String name = registerActivity.getName();
        String phone = registerActivity.getPhone();
        String email = registerActivity.getEmail();
        String psw = registerActivity.getPassword();
        String confirmedPsw = registerActivity.getConfirmedPassword();

        try {
            if (name.isBlank()) throw new Exception("name is required !");
            else if (email.isBlank()) throw new Exception("email is required !");
            else if (phone.isBlank()) throw new Exception("phone is required !");
            else if (psw.isBlank()) throw new Exception("password is required !");
            else if (confirmedPsw.isBlank()) throw new Exception("password confirmation is required !");
            else if (!psw.equals(confirmedPsw)) throw new Exception("Not matched password !");

            Services services = ((MyContext) activity.getApplicationContext()).getServices();
            User user = services.register(name, Integer.parseInt(phone), email, psw);

            Intent intent = new Intent(activity, LoginActivity.class);
            intent.putExtra("user", user);
            activity.startActivity(intent);

        } catch (Exception exception) {
            Toast toast = Toast.makeText(activity.getApplicationContext(), exception.getMessage(), Toast.LENGTH_LONG);
            toast.show();
        }

    }
}
