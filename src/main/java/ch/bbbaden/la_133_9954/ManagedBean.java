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
@Named(value = "managedBean")
@ApplicationScoped
public class ManagedBean {

    public ManagedBean() {

    }
    private String haar;
    private String auge;
    private String haut;
    private String auswahl = "Deine Auswahl: ";

    public String getHaut() {
        return haut;
    }

    public void setHaut(String haut) {
        this.haut = haut;
    }

    public String getAuge() {
        return auge;
    }

    public void setAuge(String auge) {
        this.auge = auge;
    }

    public String getHaar() {
        return haar;
    }

    public void setHaar(String haar) {
        this.haar = haar;
    }

    public String getAuswahl() {
        if (haar.equals("b")) {
            auswahl += "Blonde Haare; ";
        } else {
            auswahl += "Schwarze Haare; ";
        }
        if (auge.equals("g")) {
            auswahl += "Grüne Augen; ";
        } else {
            auswahl += "Blaue Augen; ";
        }
        if (haut.equals("h")) {
            auswahl += "Helle Haut";
        } else {
            auswahl += "Dunkle Haut";
        }
        return auswahl;
    }

    public void setAuswahl(String auswahl) {
        this.auswahl = auswahl;
    }

}
