package components;


public class DispositivosDeSalida {
    private String dispositivoDeSalida;
    private int puertoValido;
    private double precio;
    private String modelo;
    private String nombreDelFabricante;


    public DispositivosDeSalida( String dispositivoDeSalida, double precio, String modelo, 
    String nombreDelFabricante,int puertoValido){
        this.precio = precio;
        this.modelo = modelo;
        this.nombreDelFabricante = nombreDelFabricante;
        this.dispositivoDeSalida = dispositivoDeSalida;
        this.puertoValido  = puertoValido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombreDelFabricante() {
        return nombreDelFabricante;
    }

    public void setNombreDelFabricante(String nombreDelFabricante) {
        this.nombreDelFabricante = nombreDelFabricante;
    }

    public String getDispositivoDeSalida() {
        return dispositivoDeSalida;
    }

    public void setDispositivoDeSalida(String dispositivoDeSalida) {
        this.dispositivoDeSalida = dispositivoDeSalida;
    }

    public int getPuertoValido() {
        return puertoValido;
    }

    public void setPuertoValido(int puertoValido) {
        this.puertoValido = puertoValido;
    }


    
}
