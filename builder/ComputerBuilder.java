package builder;

import components.DispositivosDeEntrada;
import components.DispositivosDeSalida;
import components.Impresora;
import computer.Computer;
import components.UnidadCentral;

public class ComputerBuilder implements Builder{
private UnidadCentral unidadCentral;
private DispositivosDeEntrada dispositivoDeEntrada;
private DispositivosDeSalida dispositivoDeSalida;
private Impresora impresora;

    @Override
    public void setUnidadCentral(UnidadCentral unidadCentral) {
       this.unidadCentral = unidadCentral;
        
    }


    @Override
    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
        
    }

    public Computer getComputer(){
        return new Computer(unidadCentral,dispositivoDeEntrada,dispositivoDeSalida,impresora);
    }


    @Override
    public void setDispositivosDeEntrada(DispositivosDeEntrada dispositivo) {
        this.dispositivoDeEntrada = dispositivo;
        
    }


    @Override
    public void setDispositivosDeSalida(DispositivosDeSalida dispositivo) {
      this.dispositivoDeSalida = dispositivo;
    }
  
}
