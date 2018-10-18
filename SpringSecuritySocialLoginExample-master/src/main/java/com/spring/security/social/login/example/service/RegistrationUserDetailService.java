package com.spring.security.social.login.example.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.security.social.login.example.database.dao.UserDAO;
import com.spring.security.social.login.example.database.model.Role;
import com.spring.security.social.login.example.database.model.User;
import com.spring.security.social.login.example.dto.LocalUser;
import com.spring.security.social.login.example.dto.UserRegistrationForm;
import com.spring.security.social.login.example.exception.UserAlreadyExistAuthenticationException;


@Service("registrationUserDetailService")
public class RegistrationUserDetailService implements UserService {

    @Autowired
    @Qualifier(value = "localUserDetailService")
    private UserDetailsService userDetailService;

    @Autowired
    private UserDAO userDAO;


    @Override
    @Transactional(value = "transactionManager")
    public LocalUser registerNewUser(final UserRegistrationForm userRegistrationForm) throws UserAlreadyExistAuthenticationException {

        com.spring.security.social.login. example.database.model.User userExist = userDAO.get(userRegistrationForm.getEmail());
        if (userExist != null) {
            throw new UserAlreadyExistAuthenticationException("User with email id " + userRegistrationForm.getEmail() + " already exist");
        }

        com.spring.security.social.login.example.database.model.User user = buildUser(userRegistrationForm);
        userDAO.save(user);
        //userDAO.flush();

        return (LocalUser) userDetailService.loadUserByEmail(userRegistrationForm.getEmail());
    }

    private User buildUser(final UserRegistrationForm formDTO) {
        User user = new User();
        user.setEmailId(formDTO.getEmail());
        user.setName(formDTO.getUserName());
        user.setPassword(formDTO.getPassword());
        user.setphonenumber(formDTO.getphonenumber());
        final HashSet<Role> roles = new HashSet<Role>();
        Role role = new Role();
        role.setName("ROLE_USER");
        roles.add(role);
        user.setRoles(roles);
        user.setProvider(formDTO.getSocialProvider().name());
        return user;
    }
}
