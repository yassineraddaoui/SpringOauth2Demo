package com.jee.project.myreddit;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {


    @GetMapping("/")
    public String secureApi(OAuth2AuthenticationToken token){
        System.out.println(token.getCredentials());
        return "secure API !";
    }
}
