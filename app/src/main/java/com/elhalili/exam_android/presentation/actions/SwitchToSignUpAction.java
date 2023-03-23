package com.elhalili.exam_android.presentation.actions;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import com.elhalili.exam_android.presentation.views.RegisterActivity;

public class SwitchToSignUpAction implements View.OnClickListener {
    private Activity activity;
    public SwitchToSignUpAction(Activity activity) {
        this.activity = activity;
    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(activity, RegisterActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }
}
