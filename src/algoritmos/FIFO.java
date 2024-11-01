package algoritmos;

import java.util.LinkedList;
import java.util.Queue;

public class FIFO {
    private int capacidadeMemoria;
    private Queue<Integer> paginasNaMemoria;

    public FIFO(int capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
        this.paginasNaMemoria = new LinkedList<>();
    }

    public int executar(int[] sequenciaPaginas) {
        int faltasDePagina = 0;

        for (int pagina : sequenciaPaginas) {
            if (!paginasNaMemoria.contains(pagina)) {
                if (paginasNaMemoria.size() == capacidadeMemoria) {
                    paginasNaMemoria.poll(); // Remove a página mais antiga
                }
                paginasNaMemoria.add(pagina);
                faltasDePagina++;
            }
        }

        return faltasDePagina;
    }
}
