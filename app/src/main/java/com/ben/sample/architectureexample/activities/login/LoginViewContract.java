package com.ben.sample.architectureexample.activities.login;

/**
 * The interface allowing us to decouple the {@link LoginPresenterImpl} from the {@link android.view.View} which
 * implements it.
 * The view using the {@link LoginPresenterImpl} would implement this interface and passes it to the
 * {@link LoginPresenterImpl} constructor
 */
public interface LoginViewContract {

    /**
     * Indicates the view to show an error to the user
     * @param message : the error message
     */
    void showError(String message);

    /**
     * Indicates the view that the login process succeeded
     */
    void loginSucceed();
}
