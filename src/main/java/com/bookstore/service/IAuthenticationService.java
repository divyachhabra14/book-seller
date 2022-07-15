package com.bookstore.service;

import com.bookstore.model.User;

/**
 *  Author - Divya Chhabra
 */
public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
