package com.modrajat.authservice.model;

import lombok.Data;

@Data
public class RegisteredClient {

    //Considered public
    private String clientId = "1";

    //Not to be shared
    private String clientSecret = "tinySecret";

    //Path to the API we want to protect
    private String redirectURL = "localhost:8080/someAPI";
}
