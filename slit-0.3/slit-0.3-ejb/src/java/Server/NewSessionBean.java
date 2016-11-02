/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import javax.ejb.Stateless;

/**
 *
 * @author Erikdjon
 */
@Stateless
public class NewSessionBean implements NewSessionBeanRemote {

    @Override
    public String getModuleNAme() {
       return "Module 3";
    }

   
}
