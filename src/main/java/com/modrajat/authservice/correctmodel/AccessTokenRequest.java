package com.modrajat.authservice.correctmodel;

/**
 *  POST /token HTTP/1.1
 *      Host: server.example.com
 *      Authorization: Basic czZCaGRSa3F0MzpnWDFmQmF0M2JW
 *      Content-Type: application/x-www-form-urlencoded
 *
 *      grant_type=authorization_code&code=SplxlOBeZQQYbYS6WxSbIA
 *      &redirect_uri=https%3A%2F%2Fclient%2Eexample%2Ecom%2Fcb
 *
 *
 *   The authorization server MUST:
 *
 *    o  require client authentication for confidential clients or for any
 *       client that was issued client credentials (or with other
 *       authentication requirements),
 *
 *    o  authenticate the client if client authentication is included,
 *
 *    o  ensure that the authorization code was issued to the authenticated
 *       confidential client, or if the client is public, ensure that the
 *       code was issued to "client_id" in the request,
 *
 *    o  verify that the authorization code is valid, and
 *
 *    o  ensure that the "redirect_uri" parameter is present if the
 *       "redirect_uri" parameter was included in the initial authorization
 *       request as described in Section 4.1.1, and if included ensure that
 *       their values are identical.
 */
public class AccessTokenRequest {

    String grant_type;
    String code;
    String redirect_uri;
    String client_id;


}
