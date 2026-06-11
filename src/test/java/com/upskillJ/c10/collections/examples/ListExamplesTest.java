package com.upskillJ.c10.collections.examples;

import com.upskillJ.domainentities.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ListExamplesTest {

    /**
     * List Allows:
     * 1. storing of duplicate values
     * 2. retains elements in the order added
     * 3. adding specific elements in a specific position in the list
     */

    @Test
    @DisplayName("Examples of methods in the List Interface")
    public void methodsInListExamplesTest() {
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        //get elements in a list
        assertEquals("Monday", days.get(0));
        assertEquals("Tuesday", days.get(1));
        assertEquals("Wednesday", days.get(2));

        //remove an element at index
        days.remove(1);
        assertEquals("Monday", days.get(0));
        assertEquals("Wednesday", days.get(1));

        //add element at specific index
        days.add(1, "Tuesday");
        days.add(3, "Thursday");
        days.add(4, "Friday");

        //addAll in a collection at specific index
        List<String> missingDays = new ArrayList<>();
        missingDays.add("Saturday");
        missingDays.add("Funday");

        days.addAll(5, missingDays);
        assertEquals("Funday", days.get(6));

        //set the element at an index
        days.set(6, "Sunday");
        assertEquals("Sunday", days.get(6));
        assertFalse(days.contains("Funday"));

        //create subList based on the original List
        List<String> workdays = days.subList(0, 5);
        assertEquals("Monday", workdays.get(0));
        assertEquals("Wednesday", workdays.get(2));
        assertFalse(workdays.contains("Sunday"));
    }

    @Test
    @DisplayName("Create and manipulate a List of User objects")
    public void createAndManipulateListOfUserObjectsTest() {
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        List<User> users = new ArrayList<>();

        //add user to the list
        users.add(user1);
        assertEquals("user1", users.get(0).getUsername());

        //add user to the front of the list
        users.add(0, user2);
        assertEquals("user2", users.get(0).getUsername());
        assertEquals("user1", users.get(1).getUsername());

        //Assert on the indexOf position of the user objects
        assertEquals(0, users.indexOf(user2));
        assertEquals(1, users.indexOf(user1));

        //remove the first user object
        users.remove(user2);
        assertEquals("user1", users.get(0).getUsername());
    }
}