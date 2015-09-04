package com.ben.sample.architectureexample.authenticate;

import com.ben.sample.architectureexample.config.App;

/**
 * A {@link AuthenticateManager} implementation for the authenticate process
 */
public class AuthenticateManagerImpl implements AuthenticateManager {

    /**
     * The {@link android.app.Application} context
     */
    private App app;

    /**
     * Constructor
     *
     * @param app : The {@link android.app.Application} context
     */
    public AuthenticateManagerImpl(App app){
        this.app = app;
    }

    @Override
    public void loginUser() {
        //TODO: Log the user using the API you want
    }
}
