import com.pt.network.NetworkService;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Main_MembersInjector implements MembersInjector<Main> {
  private final Provider<NetworkService> networkServiceProvider;

  public Main_MembersInjector(Provider<NetworkService> networkServiceProvider) {
    this.networkServiceProvider = networkServiceProvider;
  }

  public static MembersInjector<Main> create(Provider<NetworkService> networkServiceProvider) {
    return new Main_MembersInjector(networkServiceProvider);
  }

  @Override
  public void injectMembers(Main instance) {
    injectNetworkService(instance, networkServiceProvider.get());
  }

  public static void injectNetworkService(Main instance, NetworkService networkService) {
    instance.networkService = networkService;
  }
}
