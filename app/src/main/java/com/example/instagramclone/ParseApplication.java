package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MEtZLJUNvVapP3wa82u5SafsoKUqYc1LFjGN4VCh")
                .clientKey("CbcinW0CB0VBOnTPTel5SGgXPfzeD1GY4WgHWNWR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
