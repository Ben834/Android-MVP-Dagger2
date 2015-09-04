package com.ben.sample.architectureexample.config;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * The {@link App} {@link dagger.Module}
 */

@Module
public class AppModule {

    /**
     * The {@link App} instance
     */
    private App app;

    /**
     * Constructor
     *
     * @param app : The {@link App}
     */
    public AppModule(App app){
        this.app = app;
    }

    /**
     * Provides the {@link Application} context
     *
     * @return : The {@link App}
     */
    @Provides
    public App provideApplication(){
        return app;
    }

}
