# Problema Page Fault, Simulador de algoritmo de Substituição de Páginas

## Descrição do Projeto
Este simulador foi desenvolvido para avaliar o desempenho de diferentes algoritmos de substituição de páginas em um sistema de gerenciamento de memória virtual. O objetivo é verificar as faltas de página em cada método, analisando o comportamento dos algoritmos em diferentes cenários.

## Algoritmos Implementados
O simulador utiliza os seguintes algoritmos de substituição de páginas:
1. **FIFO (First In, First Out)** - Substitui a página mais antiga.
2. **LRU (Least Recently Used)** - Substitui a página menos recentemente usada.
3. **Clock (Relógio)** - Variante do FIFO com segunda chance para páginas usadas recentemente.
4. **NFU (Not Frequently Used)** - Substitui a página menos frequentemente usada.

Cada método registra as faltas de página ocorridas durante a execução do simulador.

## Funcionalidades
- **Entrada de Dados:** Recebe uma sequência de números inteiros, representando as páginas a serem referenciadas.
- **Cálculo de Faltas de Página:** Cada algoritmo calcula e exibe a quantidade de faltas de página.
- **Comparação de Desempenho:** Os resultados são apresentados de forma que cada método exiba o total de faltas de página.

## Exemplo de Uso
Para executar o simulador:
1. Clone o repositório:
   ```bash
    git clone https://github.com/Joaomagh/SimuladorPageFault
2. Compile e execute o projeto no seu ambiente Java. (como eclipse, IntelliJ...)
3. Insira uma sequência de páginas (ex: 1 2 2 4 5 1 2 8) para ver como os algoritmos processam a entrada e as faltas de página para cada método.
## Exemplo de Saída
1. Método FIFO - X faltas de página
2. Método LRU - X faltas de página
3. Método Clock - X faltas de página
4. Método NFU - X faltas de página

## Estrutura do Código
1. Main.java: Arquivo principal para execução do simulador.
2. FIFO.java: Implementação do algoritmo FIFO.
3. LRU.java: Implementação do algoritmo LRU.
4. Clock.java: Implementação do algoritmo Clock.
5. NFU.java: Implementação do algoritmo NFU.