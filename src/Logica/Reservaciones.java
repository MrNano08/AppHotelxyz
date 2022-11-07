package Logica;

import java.io.Serializable;

public class Reservaciones implements Serializable {

    private static int fecha;
    private String idRentaHabi;
    private int idHabi;
    private int idCliente;
    private String formaPago;
    private int Adultos;
    private int ninnos;
    private int fechaIni;
    private int fechaFin;
    private int diasHos;
    private int SubTotal;
    private int descuento;
    private int total;
    private boolean estado;

    public Reservaciones() {
        idRentaHabi = autogenerarId();
    }

    public Reservaciones(String idRentaHabi, int idHabi, int idCliente, String formaPago, int Adultos, int ninnos, int fechaIni, int fechaFin, int diasHos, int SubTotal, int descuento, int total, boolean estado) {
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
        if (fecha < 10) {
            return "R-000" + (++fecha);
        } else if (fecha < 100) {
            return "R-00" + (++fecha);
        } else if (fecha < 1000) {
            return "A-0" + (++fecha);
        } else {
            return "A-" + (++fecha);
        }
    }

    public void setIdRentaHabi(String idRentaHabi) {
        this.idRentaHabi = idRentaHabi;
    }

    public void setFecha(int fecha) {
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

    public void setFechaIni(int fechaIni) {
        this.fechaIni = fechaIni;
    }

    public void setFechaFin(int fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setDiasHos(int diasHos) {
        this.diasHos = diasHos;
    }

    public void setSubTotal(int SubTotal) {
        this.SubTotal = SubTotal;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getIdRentaHabi() {
        return idRentaHabi;
    }

    public int getFecha() {
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

    public int getFechaIni() {
        return fechaIni;
    }

    public int getFechaFin() {
        return fechaFin;
    }

    public int getDiasHos() {
        return diasHos;
    }

    public int getSubTotal() {
        return SubTotal;
    }

    public int getDescuento() {
        return descuento;
    }

    public int getTotal() {
        return total;
    }

    public boolean isEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Reservaciones{" + "idRentaHabi=" + idRentaHabi + ", fecha=" + fecha + ", idHabi=" + idHabi + ", idCliente=" + idCliente + ", formaPago=" + formaPago + ", Adultos=" + Adultos + ", ninnos=" + ninnos + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", diasHos=" + diasHos + ", SubTotal=" + SubTotal + ", descuento=" + descuento + ", total=" + total + ", estado=" + estado + '}';
    }

    /* public double calcularPrecioNinnos() {
        return getNinnos() * (aqui va el precio por niño);
    }

     public double calcularPrecioAdulto(){
         return getAdultos() * (aqui va el precio por adulto);
    }
    
     public double CalcularPrecioPersona(){
         return calcularPrecioNinnos() ++ calcularPrecioAdultos();
    }  
     public double calcularSubTotal()
         return calcularPrecioPersona() * getDiasHos();
    
     public double calcularPrecioTotal {
    switch (descuento) {
            case '0%':
                return calcularSubTotal();
            case "5%":
                return calcularSubTotal() - (no se como se restan los prcentages sorry);
            case "10%":
                return calcularSubTotal() - (10%);
            case "15":
                return calcularSubTotal() - (15%);
                }
    return 0;
    }

     */ }
