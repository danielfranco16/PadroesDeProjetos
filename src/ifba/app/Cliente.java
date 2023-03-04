package ifba.app;


import ifba.abstratos.Idocumento;
import ifba.factory.FabricaHTML;
import ifba.factory.FabricaLateX;
import ifba.factory.FabricaMarkdown;


public class Cliente {
    public static void main(String[] args) throws Exception {
        
        FabricaHTML fabricaHTML = new FabricaHTML(); 
        FabricaLateX fabricaLateX = new FabricaLateX(); 
        FabricaMarkdown fabricaMarkdown = new FabricaMarkdown(); 
        
        Idocumento novoHTML = fabricaHTML.novoDocumento(); 
        Idocumento novoLateX = fabricaLateX.novoDocumento(); 
        Idocumento novoMarkdown = fabricaMarkdown.novoDocumento(); 
        

        System.out.println (novoHTML.adicionaElementos());
        System.out.println (novoLateX.adicionaElementos());
        System.out.println(novoMarkdown.adicionaElementos());

    }
}
