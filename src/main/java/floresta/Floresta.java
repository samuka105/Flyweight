package floresta;

import java.util.ArrayList;
import java.util.List;

public class Floresta {

    private List<Arvore> arvores = new ArrayList<Arvore>();

    public void plantar(int x, int y, String nome, String cor, String textura) {
        TipoArvore tipo = TipoArvoreFactory.getTipo(nome, cor, textura);
        arvores.add(new Arvore(x, y, tipo));
    }

    public int getTotalArvores() {
        return arvores.size();
    }

    public List<String> desenhar() {
        List<String> saida = new ArrayList<String>();
        for (Arvore arvore : arvores) {
            saida.add(arvore.desenhar());
        }
        return saida;
    }
}
