package com.pt.network;

import com.pt.entities.User;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkService_MembersInjector implements MembersInjector<NetworkService> {
  private final Provider<User> userProvider;

  public NetworkService_MembersInjector(Provider<User> userProvider) {
    this.userProvider = userProvider;
  }

  public static MembersInjector<NetworkService> create(Provider<User> userProvider) {
    return new NetworkService_MembersInjector(userProvider);
  }

  @Override
  public void injectMembers(NetworkService instance) {
    injectUser(instance, userProvider.get());
  }

  public static void injectUser(NetworkService instance, User user) {
    instance.user = user;
  }
}
