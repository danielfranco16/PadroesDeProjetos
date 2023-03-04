package ifba.factory;

import ifba.abstratos.IFabricaDocumento;
import ifba.abstratos.Idocumento;
import ifba.elementos.HTML;

public class FabricaHTML implements IFabricaDocumento {

    @Override
    public Idocumento novoDocumento() {
        HTML novoHTML = new HTML(); 
        return novoHTML;
    }
    
}