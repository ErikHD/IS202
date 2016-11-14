/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Database.Besvarelse;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Erikdjon
 */
@Stateless
public class NewSessionBean implements NewSessionBeanRemote {

    @PersistenceContext
    private EntityManager em;

    @Override
    public String getModuleNAme() {
       return "Module 3";
    }
    
    @Override
    public String getBesvarelseKommentarFromID(int id) {
       Besvarelse besvarelse = em.find(Besvarelse.class, id);
              return besvarelse.getKommentar()
                      ;
               
    }

    public void persist(Object object) {
        em.persist(object);
    }

   
}
