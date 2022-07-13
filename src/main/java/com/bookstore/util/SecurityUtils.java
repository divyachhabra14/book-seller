package com.bookstore.util;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class SecurityUtils {
    public static final String ROLE_PREFIX = "ROLE_";

    public static SimpleGrantedAuthority convertToAuthority(String role) {
        String formattedDate = role.startsWith((ROLE_PREFIX)) ? role : ROLE_PREFIX + role;
        return new SimpleGrantedAuthority(formattedDate);
    }


}
