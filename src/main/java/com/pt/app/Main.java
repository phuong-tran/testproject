package com.pt.app;

import com.pt.components.AppComponent;
import com.pt.components.DaggerAppComponent;
import com.pt.network.NetworkService;

import javax.inject.Inject;

public class Main {
    @Inject
    NetworkService networkService;

    private Main() {
        AppComponent component = DaggerAppComponent.builder().build();
        component.inject(this);
    }


    public static void main(String args[]) {

        Main main = new Main();
        System.out.println(main.networkService.login());

    }
}
