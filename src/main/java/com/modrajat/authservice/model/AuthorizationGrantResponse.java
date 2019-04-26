package com.modrajat.authservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthorizationGrantResponse {

    private String authorizationCode;
    private String clientId;
    private String redirectUrl;
}
