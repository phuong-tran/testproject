package com.pt.components;

import com.pt.modules.NetworkModule;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerNetworkComponent implements NetworkComponent {
  private DaggerNetworkComponent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static NetworkComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {}

    public NetworkComponent build() {
      return new DaggerNetworkComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }
  }
}
