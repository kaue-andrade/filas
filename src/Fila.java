public class Fila {
    // Escreva um algoritmo que implemente uma fila de números inteiros
    // em um vetor alocado estaticamente. O módulo deve conter as funções
    // criafila,  colocanafila,  tiradafila,  filavazia  e  filacheia.
    // O vetor que abriga a fila bem como os índices que indicam o início
    // e o fim da fila devem ser variáveis globais do módulo.

    // Criação das variáveis PRIVADAS e INTEIRAS
    private int tamanho = 10;
    private int primeiro;
    private int ultimo;
    private int fila[];
    private int quantidade_elementos;

    //First in, first out (o PRIMEIRO a entrar é o PRIMEIRO a sair)

    public void criarFila() {
        primeiro = ultimo = -1;
        fila = new int[tamanho];
        quantidade_elementos = 0;
    }

    public void colocarNaFila(int elemento) {
        if (! filaCheia()){
            if (primeiro == -1){
                primeiro = 0;
            }
        }
        ultimo++;
        fila[ultimo] = elemento;
        quantidade_elementos++;
    }

    public void tirarDaFila(){
        if(! filaVazia()){
            primeiro++;
            quantidade_elementos--;
        }
    }

    public boolean filaCheia() {
        if (quantidade_elementos == tamanho - 1){
            return true;
        } else {
            return false;
        }
    }

    public boolean filaVazia() {
        if (quantidade_elementos == 0){
            return true;
        } else {
            return false;
        }
    }

    public void mostrarFila(){

        String elementos = "";

        System.out.println("\nQuestão 1: ");

        System.out.println();

        for (int i = primeiro; i <= ultimo; i++) {
            elementos += fila[i] + " - ";
        }

        System.out.println(elementos);

    }

    public void quantidadeElementos(){
        System.out.println("\nQuestão 2: ");
        System.out.println("\nQuantidade de elementos da fila - " + quantidade_elementos);
    }

    public void elementosExcluidos(){
        System.out.println("\nQuestão 3: ");
        System.out.println("\nElemento excluído: " + fila[primeiro]);
    }

    public void mostrarTodosElementosExcluidos(){

        String elementos = "";

        System.out.println("\nQuestão 3 - Todos os elementos excluídos: ");

        System.out.println();

        for (int i = 0; i <= primeiro; i++) {
            elementos += fila[i] + " - ";
        }

        System.out.println(elementos);

    }

    // Metódos getters e setters

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(int primeiro) {
        this.primeiro = primeiro;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public int[] getFila() {
        return fila;
    }

    public void setFila(int[] fila) {
        this.fila = fila;
    }

    public int getQuantidade_elementos() {
        return quantidade_elementos;
    }

    public void setQuantidade_elementos(int quantidade_elementos) {
        this.quantidade_elementos = quantidade_elementos;
    }
}
