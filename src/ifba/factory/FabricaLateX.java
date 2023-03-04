package ifba.factory;

import ifba.abstratos.IFabricaDocumento;
import ifba.abstratos.Idocumento;
import ifba.elementos.LateX;

public class FabricaLateX implements IFabricaDocumento {

    @Override
    public Idocumento novoDocumento() {
        LateX novoLateX = new LateX(); 
        return novoLateX;
    }
    
}