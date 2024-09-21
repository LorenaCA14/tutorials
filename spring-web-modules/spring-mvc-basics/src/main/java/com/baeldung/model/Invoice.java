package com.baeldung.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Invoice {
    private long id;
    private String concepto;
    private Double cantidad ;
    private Double porcentajeRetencion ;

    public Invoice() {
        super();
    }

    public Invoice(final long id, final String concepto, final Double cantidad, final Double porcentajeRetencion) {
        this.id = id;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(final String concepto) {
        this.concepto = concepto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(final Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPorcentajeRetencion() {
        return porcentajeRetencion;
    }

    public void setPorcentajeRetencion(final Double porcentajeRetencion) {
        this.porcentajeRetencion = porcentajeRetencion;
    }

    @Override
    public String toString() {
        return "Invoice [id=" + id + ", concepto=" + concepto + ", cantidad=" + cantidad + ", Retención%=" + porcentajeRetencion + "]";
    }
}
