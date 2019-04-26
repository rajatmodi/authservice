package com.modrajat.authservice.model;

import lombok.Data;

@Data
public class AuthorizationGrantRequest {
    private String userResponse;
    private String clientId;
    private String redirectUrl;
}
