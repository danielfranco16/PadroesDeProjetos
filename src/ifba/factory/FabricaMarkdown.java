package ifba.factory;

import ifba.abstratos.IFabricaDocumento;
import ifba.abstratos.Idocumento;
import ifba.elementos.Markdown;

public class FabricaMarkdown implements IFabricaDocumento {

    @Override
    public Idocumento novoDocumento() {
        Markdown novoMarkdown = new Markdown(); 
        return novoMarkdown;
    }
    
}
