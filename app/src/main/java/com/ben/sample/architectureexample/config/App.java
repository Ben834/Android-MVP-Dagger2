package com.ben.sample.architectureexample.config;

import android.app.Application;
import android.content.Context;

/**
 * Our custom {@link Application} for the project.
 */
public class App extends Application {

    /**
     * The {@link App}
     */
    private AppComponent mAppComponent;


    @Override
    public void onCreate() {
        super.onCreate();

        //Dagger - Object graph creation
        setupGraph();

    }

    /**
     * Retrieves the {@link App} context
     * @param context : The {@link Context} from which we want to retrieve the application context
     *
     * @return : The {@link App}
     */
    public static App get(Context context){
        return (App) context.getApplicationContext();
    }

    /**
     * Set up the application graph. See {@link AppComponent}
     */
    private void setupGraph(){
        mAppComponent =  DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        mAppComponent.inject(this);
    }

    /**
     * A helper to provide appComponent to local components which depend on it
     * @return : The {@link #mAppComponent}
     */
    public AppComponent getEdjingAppComponent() {
        return mAppComponent;
    }
}
