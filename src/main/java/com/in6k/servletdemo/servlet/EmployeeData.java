package com.in6k.servletdemo.servlet;

/**
 * Created with IntelliJ IDEA.
 * User: employee
 * Date: 31.01.13
 * Time: 17:16
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeData {
    private String name;
    private String surname;
    private String email;
    private String pass;
    private String bod;

    public EmployeeData(String name, String surname, String email, String pass, String bod)
    {
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.pass=pass;
        this.bod=bod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getBod() {
        return bod;
    }

    public void setBod(String bod) {
        this.bod = bod;
    }
}
