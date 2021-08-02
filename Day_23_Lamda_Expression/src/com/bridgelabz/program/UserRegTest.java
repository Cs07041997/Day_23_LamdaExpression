package com.bridgelabz.program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegTest {

	UserReg userReg = new UserReg();

    @Test
    void firstnameValidate() {
        String firstName = "Chandan";
        assertTrue(userReg.firstname(firstName));

    }

    @Test
    void lastName() {
        String lastName= "Singh";
        assertTrue(userReg.lastName(lastName));
    }

    @Test
    void email() {
        String email = "chandansingh@gmail.co.in";
        assertTrue(userReg.email(email));
    }

    @Test
    void mobile() {
        String mobile = "91 9503849559";
        assertTrue(userReg.mobile(mobile));
    }

    @Test
    void password() {
        String password = "Chandan@373";
        assertTrue(userReg.password(password));
    }

}
