package floresta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlorestaTest {

    @BeforeEach
    public void limparFabrica() {
        TipoArvoreFactory.limpar();
    }

    @Test
    public void testMesmoTipoCompartilhaInstancia() {
        TipoArvore a = TipoArvoreFactory.getTipo("Ipê", "amarelo", "lisa");
        TipoArvore b = TipoArvoreFactory.getTipo("Ipê", "amarelo", "lisa");
        assertSame(a, b);
    }

    @Test
    public void testTiposDiferentesInstanciasDiferentes() {
        TipoArvore a = TipoArvoreFactory.getTipo("Ipê", "amarelo", "lisa");
        TipoArvore b = TipoArvoreFactory.getTipo("Pinheiro", "verde", "áspera");
        assertNotSame(a, b);
    }

    @Test
    public void testCorDiferenteGeraTipoDiferente() {
        TipoArvore a = TipoArvoreFactory.getTipo("Ipê", "amarelo", "lisa");
        TipoArvore b = TipoArvoreFactory.getTipo("Ipê", "roxo", "lisa");
        assertNotSame(a, b);
    }

    @Test
    public void testTotalTiposContaApenasUnicos() {
        Floresta floresta = new Floresta();
        floresta.plantar(0, 0, "Ipê", "amarelo", "lisa");
        floresta.plantar(1, 1, "Ipê", "amarelo", "lisa");
        floresta.plantar(2, 2, "Pinheiro", "verde", "áspera");
        assertEquals(2, TipoArvoreFactory.getTotalTipos());
    }

    @Test
    public void testMuitasArvoresPoucosTipos() {
        Floresta floresta = new Floresta();
        for (int i = 0; i < 100; i++) {
            floresta.plantar(i, i, "Ipê", "amarelo", "lisa");
        }
        assertEquals(100, floresta.getTotalArvores());
        assertEquals(1, TipoArvoreFactory.getTotalTipos());
    }

    @Test
    public void testArvoresDoMesmoTipoCompartilham() {
        TipoArvore tipo = TipoArvoreFactory.getTipo("Ipê", "amarelo", "lisa");
        Arvore a = new Arvore(0, 0, tipo);
        Arvore b = new Arvore(5, 9, tipo);
        assertSame(a.getTipo(), b.getTipo());
    }

    @Test
    public void testDesenhoContemDadosDoTipo() {
        TipoArvore tipo = TipoArvoreFactory.getTipo("Ipê", "amarelo", "lisa");
        Arvore arvore = new Arvore(3, 7, tipo);
        String desenho = arvore.desenhar();
        assertTrue(desenho.contains("Ipê"));
        assertTrue(desenho.contains("amarelo"));
        assertTrue(desenho.contains("3, 7"));
    }
}
