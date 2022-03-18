package computer;
import components.*;

public class Computer {
    private DispositivosDeEntrada dispositivosDeEntrada;
    private DispositivosDeSalida dispositivosDeSalida;
    private UnidadCentral unidadCentral;
    private Impresora impresora;

    public Computer(UnidadCentral unidadCentral, DispositivosDeEntrada dispositivosDeEntrada,
     DispositivosDeSalida dispositivosDeSalida, Impresora impresora)
             {
        this.dispositivosDeEntrada = dispositivosDeEntrada;
        this.dispositivosDeSalida = dispositivosDeSalida;
        this.unidadCentral = unidadCentral;
        this.impresora = impresora;
    }

    public DispositivosDeEntrada getDispositivosDeEntrada() {
        return dispositivosDeEntrada;
    }

    public void setDispositivosDeEntrada(DispositivosDeEntrada dispositivosDeEntrada) {
        this.dispositivosDeEntrada = dispositivosDeEntrada;
    }

    public DispositivosDeSalida getDispositivosDeSalida() {
        return dispositivosDeSalida;
    }

    public void setDispositivosDeSalida(DispositivosDeSalida dispositivosDeSalida) {
        this.dispositivosDeSalida = dispositivosDeSalida;
    }

    public UnidadCentral getUnidadCentral() {
        return unidadCentral;
    }

    public void setUnidadCentral(UnidadCentral unidadCentral) {
        this.unidadCentral = unidadCentral;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    
    
}
