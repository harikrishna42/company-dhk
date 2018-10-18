package com.spring.security.social.login.example.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;


public class SocialUser extends org.springframework.social.security.SocialUser {

    private String email;

    public SocialUser(final String username, final String password, final boolean enabled, final boolean accountNonExpired, final boolean credentialsNonExpired, final boolean accountNonLocked, final Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
