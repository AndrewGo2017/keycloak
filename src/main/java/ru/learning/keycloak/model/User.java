package ru.learning.keycloak.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String id;

    private String name;

    public String toJsonString() {
        return "{" +
                "\"id\":\"" + id + '\"' +
                ",\"name\":\"" + name + '\"' +
                '}';
    }
}

