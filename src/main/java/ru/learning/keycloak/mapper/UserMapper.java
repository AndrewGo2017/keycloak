package ru.learning.keycloak.mapper;

import org.keycloak.representations.AccessToken;
import org.springframework.stereotype.Component;
import ru.learning.keycloak.model.User;

@Component
public class UserMapper
{
    public User accessTokenToUserMapper(AccessToken accessToken)
    {
        return User.builder()
                .id(accessToken.getPreferredUsername())
                .name(accessToken.getName())
//                .sessionIds(new ArrayList())
//                .online(true)
//                .channels(new ArrayList())
//                .subChannels(new ArrayList())
                .build();
    }
}
