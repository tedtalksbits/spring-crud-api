package com.tblake.crudapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {

    @Test
    void testAccount() {
        Account account = new Account();
        account.setId("1234");
        account.setName("name");
        account.setEmail("email");
        account.setPassword("password");
        assertNotNull(account);
        assertEquals("1234", account.getId());
    }

}
