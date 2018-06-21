package com.pt.network;

import com.pt.entities.User;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class NetworkService {

    @Inject
    User user;
    private String url;

    @Inject
    public NetworkService(@Named("url") String url) {
        this.user = user;
        this.url = url;
    }

    public boolean login() {
        return (user != null) && (StringUtils.isNotEmpty(user.getFirstName()) && StringUtils.isNotEmpty(user.getLastName()));
    }
}
