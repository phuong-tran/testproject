package com.pt.modules;

import com.pt.entities.User;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class UserModule {
    @Provides
    @Named(User.DEFAULT_FIRST_NAME)
    public String provideDefaultFirstName() {
        return "Phuong";
    }

    @Provides
    @Named(User.DEFAULT_LAST_NAME)
    public String provideDefaultLastName() {
        return "Tran";
    }

}
