package com.ben.sample.architectureexample.activities.login;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.ben.sample.architectureexample.R;
import com.ben.sample.architectureexample.activities.common.BaseInjectedActivity;
import com.ben.sample.architectureexample.config.AppComponent;

import javax.inject.Inject;

/**
 * A simple {@link android.app.Activity} faking a Login process.
 *
 * The activity implements {@link LoginViewContract} in order to interact with the {@link LoginPresenterImpl}
 */
public class LoginActivity extends BaseInjectedActivity implements LoginViewContract, View.OnClickListener {

    private static final String TAG = LoginActivity.class.getName();

    /**
     * The injected {@link LoginPresenterImpl}
     */
    @Inject
    LoginPresenterImpl mLoginPresenterImpl;

    /**
     * The {@link LoginComponent} for this activity
     */
    LoginComponent loginComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(this);
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        loginComponent = DaggerLoginComponent.builder()
                .appComponent(appComponent)
                .loginModule(new LoginModule(this))
                .build();
        loginComponent.inject(this);
    }

    @Override
    protected void onDestroy() {
        loginComponent = null;
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        final int id = view.getId();
        if(id == R.id.login_button){
            mLoginPresenterImpl.login();
        }
    }

    @Override
    public void showError(String message) {
        //TODO: Show something to the user
    }

    @Override
    public void loginSucceed() {
        Log.d(TAG, "Login success");
        //TODO: Show something indicating that something
    }
}
