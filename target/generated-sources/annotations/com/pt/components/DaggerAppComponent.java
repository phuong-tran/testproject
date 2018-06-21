package com.pt.components;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.pt.app.Main;
import com.pt.app.Main_MembersInjector;
import com.pt.entities.User;
import com.pt.entities.User_Factory;
import com.pt.modules.AppModule;
import com.pt.modules.NetworkModule;
import com.pt.modules.NetworkModule_ProvideNetworUrlFactory;
import com.pt.modules.UserModule;
import com.pt.modules.UserModule_ProvideDefaultFirstNameFactory;
import com.pt.modules.UserModule_ProvideDefaultLastNameFactory;
import com.pt.network.NetworkService;
import com.pt.network.NetworkService_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private NetworkModule_ProvideNetworUrlFactory provideNetworUrlProvider;

  private UserModule_ProvideDefaultFirstNameFactory provideDefaultFirstNameProvider;

  private UserModule_ProvideDefaultLastNameFactory provideDefaultLastNameProvider;

  private Provider<User> userProvider;

  private Provider<NetworkService> networkServiceProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideNetworUrlProvider =
        NetworkModule_ProvideNetworUrlFactory.create(builder.networkModule);
    this.provideDefaultFirstNameProvider =
        UserModule_ProvideDefaultFirstNameFactory.create(builder.userModule);
    this.provideDefaultLastNameProvider =
        UserModule_ProvideDefaultLastNameFactory.create(builder.userModule);
    this.userProvider =
        DoubleCheck.provider(
            User_Factory.create(provideDefaultFirstNameProvider, provideDefaultLastNameProvider));
    this.networkServiceProvider =
        DoubleCheck.provider(NetworkService_Factory.create(provideNetworUrlProvider, userProvider));
  }

  @Override
  public NetworkService getNetworkService() {
    return networkServiceProvider.get();
  }

  @Override
  public User getUser() {
    return userProvider.get();
  }

  @Override
  public void inject(Main main) {
    injectMain(main);
  }

  @CanIgnoreReturnValue
  private Main injectMain(Main instance) {
    Main_MembersInjector.injectNetworkService(instance, networkServiceProvider.get());
    return instance;
  }

  public static final class Builder {
    private NetworkModule networkModule;

    private UserModule userModule;

    private Builder() {}

    public AppComponent build() {
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (userModule == null) {
        this.userModule = new UserModule();
      }
      return new DaggerAppComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder userModule(UserModule userModule) {
      this.userModule = Preconditions.checkNotNull(userModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }
  }
}
