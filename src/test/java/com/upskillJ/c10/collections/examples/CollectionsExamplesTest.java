package com.upskillJ.c10.collections.examples;

import com.upskillJ.domainentities.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionsExamplesTest {

    @Test
    @DisplayName("Examples of various List methods on a collection of Strings")
    public void listMethods() {

        //Define Collection of Workdays

        Collection<String> workdays = new ArrayList<>();
        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        assertEquals(5, workdays.size(), "Workdays list should be 5");

        //Define collection of Weekends

        Collection<String> weekendDays = new ArrayList<>();
        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        //Combine the two collections into a new collection of days of the week
        Collection<String> daysOfWeek = new ArrayList<>();

        daysOfWeek.addAll(workdays);
        daysOfWeek.addAll(weekendDays);

        assertEquals(7, daysOfWeek.size(), "Days of Week should contain 7 elements");

        // Remove all weekendDays from daysOfWeek
        daysOfWeek.removeAll(weekendDays);
        assertTrue(daysOfWeek.containsAll(workdays));
        assertEquals(5, daysOfWeek.size());
        assertFalse(daysOfWeek.containsAll(weekendDays));

        // Clear the collection
        daysOfWeek.clear();
        assertEquals(0, daysOfWeek.size(), "Days of week should be 0");
        assertTrue(daysOfWeek.isEmpty(), "Days of week should be empty list");
    }

    @Test
    @DisplayName("Collection amd Manipulation of the User objects")
    public void userCollection() {

        Collection<User> users = new ArrayList<>();
        assertTrue(0 == users.size());
        assertTrue(users.isEmpty());

        User user1 = new User("username1", "password1");
        User user2 = new User("username2", "password2");

        users.add(user1);
        users.add(user2);

        assertEquals(2, users.size());
        assertFalse(users.isEmpty());

        Collection<User> diffUsers = new ArrayList<>();

        User diffUser1 = new User("username3","password3");
        User diffUser2 = new User("username4","password4");

        diffUsers.add(diffUser1);
        diffUsers.add(diffUser2);

        users.addAll(diffUsers);
        assertTrue(users.containsAll(diffUsers));

        diffUsers.removeAll(users);
        assertEquals(0, diffUsers.size());

        users.clear();
        assertEquals(0, users.size());

    }
}


