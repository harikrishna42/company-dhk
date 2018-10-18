package com.spring.security.social.login.example.dto;

public class UserRegistrationForm {

    private String UserName;
    private String phoneno;
    private String email;
    private String password;
    private SocialProvider socialProvider;

    public UserRegistrationForm() {
    }

    public UserRegistrationForm(final String UserName, final String phoneno, final String email, final String password, final SocialProvider socialProvider) {

        this.UserName = UserName;
        this.phoneno = phoneno;
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

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(final String phoneno) {
        this.phoneno = phoneno;
    }

    public SocialProvider getSocialProvider() {
        return socialProvider;
    }

    public void setSocialProvider(final SocialProvider socialProvider) {
        this.socialProvider = socialProvider;
    }

    public static class Builder {

        private String UserName;
        private String phoneno;
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

        public Builder addPhoneNo(final String phoneno) {
            this.phoneno = phoneno;
            return this;
        }

        public Builder addSocialProvider(final SocialProvider socialProvider) {
            this.socialProvider = socialProvider;
            return this;
        }

        public UserRegistrationForm build() {
            return new UserRegistrationForm(UserName, phoneno, email, password, socialProvider);
        }
    }
}
