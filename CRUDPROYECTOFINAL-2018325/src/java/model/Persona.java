package model;

public class Persona {

    private int codigoPersona;
    private String DPI;
    private String nombrePersona;
    private String telefono;
    private String estado;
    private String usuario;

    public Persona() {
    }

    public Persona(int codigoPersona, String DPI, String nombrePersona, String telefono, String estado, String usuario) {
        this.codigoPersona = codigoPersona;
        this.DPI = DPI;
        this.nombrePersona = nombrePersona;
        this.telefono = telefono;
        this.estado = estado;
        this.usuario = usuario;
    }

    public int getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(int codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}