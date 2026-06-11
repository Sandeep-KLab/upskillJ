package com.upskillJ.c10.collections.examples;

import com.upskillJ.domainentities.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetExamplesTest {

    /**
     * Set:
     * 1. Doesn't allow duplicates, duplicates will be ignored
     * 2. Order is not guaranteed
     */

    @Test
    @DisplayName("Create and manipulate a set of users")
    public void createAndManipulateASetOfUsersTest() {
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        Set users = new HashSet();
        users.add(user1);
        users.add(user1);
        users.add(user2);

        assertEquals(2, users.size());

    }
}
