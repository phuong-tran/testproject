package com.pt.modules;

import dagger.Module;

@Module(includes = {UserModule.class, NetworkModule.class})
public class AppModule {
}
