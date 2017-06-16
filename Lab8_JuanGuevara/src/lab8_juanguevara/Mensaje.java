/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_juanguevara;

import java.sql.Date;

/**
 *
 * @author HP
 */
public class Mensaje {
   private Contactos emisor;
   private Contactos receptor;
   private Date fecha;
   private String contenido;

    public Mensaje() {
    }

    public Mensaje(Contactos emisor, Contactos receptor, Date fecha, String contenido) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public Contactos getEmisor() {
        return emisor;
    }

    public void setEmisor(Contactos emisor) {
        this.emisor = emisor;
    }

    public Contactos getReceptor() {
        return receptor;
    }

    public void setReceptor(Contactos receptor) {
        this.receptor = receptor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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
