package com.modrajat.authservice;

import com.modrajat.authservice.model.SomeAPIRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.modrajat.authservice.AuthorizationServer.validateAccessToken;

@RestController
public class ServerAPI {


    @GetMapping("/someAPI/{accessToken}")
    public String someAPI(@PathVariable String accessToken) {
        SomeAPIRequest request = SomeAPIRequest.builder()
                .accessToken(accessToken)
                .build();
        validateAccessToken(request.getAccessToken());
        return "Hi! You can now access 7 wonders of the world!";
    }
}
