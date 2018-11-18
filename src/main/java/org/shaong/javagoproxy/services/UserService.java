package org.shaong.javagoproxy.services;

import lombok.extern.slf4j.Slf4j;
import org.shaong.javagoproxy.models.UserData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Slf4j
@Service
public class UserService {
    @Value("${go-proxy-url}")
    private String baseUrl;

    public Optional<UserData> getUserData(Integer userId) {
        String url = baseUrl + "user/" + userId;

        RestTemplate restTemplate = new RestTemplate();

        UserData userData = restTemplate.getForObject(url, UserData.class);

        return Optional.of(userData);
    }
}
