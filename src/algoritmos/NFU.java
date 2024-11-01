package algoritmos;

import java.util.HashMap;
import java.util.Map;

public class NFU {
    private int capacidadeMemoria;
    private Map<Integer, Integer> paginasNaMemoria;
    private Map<Integer, Integer> contadores;

    public NFU(int capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
        this.paginasNaMemoria = new HashMap<>();
        this.contadores = new HashMap<>();
    }

    public int executar(int[] sequenciaPaginas) {
        int faltasDePagina = 0;

        for (int pagina : sequenciaPaginas) {
            if (!paginasNaMemoria.containsKey(pagina)) {
                if (paginasNaMemoria.size() == capacidadeMemoria) {
                    int paginaMenosUsada = paginasNaMemoria.entrySet().stream()
                            .min(Map.Entry.comparingByValue())
                            .get().getKey();
                    paginasNaMemoria.remove(paginaMenosUsada);
                    contadores.remove(paginaMenosUsada);
                }
                paginasNaMemoria.put(pagina, 0);
                faltasDePagina++;
            }
            contadores.put(pagina, contadores.getOrDefault(pagina, 0) + 1);
        }

        return faltasDePagina;
    }
}
