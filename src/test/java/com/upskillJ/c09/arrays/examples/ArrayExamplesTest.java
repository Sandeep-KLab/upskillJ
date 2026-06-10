package com.upskillJ.c09.arrays.examples;

import com.upskillJ.domainentities.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExamplesTest {

    @Test
    public void createUsersInArray(){
        User[] users = new User[100];
        for(int i = 0; i < users.length; i++){
            users[i] = new User("username"+(i+1),"password"+(i+1));
        }
        assertEquals(100,users.length,"users array should have 100 elements");
    }

    @Test
    public void sortArrays(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Arrays.sort(workdays);
        System.out.println(Arrays.toString(workdays));

        String[] mixedCaseWorkdays = {"monday", "Tuesday", "Wednesday", "thursday", "Friday"};
        Arrays.sort(mixedCaseWorkdays);
        System.out.println(Arrays.toString(mixedCaseWorkdays));
    }

    @Test
    public void checkRaggedArray(){
        int [][] multi = new int[16][];
        for(int i = 0; i < multi.length; i++) {
            multi[i] = new int[i + 1];
            for (int j = 0; j < multi[i].length; j++) {
                multi[i][j] = j;
            }
        }
        print2DIntArray(multi);
    }

    public void print2DIntArray(int [][]multi){
        for(int[] outer : multi){
            if(outer==null){
                System.out.print("null");
            }else{
                for(int inner : outer){
                    System.out.print(inner + ",");
                }
            }
            System.out.println("");
        }
    }

}
