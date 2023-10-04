package br.com.cineflix.calculos;

import br.com.cineflix.modelos.Filme;
import br.com.cineflix.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t) {
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
