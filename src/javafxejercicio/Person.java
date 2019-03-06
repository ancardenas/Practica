/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxejercicio;

/**
 *
 * @author Fabian Giraldo
 */
public class Person {

    private String firstName;
    private String lastName;
    private String email;

    public Person(String fName, String lName, String email) {
        this.firstName = fName;
        this.lastName = lName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String fName) {
        lastName = fName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String fName) { email=fName; }}