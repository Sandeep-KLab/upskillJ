package com.upskillJ.domainentities;

public class ReadOnlyUser extends User {

    @Override
    public String getPermission(){
        return "ReadOnly";
    }
}
