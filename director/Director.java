package director;
import builder.Builder;
import components.DispositivosDeEntrada;
import components.DispositivosDeSalida;
import components.Impresora;
import components.UnidadCentral;
public class Director {

    public void constructComputer(Builder builder){
        builder.setDispositivosDeEntrada(new DispositivosDeEntrada("Ráton", "RX3456", "Intel", "FX56",20.4 , 45));
        builder.setDispositivosDeSalida(new DispositivosDeSalida("Pantalla", 124.6, "Intel", "HP", 35));
        builder.setUnidadCentral(new UnidadCentral("Microprocesador"));
        builder.setImpresora(new Impresora("laser", "negra", 195));
    }

}