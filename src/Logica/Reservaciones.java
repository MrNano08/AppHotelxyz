package Logica;

import java.io.Serializable;

public class Reservaciones implements Serializable {

    private String fecha;
    private String idRentaHabi;
    private int idHabi;
    private int idCliente;
    private String formaPago;
    private int Adultos;
    private int ninnos;
    private String fechaIni;
    private String fechaFin;
    private int diasHos;
    private double SubTotal;
    private int descuento;
    private double total;
    private boolean estado;

    public Reservaciones() {
        idRentaHabi = autogenerarId();
    }

    public Reservaciones(String idRentaHabi, int idHabi, int idCliente, String formaPago, int Adultos, int ninnos, String fechaIni, String fechaFin, int diasHos, double SubTotal, int descuento, double total, boolean estado) {
        this.idRentaHabi = idRentaHabi;
        this.idHabi = idHabi;
        this.idCliente = idCliente;
        this.formaPago = formaPago;
        this.Adultos = Adultos;
        this.ninnos = ninnos;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.diasHos = diasHos;
        this.SubTotal = SubTotal;
        this.descuento = descuento;
        this.total = total;
        this.estado = estado;
    }

    public String autogenerarId() {
        if (total < 10) {
            return "R-000" + (++total);
        } else if (total < 100) {
            return "R-00" + (++total);
        } else if (total < 1000) {
            return "A-0" + (++total);
        } else {
            return "A-" + (++total);
        }
    }

    public void setIdRentaHabi(String idRentaHabi) {
        this.idRentaHabi = idRentaHabi;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIdHabi(int idHabi) {
        this.idHabi = idHabi;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public void setAdultos(int Adultos) {
        this.Adultos = Adultos;
    }

    public void setNinnos(int ninnos) {
        this.ninnos = ninnos;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setDiasHos(int diasHos) {
        this.diasHos = diasHos;
    }

    public void setSubTotal(double SubTotal) {
        this.SubTotal = SubTotal;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getIdRentaHabi() {
        return idRentaHabi;
    }

    public String getFecha() {
        return fecha;
    }

    public int getIdHabi() {
        return idHabi;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public int getAdultos() {
        return Adultos;
    }

    public int getNinnos() {
        return ninnos;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public int getDiasHos() {
        return diasHos;
    }

    public double getSubTotal() {
        return SubTotal;
    }

    public int getDescuento() {
        return descuento;
    }

    public double getTotal() {
        return total;
    }

    public boolean isEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Reservaciones{" + "idRentaHabi=" + idRentaHabi + ", fecha=" + fecha + ", idHabi=" + idHabi + ", idCliente=" + idCliente + ", formaPago=" + formaPago + ", Adultos=" + Adultos + ", ninnos=" + ninnos + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", diasHos=" + diasHos + ", SubTotal=" + SubTotal + ", descuento=" + descuento + ", total=" + total + ", estado=" + estado + '}';
    }

    
}
