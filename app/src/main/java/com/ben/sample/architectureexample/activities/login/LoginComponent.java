package com.ben.sample.architectureexample.activities.login;

import com.ben.sample.architectureexample.activities.common.ActivityScope;
import com.ben.sample.architectureexample.authenticate.AuthenticateModule;
import com.ben.sample.architectureexample.config.AppComponent;

import dagger.Component;

/**
 * The {@link dagger.Component} for the {@link LoginActivity}
 */

@ActivityScope
@Component(
        dependencies = {
                AppComponent.class
        },
        modules = {
                LoginModule.class,
                AuthenticateModule.class
        }
)
public interface LoginComponent {

    //This component is only linked to the LoginActivity
    void inject(LoginActivity loginActivity);

    //We provide the store presenter
    LoginPresenterImpl provideLoginPresenter();


}
