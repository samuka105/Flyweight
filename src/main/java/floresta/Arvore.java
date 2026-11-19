package floresta;

public class Arvore {

    private int x;
    private int y;
    private TipoArvore tipo;

    public Arvore(int x, int y, TipoArvore tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public TipoArvore getTipo() {
        return tipo;
    }

    public String desenhar() {
        return "Árvore " + tipo.getNome() + " (" + tipo.getCor() + ") em (" + x + ", " + y + ")";
    }
}
