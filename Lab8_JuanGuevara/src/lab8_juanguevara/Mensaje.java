/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_juanguevara;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Mensaje {
   private String emisor;
   private String receptor;
   private String fecha ;
   private String contenido;

    public Mensaje() {
    }

    public Mensaje(String emisor, String receptor, String fecha, String contenido) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha = fecha;
        this.contenido = contenido;
    }

    

    

    

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "De "+emisor+" a "+receptor;
    }
   
}
