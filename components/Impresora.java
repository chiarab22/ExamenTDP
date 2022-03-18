package components;

public class Impresora {
    final String tipo1 = "laser";
    final String tipo2 = "injection";
    private String cartucha;
    private int paginasImprimidas;
    private String tipo;

    public Impresora(String tipo, String cartucha, int paginasImprimidas) {
        if(tipo.equals(tipo1)){
            this.tipo = tipo1;
            this.paginasImprimidas = paginasImprimidas;
            this.cartucha = cartucha;
        }else{
            this.tipo = tipo2;
            this.cartucha = cartucha;
            
        }
       
        
    }

    public String getCartucha() {
        return cartucha;
    }

    public void setCartucha(String cartucha) {
        this.cartucha = cartucha;
    }

    public int getPaginasImprimidas() {
        return paginasImprimidas;
    }

    public void setPaginasImprimidas(int paginasImprimidas) {
        this.paginasImprimidas = paginasImprimidas;
    }

    public String getTipo1() {
        return tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
