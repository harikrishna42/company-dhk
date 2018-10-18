package com.spring.security.social.login.example.registry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UserProfile;

import com.spring.security.social.login.example.util.SecurityUtil;
import com.spring.security.social.login.example.dto.LocalUser;
import com.spring.security.social.login.example.dto.SocialProvider;
import com.spring.security.social.login.example.dto.UserRegistrationForm;
import com.spring.security.social.login.example.service.UserService;


public class AppConnectionSignUp implements ConnectionSignUp {

    @Autowired
    private UserService userService;

    @Override
    public String execute(final Connection<?> connection) {
        UserRegistrationForm userDetails = toUserRegistrationObject(SecurityUtil.toSocialProvider(connection.getKey().getProviderId()), connection.fetchUserProfile());
        LocalUser user = (LocalUser) userService.registerNewUser(userDetails);
        return user.getEmail();
    }

    private UserRegistrationForm toUserRegistrationObject(final SocialProvider socialProvider, final UserProfile userProfile) {
        return UserRegistrationForm.getBuilder()
                .addUserName(userProfile.getName())
                .addEmail(userProfile.getEmail())
                .addPassword(userProfile.getName())
                .addSocialProvider(socialProvider).build();
    }

}
