package com.upskillJ.c10.collections.examples;

import com.upskillJ.domainentities.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapExamplesTest {

    /**
     * Map:
     * 1. Collection of Key-Value pairs
     * 2. Each element is a Value(V) and it is stored with an associated Key(K)
     * 3. Each Key must be unique and each Key maps to only one value
     * 4. If Key does not exist, any attempt to get the value will return `null`
     * 5. If Key does not exist, any attempt to remove the key will have no impact and doesn't throw any exceptions
     */
    @Test
    @DisplayName("Create and manipulate a Map of User objects")
    public void createAndManipulateAMapOfUsersTest() {
        Map<String, User> users = new HashMap<>();
        User user1 = new User("username1", "password1");
        User user2 = new User("username2", "password2");

        users.put("user1", user1);
        users.put("user1", user2);

        assertEquals(1, users.size());

        assertEquals(user2, users.get("user1"));

    }
}
