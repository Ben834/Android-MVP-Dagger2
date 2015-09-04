package com.ben.sample.architectureexample.activities.login;

import com.ben.sample.architectureexample.activities.common.ActivityScope;
import com.ben.sample.architectureexample.authenticate.AuthenticateManagerImpl;

import dagger.Module;
import dagger.Provides;

/**
 * The {@link dagger.Module} for the {@link LoginActivity}
 */
@Module
public class LoginModule {

    /**
     * An implementation of the {@link LoginViewContract} interface
     */
    private LoginViewContract loginViewContract;

    /**
     * Constructor
     * @param loginViewContract : An implementation of the {@link LoginViewContract} interface
     */
    public LoginModule(LoginViewContract loginViewContract){
        this.loginViewContract = loginViewContract;
    }

    @Provides
    @ActivityScope
    LoginViewContract provideloginViewContract(){
        return loginViewContract;
    }

    /**
     * Provides a {@link LoginPresenterImpl}
     * @see LoginPresenterImpl#LoginPresenterImpl(LoginViewContract, AuthenticateManagerImpl)
     */
    @Provides
    @ActivityScope
    public LoginPresenterImpl provideLoginPresenter(LoginViewContract loginViewContract, AuthenticateManagerImpl authenticateManagerImpl){
        return new LoginPresenterImpl(loginViewContract, authenticateManagerImpl);
    }

}
