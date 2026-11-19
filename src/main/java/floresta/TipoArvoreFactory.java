package floresta;

import java.util.HashMap;
import java.util.Map;

public class TipoArvoreFactory {

    private static Map<String, TipoArvore> tipos = new HashMap<String, TipoArvore>();

    public static TipoArvore getTipo(String nome, String cor, String textura) {
        String chave = nome + "-" + cor + "-" + textura;
        TipoArvore tipo = tipos.get(chave);
        if (tipo == null) {
            tipo = new TipoArvore(nome, cor, textura);
            tipos.put(chave, tipo);
        }
        return tipo;
    }

    public static int getTotalTipos() {
        return tipos.size();
    }

    public static void limpar() {
        tipos.clear();
    }
}
