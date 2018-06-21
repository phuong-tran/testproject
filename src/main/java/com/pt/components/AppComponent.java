package com.pt.components;

import com.pt.app.Main;
import com.pt.entities.User;
import com.pt.modules.AppModule;
import com.pt.network.NetworkService;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    NetworkService getNetworkService();
    User getUser();
    void inject(Main main);
}
