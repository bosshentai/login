package com.mycompany.login;

import com.mycompany.login.datamodel.Persona;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

public class PrimaryController {

    private List<Persona> persona;
    
    @FXML 
    private TextField email;
    
    @FXML
    private TextField password;
            
    @FXML
    private ListView personaInfo;
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    
    @FXML
    private void loginTest() throws IOException {
        Persona person1 = new Persona(email.getText(),password.getText());
        
        persona = new ArrayList<Persona>();
        persona.add(person1);
        
        
       personaInfo.getItems().setAll(persona);
       personaInfo.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        
    }
}
