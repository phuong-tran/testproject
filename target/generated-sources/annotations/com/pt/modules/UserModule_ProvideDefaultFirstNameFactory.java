package com.pt.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserModule_ProvideDefaultFirstNameFactory implements Factory<String> {
  private final UserModule module;

  public UserModule_ProvideDefaultFirstNameFactory(UserModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideInstance(module);
  }

  public static String provideInstance(UserModule module) {
    return proxyProvideDefaultFirstName(module);
  }

  public static UserModule_ProvideDefaultFirstNameFactory create(UserModule module) {
    return new UserModule_ProvideDefaultFirstNameFactory(module);
  }

  public static String proxyProvideDefaultFirstName(UserModule instance) {
    return Preconditions.checkNotNull(
        instance.provideDefaultFirstName(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
