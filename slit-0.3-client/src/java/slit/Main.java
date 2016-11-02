package slit;

import Server.NewSessionBeanRemote;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.ejb.EJB;

public class Main {

    @EJB
    private static NewSessionBeanRemote newSessionBean;
   
     
     public static void main(String[] args) {
        
         System.out.println(newSessionBean.getModuleNAme());
    }

}
