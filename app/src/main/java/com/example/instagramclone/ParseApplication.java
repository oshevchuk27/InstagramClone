package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MEtZLJUNvVapP3wa82u5SafsoKUqYc1LFjGN4VCh")
                .clientKey("CbcinW0CB0VBOnTPTel5SGgXPfzeD1GY4WgHWNWR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
