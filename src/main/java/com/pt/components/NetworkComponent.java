package com.pt.components;

import com.pt.modules.NetworkModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = NetworkModule.class)
public interface NetworkComponent {
}
