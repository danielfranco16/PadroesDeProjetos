package ifba.elementos;

import ifba.abstratos.Idocumento;

public class Markdown implements Idocumento{

    @Override
    public String adicionaElementos() {
        return "criando novo Markdown";
    }
    
}