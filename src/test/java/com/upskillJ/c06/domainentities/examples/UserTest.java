package com.upskillJ.c06.domainentities.examples;

import com.upskillJ.domainentities.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser() {
        User user = new User();

        assertEquals("bob",user.getUsername(),"default username expected");
        assertEquals("troll",user.getPassword(),"default password expected");

//        User auser = new User();
//        auser.username = "bugsy";
//        assertEquals("bugsy", auser.username, "not the default username expected");
    }

    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User("admin", "pA55w0rD");
        assertEquals("admin",user.getUsername(),"given username expected");
        assertEquals("pA55w0rD",user.getPassword(),"given password expected");
    }

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();
        user.setPassword("PaZZwor6");
        assertEquals("PaZZwor6",user.getPassword(),"setter password expected");
    }

    @Test
    public void getUrl(){
        User user = new User();
        System.out.println(user.getUrl());
    }

    @Test
    public void aUserHasNormalPermissions(){
        User auser = new User();
        assertEquals("Normal", auser.getPermission());
    }

}
