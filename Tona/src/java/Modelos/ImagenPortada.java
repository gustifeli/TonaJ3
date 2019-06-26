/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.InputStream;

/**
 *
 * @author gusti
 */
public class ImagenPortada {
    private int idFotoPortada;
    private byte[] fotoPortada;
    private InputStream inputStream;

    public ImagenPortada() {
    }

    public ImagenPortada(int idFotoPortada, byte[] fotoPortada) {
        this.idFotoPortada = idFotoPortada;
        this.fotoPortada = fotoPortada;
    }

    public int getIdFotoPortada() {
        return idFotoPortada;
    }

    public void setIdFotoPortada(int idFotoPortada) {
        this.idFotoPortada = idFotoPortada;
    }

    public byte[] getFotoPortada() {
        return fotoPortada;
    }

    public void setFotoPortada(byte[] fotoPortada) {
        this.fotoPortada = fotoPortada;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }   
}
