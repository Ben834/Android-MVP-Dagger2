package com.ben.sample.architectureexample.activities.login;

import com.ben.sample.architectureexample.authenticate.AuthenticateManagerImpl;

/**
 * A {@link LoginPresenter} implementation for the login process. Currently associated with the {@link LoginActivity}
 */
public class LoginPresenterImpl implements LoginPresenter {


    /**
     * The implementation of the {@link LoginViewContract} interface in order to interact back with the view
     */
    private LoginViewContract loginViewContract;

    /**
     * The {@link AuthenticateManagerImpl} used for logging in
     */
    private AuthenticateManagerImpl authenticateManagerImpl;

    /**
     * Constructor
     * @param loginViewContract : An implementation of the {@link LoginViewContract} interface
     * @param authenticateManagerImpl : The {@link AuthenticateManagerImpl} used for logging in
     */
    public LoginPresenterImpl(LoginViewContract loginViewContract, AuthenticateManagerImpl authenticateManagerImpl){
        this.loginViewContract = loginViewContract;
        this.authenticateManagerImpl = authenticateManagerImpl;
    }

    /**
     * Launches the login process
     */
    @Override
    public void login(){

        //Launch the login process
        authenticateManagerImpl.loginUser();

        //As it is a fake login, we directly send a success here for testing purposes
        loginViewContract.loginSucceed();

     }

}
