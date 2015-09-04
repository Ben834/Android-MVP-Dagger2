package com.ben.sample.architectureexample.config;

import javax.inject.Singleton;

import dagger.Component;

/**
 * The {@link App} {@link dagger.Component}
 */

@Singleton
@Component(
        modules = {
                AppModule.class
        }
)
public interface AppComponent {

    //Injections
    void inject(App app);

    App provideApp();
}
