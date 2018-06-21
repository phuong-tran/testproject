package com.pt.modules;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class NetworkModule {

    @Provides
    @Named("url")
    public String provideNetworUrl() {
        return "http://localhost:8080/admin";
    }
}
