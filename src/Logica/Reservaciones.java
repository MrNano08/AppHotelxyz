package Logica;

import java.io.Serializable;
import java.util.Date;

public class Reservaciones implements Serializable {

    private Date fecha;
    private String idRentaHabi;
    private int idHabi;
    private int idCliente;
    private String formaPago;
    private int Adultos;
    private int ninnos;
    private Date fechaIni;
    private Date fechaFin;
    private int diasHos;
    private double SubTotal;
    private int descuento;
    private double total;
    private boolean estado;
    private static int idnum;
    
    
    public Reservaciones() {
//        autogenerarId();
//        idRentaHabi = autogenerarId();
    }

    public Reservaciones(Date fecha, String idRentaHabi, int idHabi, int idCliente, String formaPago, int Adultos, int ninnos, Date fechaIni, Date fechaFin, int diasHos, double SubTotal, int descuento, double total, boolean estado) {
        autogenerarId();
        this.fecha = fecha;
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
            return "R-" + (int) (Math.random()*10000000)+1;     
    }

    public void setIdRentaHabi(String idRentaHabi) {
        this.idRentaHabi = idRentaHabi;
    }
    
    public String getIdRentaHabi(){
    return idRentaHabi;
    
    }

    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdHabi() {
        return idHabi;
    }

    public void setIdHabi(int idHabi) {
        this.idHabi = idHabi;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getAdultos() {
        return Adultos;
    }

    public void setAdultos(int Adultos) {
        this.Adultos = Adultos;
    }

    public int getNinnos() {
        return ninnos;
    }

    public void setNinnos(int ninnos) {
        this.ninnos = ninnos;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getDiasHos() {
        return diasHos;
    }

    public void setDiasHos(int diasHos) {
        this.diasHos = diasHos;
    }

    public double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(double SubTotal) {
        this.SubTotal = SubTotal;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public static int getIdnum() {
        return idnum;
    }

    public static void setIdnum(int idnum) {
        Reservaciones.idnum = idnum;
    }

    @Override
    public String toString() {
        return "Reservaciones{" + "fecha=" + fecha + ", idRentaHabi=" + idRentaHabi + ", idHabi=" + idHabi + ", idCliente=" + idCliente + ", formaPago=" + formaPago + ", Adultos=" + Adultos + ", ninnos=" + ninnos + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", diasHos=" + diasHos + ", SubTotal=" + SubTotal + ", descuento=" + descuento + ", total=" + total + ", estado=" + estado + '}';
    }

    

   

    
}
