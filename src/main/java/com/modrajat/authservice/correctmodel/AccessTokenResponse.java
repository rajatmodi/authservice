package com.modrajat.authservice.correctmodel;

/**
 * HTTP/1.1 200 OK
 *      Content-Type: application/json;charset=UTF-8
 *      Cache-Control: no-store
 *      Pragma: no-cache
 *
 *      {
 *        "access_token":"2YotnFZFEjr1zCsicMWpAA",
 *        "token_type":"example",
 *        "expires_in":3600,
 *        "refresh_token":"tGzv3JOkF0XG5Qx2TlKWIA",
 *        "example_parameter":"example_value"
 *      }
 *
 *
 *
 */
public class AccessTokenResponse {

    String access_token;
    String token_type;
    String expires_in;
    String refresh_token;
    Object scope;
}
