package com.pt.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserModule_ProvideDefaultLastNameFactory implements Factory<String> {
  private final UserModule module;

  public UserModule_ProvideDefaultLastNameFactory(UserModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideInstance(module);
  }

  public static String provideInstance(UserModule module) {
    return proxyProvideDefaultLastName(module);
  }

  public static UserModule_ProvideDefaultLastNameFactory create(UserModule module) {
    return new UserModule_ProvideDefaultLastNameFactory(module);
  }

  public static String proxyProvideDefaultLastName(UserModule instance) {
    return Preconditions.checkNotNull(
        instance.provideDefaultLastName(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
