package com.pt.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideNetworUrlFactory implements Factory<String> {
  private final NetworkModule module;

  public NetworkModule_ProvideNetworUrlFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideInstance(module);
  }

  public static String provideInstance(NetworkModule module) {
    return proxyProvideNetworUrl(module);
  }

  public static NetworkModule_ProvideNetworUrlFactory create(NetworkModule module) {
    return new NetworkModule_ProvideNetworUrlFactory(module);
  }

  public static String proxyProvideNetworUrl(NetworkModule instance) {
    return Preconditions.checkNotNull(
        instance.provideNetworUrl(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
