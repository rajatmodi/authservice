package com.modrajat.authservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SomeAPIRequest {
    private String accessToken;
}
