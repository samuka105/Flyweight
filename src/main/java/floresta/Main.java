package floresta;

public class Main {

    public static void main(String[] args) {
        Floresta floresta = new Floresta();

        for (int i = 0; i < 500; i++) {
            floresta.plantar(i, i, "Ipê", "amarelo", "lisa");
        }
        for (int i = 0; i < 300; i++) {
            floresta.plantar(i, i + 1, "Pinheiro", "verde", "áspera");
        }
        floresta.plantar(10, 20, "Ipê", "roxo", "lisa");

        System.out.println("Árvores plantadas: " + floresta.getTotalArvores());
        System.out.println("Tipos de árvore em memória: " + TipoArvoreFactory.getTotalTipos());
    }
}
