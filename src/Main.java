package algoritmos;

public class Main {
    public static void main(String[] args) {
        int[] sequenciaPaginas = {4, 1, 2, 5, 3, 2, 1, 4, 5, 2, 3, 5, 7, 4, 1};
        int capacidadeMemoria = 3;

        FIFO fifo = new FIFO(capacidadeMemoria);
        int faltasDePaginaFIFO = fifo.executar(sequenciaPaginas);
        System.out.println("FIFO - Faltas de página: " + faltasDePaginaFIFO);

        LRU lru = new LRU(capacidadeMemoria);
        int faltasDePaginaLRU = lru.executar(sequenciaPaginas);
        System.out.println("LRU - Faltas de página: " + faltasDePaginaLRU);

        clock clock = new clock(capacidadeMemoria);
        int faltasDePaginaClock = clock.executar(sequenciaPaginas);
        System.out.println("Clock - Faltas de página: " + faltasDePaginaClock);

        NFU nfu = new NFU(capacidadeMemoria);
        int faltasDePaginaNFU = nfu.executar(sequenciaPaginas);
        System.out.println("NFU - Faltas de página: " + faltasDePaginaNFU);
    }
}
