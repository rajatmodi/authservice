package com.modrajat.authservice;

import com.modrajat.authservice.model.GetAccessTokenRequest;
import com.modrajat.authservice.model.GetAccessTokenResponse;
import com.modrajat.authservice.model.AuthorizationGrantRequest;
import com.modrajat.authservice.model.RegisteredClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationServer {

    public static void validateGrantRequest(AuthorizationGrantRequest request){
        RegisteredClient client = new RegisteredClient();
        if (!client.getClientId().equals(request.getClientId())
                || !client.getRedirectURL().equals(request.getRedirectUrl())){
            throw new IllegalArgumentException("Request from a bad client");
        }
    }

    public static void validateAccessToken(String accessToken){
        if(!accessToken.equals("blablabla")){
            throw new IllegalArgumentException("Invalid Access Token");
        }
    }


    @GetMapping("/getAccessToken/{authorizationCode}")
    public GetAccessTokenResponse getAccessToken(@PathVariable String authorizationCode){
        GetAccessTokenRequest request = GetAccessTokenRequest.builder()
                .authorizationCode(authorizationCode)
                .build();
        validateAuthorizationCode(request);
        return GetAccessTokenResponse
                .builder()
                .accessToken(generateAccessToken())
                .build();
    }

    private void validateAuthorizationCode(GetAccessTokenRequest request){
        if(!request.getAuthorizationCode().equals("bro")){
          throw new IllegalArgumentException("Bad Auth Code.");
        }
    }

    private String generateAccessToken(){
        return "blablabla";
    }


}
