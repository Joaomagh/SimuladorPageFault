package algoritmos;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU {
    private int capacidadeMemoria;
    private LinkedHashMap<Integer, Integer> paginasNaMemoria;

    public LRU(int capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
        this.paginasNaMemoria = new LinkedHashMap<>(capacidadeMemoria, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacidadeMemoria;
            }
        };
    }

    public int executar(int[] sequenciaPaginas) {
        int faltasDePagina = 0;

        for (int pagina : sequenciaPaginas) {
            if (!paginasNaMemoria.containsKey(pagina)) {
                faltasDePagina++;
            }
            paginasNaMemoria.put(pagina, pagina);
        }

        return faltasDePagina;
    }
}
