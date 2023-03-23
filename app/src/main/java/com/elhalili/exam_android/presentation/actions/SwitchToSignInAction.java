package com.elhalili.exam_android.presentation.actions;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import com.elhalili.exam_android.presentation.views.LoginActivity;

public class SwitchToSignInAction implements View.OnClickListener {
    private Activity activity;
    public SwitchToSignInAction(Activity activity) {
        this.activity = activity;
    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(activity, LoginActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }
}
