package com.modrajat.authservice.correctmodel;

/**
 * From Client to Authentication Server
 *
 * Sample Request (Client User Agent is redirected)
 * GET /authorize?response_type=code&client_id=s6BhdRkqt3&state=xyz
 *         &redirect_uri=https%3A%2F%2Fclient%2Eexample%2Ecom%2Fcb HTTP/1.1
 *    Host: server.example.com
 */
public class AuthenticationRequest {
    //code or token
    String response_type;
    String client_id;
    String redirect_url;
    Object scope;
    //to avoid cross-site scripting somehow
    String state;

}
