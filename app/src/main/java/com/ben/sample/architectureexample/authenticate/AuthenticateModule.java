package com.ben.sample.architectureexample.authenticate;

import com.ben.sample.architectureexample.activities.common.ActivityScope;
import com.ben.sample.architectureexample.config.App;

import dagger.Module;
import dagger.Provides;

/**
 * The {@link AuthenticateManagerImpl} {@link dagger.Module}
 */
@Module
public class AuthenticateModule {

    @ActivityScope
    @Provides
    AuthenticateManagerImpl provideAuthenticateManager(App app){
        return new AuthenticateManagerImpl(app);
    }

}
