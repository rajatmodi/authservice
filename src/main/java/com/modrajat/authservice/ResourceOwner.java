package com.modrajat.authservice;

import com.modrajat.authservice.model.AuthorizationGrantRequest;
import com.modrajat.authservice.model.AuthorizationGrantResponse;
import com.modrajat.authservice.model.RegisteredClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.modrajat.authservice.AuthorizationServer.validateGrantRequest;

@RestController
public class ResourceOwner {

    @GetMapping("/requestAccess")
    public String requestAccess() {
        return "Do you want to Grant Access to this Client?";

    }

    @PostMapping("/requestAccess")
    public AuthorizationGrantResponse
    grantAccess(@RequestBody AuthorizationGrantRequest request) throws IllegalAccessException {
        validateGrantRequest(request);
        if (request.getUserResponse().equalsIgnoreCase("yes"))
            return AuthorizationGrantResponse
                    .builder()
                    //I think Authorization Service should issue the Auth Code.
                    .authorizationCode("bro")
                    .clientId(request.getClientId())
                    .redirectUrl(request.getRedirectUrl())
                    .build();

        //now the client has auth code.

        throw new IllegalAccessException("Access Denied");
    }


}
