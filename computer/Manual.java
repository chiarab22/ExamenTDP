package computer;
import components.*;

public class Manual {
    private DispositivosDeEntrada dispositivosDeEntrada;
    private DispositivosDeSalida dispositivosDeSalida;
    private UnidadCentral unidadCentral;
    private Impresora impresora;
    
    public Manual(UnidadCentral unidadCentral, DispositivosDeEntrada dispositivoDeEntrada,
            DispositivosDeSalida dispositivoDeSalida, Impresora impresora) {
                this.unidadCentral = unidadCentral;
                this.impresora= impresora;
    }

    public String print(){
        String computer = "";
        computer += "Tipo de ordenador:" + unidadCentral.getUnidadCentral();
        computer += "\nDispositivo de entrada:" + dispositivosDeEntrada;
        computer += "\nDispositivo de salida:" + dispositivosDeSalida;
        computer += "\nImpresora: " + impresora.getTipo();
        return computer;


    }
    
}
