package spring.boot.rest.rest.controller;

import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import spring.boot.rest.rest.service.Authorities;
import spring.boot.rest.rest.service.AuthorizationService;
import spring.boot.rest.rest.user.User;
import spring.boot.rest.rest.user.UserAccount;

import java.util.List;

@Validated
@RestController
public class AuthorizationController {
    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@UserAccount @Valid User user) {
        return service.getAuthorities(user);
    }


    @PostMapping("/authorize")
    public List<Authorities> postAuthorities(@Valid @RequestBody User user) {
        return service.getAuthorities(user);
    }
}