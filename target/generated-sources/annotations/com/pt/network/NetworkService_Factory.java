package com.pt.network;

import com.pt.entities.User;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkService_Factory implements Factory<NetworkService> {
  private final Provider<String> urlProvider;

  private final Provider<User> userProvider;

  public NetworkService_Factory(Provider<String> urlProvider, Provider<User> userProvider) {
    this.urlProvider = urlProvider;
    this.userProvider = userProvider;
  }

  @Override
  public NetworkService get() {
    return provideInstance(urlProvider, userProvider);
  }

  public static NetworkService provideInstance(
      Provider<String> urlProvider, Provider<User> userProvider) {
    NetworkService instance = new NetworkService(urlProvider.get());
    NetworkService_MembersInjector.injectUser(instance, userProvider.get());
    return instance;
  }

  public static NetworkService_Factory create(
      Provider<String> urlProvider, Provider<User> userProvider) {
    return new NetworkService_Factory(urlProvider, userProvider);
  }

  public static NetworkService newNetworkService(String url) {
    return new NetworkService(url);
  }
}
