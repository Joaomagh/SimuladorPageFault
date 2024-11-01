package algoritmos;

import java.util.ArrayList;

public class clock {
    private int capacidadeMemoria;
    private ArrayList<Integer> paginasNaMemoria;
    private ArrayList<Boolean> bitsDeUso;
    private int ponteiro;

    public clock(int capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
        this.paginasNaMemoria = new ArrayList<>(capacidadeMemoria);
        this.bitsDeUso = new ArrayList<>(capacidadeMemoria);
        this.ponteiro = 0;
        for (int i = 0; i < capacidadeMemoria; i++) {
            paginasNaMemoria.add(-1);
            bitsDeUso.add(false);
        }
    }

    public int executar(int[] sequenciaPaginas) {
        int faltasDePagina = 0;

        for (int pagina : sequenciaPaginas) {
            if (!paginasNaMemoria.contains(pagina)) {
                while (bitsDeUso.get(ponteiro)) {
                    bitsDeUso.set(ponteiro, false);
                    ponteiro = (ponteiro + 1) % capacidadeMemoria;
                }
                paginasNaMemoria.set(ponteiro, pagina);
                bitsDeUso.set(ponteiro, true);
                ponteiro = (ponteiro + 1) % capacidadeMemoria;
                faltasDePagina++;
            } else {
                bitsDeUso.set(paginasNaMemoria.indexOf(pagina), true);
            }
        }

        return faltasDePagina;
    }
}
