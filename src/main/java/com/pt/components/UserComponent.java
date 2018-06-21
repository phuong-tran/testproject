package com.pt.components;

import com.pt.entities.User;
import com.pt.modules.UserModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {UserModule.class})
public interface UserComponent {
    User getUser();
}
