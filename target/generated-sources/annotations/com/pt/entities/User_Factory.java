package com.pt.entities;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class User_Factory implements Factory<User> {
  private final Provider<String> firstNameProvider;

  private final Provider<String> lastNameProvider;

  public User_Factory(Provider<String> firstNameProvider, Provider<String> lastNameProvider) {
    this.firstNameProvider = firstNameProvider;
    this.lastNameProvider = lastNameProvider;
  }

  @Override
  public User get() {
    return provideInstance(firstNameProvider, lastNameProvider);
  }

  public static User provideInstance(
      Provider<String> firstNameProvider, Provider<String> lastNameProvider) {
    return new User(firstNameProvider.get(), lastNameProvider.get());
  }

  public static User_Factory create(
      Provider<String> firstNameProvider, Provider<String> lastNameProvider) {
    return new User_Factory(firstNameProvider, lastNameProvider);
  }

  public static User newUser(String firstName, String lastName) {
    return new User(firstName, lastName);
  }
}
