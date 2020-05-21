/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author CAMILO
 */
public class alquiler {

    private Integer id;
    private Integer cantidad;
    private Date fecha;
    private Usuario usuario;
    private Tipohabitacion habitacion;

    public alquiler() {
    }

    public alquiler(Integer id, Integer cantidad, Usuario usuario, Tipohabitacion habitacion) {
        this.id = id;
        this.cantidad = cantidad;
        this.usuario = usuario;
        this.habitacion = habitacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tipohabitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Tipohabitacion habitacion) {
        this.habitacion = habitacion;
    }

}
