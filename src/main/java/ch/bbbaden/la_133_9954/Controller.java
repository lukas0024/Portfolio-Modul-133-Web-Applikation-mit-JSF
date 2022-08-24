/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.bbbaden.la_133_9954;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Lukas.Gartmann
 */
@Named(value = "controller")
@ApplicationScoped
public class Controller {
    ManagedBean mb = new ManagedBean();

    public Controller() {

    }

    public String getAugen(){
        return "augen.xhtml";
    }
    
    public String getHaare(){
        return "haare.xhtml";
    }
    
    public String getErgebnis(){
        return "ergebnis.xhtml";
    }
}
