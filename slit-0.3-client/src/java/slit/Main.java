package slit;

import Server.NewSessionBeanRemote;
import javax.ejb.EJB;

public class Main {

    @EJB
    private static NewSessionBeanRemote newSessionBean;
   
     
     public static void main(String[] args) {
        
         System.out.println(newSessionBean.getBesvarelseKommentarFromID(1));
    }

}
