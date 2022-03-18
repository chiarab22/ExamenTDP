package builder;

import components.Impresora;
import components.UnidadCentral;
import components.DispositivosDeEntrada;
import components.DispositivosDeSalida;

public interface Builder{
    void setUnidadCentral(UnidadCentral unidadCentral);
    void setDispositivosDeEntrada(DispositivosDeEntrada dispositivo);
    void setDispositivosDeSalida(DispositivosDeSalida dispositivo);
    void setImpresora(Impresora impresora);
}