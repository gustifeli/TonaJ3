/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.awt.Image;
import java.io.InputStream;

/**
 *
 * @author GustiFeli
 */
public class Producto {
    private int idproducto;
    private String descripcion;
    private InputStream inputStreamFoto;
    private byte[] foto;
    private int idCampana;
    private byte[] imagen;
    private String campana;

    public String getCampana() {
        return campana;
    }
    public void setCampana(String campana) {
        this.campana = campana;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    
    public int getIdCampana() {
        return idCampana;
    }

    public void setIdCampana(int idCampana) {
        this.idCampana = idCampana;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public InputStream getInputStreamFoto() {
        return inputStreamFoto;
    }

    public void setInputStreamFoto(InputStream inputStreamFoto) {
        this.inputStreamFoto = inputStreamFoto;
    }

   
    
    
}
