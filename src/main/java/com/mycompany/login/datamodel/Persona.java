/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login.datamodel;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Alcidio Baptista
 */
public class Persona {
    private SimpleStringProperty email = new SimpleStringProperty("");
    private SimpleStringProperty password = new SimpleStringProperty("");
    
    
    public Persona(){
        
    }

    public Persona(String email, String password) {
        this.email.set(email);
        this.password.set(password);
    }

    public SimpleStringProperty getEmail() {
        return email;
    }

    public void setEmail(SimpleStringProperty email) {
        this.email = email;
    }

    public SimpleStringProperty getPassword() {
        return password;
    }

    public void setPassword(SimpleStringProperty password) {
        this.password = password;
    }

    

    @Override
    public String toString() {
        return "Persona{" + "email=" + email + ", password=" + password + '}';
    }
    
    
}
