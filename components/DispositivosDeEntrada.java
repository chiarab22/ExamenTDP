package components;


public class DispositivosDeEntrada {
    private String dispositivoDeEntrada;
    private String conector;
    private int puertoValido;
    private String nombreDelFabricante;
    private String modelo;
    private double precio;

    public DispositivosDeEntrada(String dispositivoDeEntrada,String conector, String nombreDelFabricante, String modelo,
            double precio,int pruertoValido) {
        this.conector = conector;
        this.nombreDelFabricante = nombreDelFabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.dispositivoDeEntrada = dispositivoDeEntrada;
    }

    public String getConector() {
        return conector;
    }



    public void setConector(String conector) {
        this.conector = conector;
    }



    public String getNombreDelFabricante() {
        return nombreDelFabricante;
    }



    public void setNombreDelFabricante(String nombreDelFabricante) {
        this.nombreDelFabricante = nombreDelFabricante;
    }



    public String getModelo() {
        return modelo;
    }



    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public double getPrecio() {
        return precio;
    }



    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDispositivoDeEntrada() {
        return dispositivoDeEntrada;
    }

    public void setDispositivoDeEntrada(String dispositivoDeEntrada) {
        this.dispositivoDeEntrada = dispositivoDeEntrada;
    }

    public int getPuertoValido() {
        return puertoValido;
    }

    public void setPuertoValido(int puertoValido) {
        this.puertoValido = puertoValido;
    }
    

}
