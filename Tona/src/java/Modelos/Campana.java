/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author GustiFeli
 */
public class Campana {
    
    private int idCampana;
    private String campana;

    public Campana() {
    }

    public Campana(int idCampana, String campana) {
        this.idCampana = idCampana;
        this.campana = campana;
    }

    public int getIdCampana() {
        return idCampana;
    }

    public void setIdCampana(int idCampana) {
        this.idCampana = idCampana;
    }

    public String getCampana() {
        return campana;
    }

    public void setCampana(String campana) {
        this.campana = campana;
    }
}
