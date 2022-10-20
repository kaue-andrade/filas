public class Avaliacao_1 {
    public static void main(String[] args) {
        // Escreva um algoritmo que implemente uma fila de números inteiros
        // em um vetor alocado estaticamente. O módulo deve conter as funções
        // criafila,  colocanafila,  tiradafila,  filavazia  e  filacheia.
        // O vetor que abriga a fila bem como os índices que indicam o início
        // e o fim da fila devem ser variáveis globais do módulo.

        Fila fila1 = new Fila();

        fila1.criarFila();
        fila1.colocarNaFila(14);
        fila1.colocarNaFila(17);
        fila1.colocarNaFila(20);
        fila1.colocarNaFila(2);
        fila1.colocarNaFila(4);
        fila1.colocarNaFila(36);
        fila1.mostrarFila();
        fila1.quantidadeElementos();
        fila1.elementosExcluidos();
        fila1.tirarDaFila();
        fila1.mostrarFila();
        fila1.quantidadeElementos();
        fila1.elementosExcluidos();
        fila1.tirarDaFila();
        fila1.mostrarFila();
        fila1.quantidadeElementos();
        fila1.elementosExcluidos();
        fila1.tirarDaFila();
        fila1.mostrarFila();
        fila1.quantidadeElementos();
        fila1.elementosExcluidos();
        fila1.mostrarTodosElementosExcluidos();

    }
}