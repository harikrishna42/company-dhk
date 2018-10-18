package com.spring.security.social.login.example.dto;

public class UserRegistrationForm {

    private String UserName;
    private int phonenumber;
    private String email;
    private String password;
    private SocialProvider socialProvider;

    public UserRegistrationForm() {
    }

    public UserRegistrationForm(final String UserName, final int phonenumber, final String email, final String password, final SocialProvider socialProvider) {

        this.UserName = UserName;
        this.phonenumber = phonenumber;
        this.email = email;
        this.password = password;
        this.socialProvider = socialProvider;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    
    public String getUserName() {
        return UserName;
    }

    public void setUserName(final String lastName) {
        this.UserName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(final int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public SocialProvider getSocialProvider() {
        return socialProvider;
    }

    public void setSocialProvider(final SocialProvider socialProvider) {
        this.socialProvider = socialProvider;
    }

    public static class Builder {

        private String UserName;
        private int phonenumber;
        private String email;
        private String password;
        private SocialProvider socialProvider;


        public Builder addUserName(final String UserName) {
            this.UserName = UserName;
            return this;
        }

        public Builder addEmail(final String email) {
            this.email = email;
            return this;
        }

        public Builder addPassword(final String password) {
            this.password = password;
            return this;
        }

        public Builder addPhoneNumber(final int phonenumber) {
            this.phonenumber = phonenumber;
            return this;
        }

        public Builder addSocialProvider(final SocialProvider socialProvider) {
            this.socialProvider = socialProvider;
            return this;
        }

        public UserRegistrationForm build() {
            return new UserRegistrationForm(UserName, phonenumber, email, password, socialProvider);
        }
    }
}
