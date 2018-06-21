package com.pt.components;

import com.pt.entities.User;
import com.pt.entities.User_Factory;
import com.pt.modules.UserModule;
import com.pt.modules.UserModule_ProvideDefaultFirstNameFactory;
import com.pt.modules.UserModule_ProvideDefaultLastNameFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerUserComponent implements UserComponent {
  private UserModule_ProvideDefaultFirstNameFactory provideDefaultFirstNameProvider;

  private UserModule_ProvideDefaultLastNameFactory provideDefaultLastNameProvider;

  private Provider<User> userProvider;

  private DaggerUserComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static UserComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideDefaultFirstNameProvider =
        UserModule_ProvideDefaultFirstNameFactory.create(builder.userModule);
    this.provideDefaultLastNameProvider =
        UserModule_ProvideDefaultLastNameFactory.create(builder.userModule);
    this.userProvider =
        DoubleCheck.provider(
            User_Factory.create(provideDefaultFirstNameProvider, provideDefaultLastNameProvider));
  }

  @Override
  public User getUser() {
    return userProvider.get();
  }

  public static final class Builder {
    private UserModule userModule;

    private Builder() {}

    public UserComponent build() {
      if (userModule == null) {
        this.userModule = new UserModule();
      }
      return new DaggerUserComponent(this);
    }

    public Builder userModule(UserModule userModule) {
      this.userModule = Preconditions.checkNotNull(userModule);
      return this;
    }
  }
}
