package com.spring.security.social.login.example.database.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "USER")
public class User implements Serializable{

   
    @Column(name = "NAME", nullable = true, length = 32)
    private String name;

    @Column(name = "PASSWORD", nullable = false, length = 64)
    private String password;

    @Column(name = "EMAIL_ID", nullable = true, length = 128)
    private String emailId;

    @Column(name = "PHONENUMBER", nullable = false, length = 11)
    private Integer phonenumber;

    @Column(name = "PROVIDER", nullable = false, length = 32)
    private String provider;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
            name = "USER_ROLE",
            joinColumns = @JoinColumn(name = "EMAIL_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID")
    )
    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    public User( final String name, final String password, final String emailId, final int phonenumber, final String provider, final Set<Role> roles) {

        this.name = name;
        this.password = password;
        this.emailId = emailId;
        this.phonenumber = phonenumber;
        this.provider = provider;
        this.roles = roles;
    }


    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public int getphonenumber() {
        return phonenumber;
    }

    public void setphonenumber(final int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(final Set<Role> roles) {
        this.roles = roles;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(final String provider) {
        this.provider = provider;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(final String emailId) {
        this.emailId = emailId;
    }
}
