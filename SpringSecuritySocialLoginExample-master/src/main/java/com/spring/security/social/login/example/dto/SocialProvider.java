package com.spring.security.social.login.example.dto;


public enum SocialProvider {

    FACEBOOK("facebook"), GOOGLE("google"), NONE("local");

    private String providerType;

    public String getProviderType() {
        return providerType;
    }

    SocialProvider(final String providerType) {
        this.providerType = providerType;
    }

}
