package org.wikipedia.useroption.ui;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import org.wikipedia.activity.SingleFragmentActivity;
import org.wikipedia.activity.FragmentCallback;

public class UserOptionRowActivity extends SingleFragmentActivity<UserOptionRowFragment>
        implements FragmentCallback {
    public static Intent newIntent(@NonNull Context context) {
        return new Intent().setClass(context, UserOptionRowActivity.class);
    }

    @Override
    protected UserOptionRowFragment createFragment() {
        return UserOptionRowFragment.newInstance();
    }

    @Override
    protected void setTheme() {
        setActionBarTheme();
    }
}