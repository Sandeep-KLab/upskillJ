package com.upskillJ.c06.domainentities.examples;

import com.upskillJ.domainentities.ReadOnlyUser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadOnlyTest {
    @Test
    @DisplayName("Read Only permissions")
    public void readOnlyUserPrivsAndDefaults() {
        ReadOnlyUser adminUser = new ReadOnlyUser();
        assertEquals("bob", adminUser.getUsername());
        assertEquals("troll", adminUser.getPassword());
        assertEquals("ReadOnly", adminUser.getPermission());
    }

}
