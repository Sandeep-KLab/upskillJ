package com.upskillJ.c05.domainObject.examples;

import static com.upskillJ.domainobject.TestAppEnv.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAppEnvironment {

    @Test
    public void canGetUrlStatically(){
        Assertions.assertEquals("https://192.123.0.3:67", getUrl(),"Returns the hard coded URL");
    }

    @Test
    public void canGetDomainAndPortStatically(){
        Assertions.assertEquals("192.123.0.3", DOMAIN, "Returns the domain");
        Assertions.assertEquals("67", PORT, "Returns the port");
    }
}
