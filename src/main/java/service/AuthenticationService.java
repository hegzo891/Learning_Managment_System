package service;

import model.AuthenticationRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public String authenticate(AuthenticationRequest authenticationRequest) {
        return "Authentication successful";
    }
}