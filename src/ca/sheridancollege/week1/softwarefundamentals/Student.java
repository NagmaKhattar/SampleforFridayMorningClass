/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * A class to model Student Objects
 * each student has: a name (first an last name)
 * each student can: say their name (getName)
 * @modifiedby Nagma
 * push operation
 * showing you the change on NetBeans and pushing to Github
 changing the file on remote 
 showing fetch and merge
 * @author dancye May 7, 2018
 */
public class Student 
{
    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }
    
    
}
