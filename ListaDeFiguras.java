package figurasgeometricas;


public class ListaDeFiguras {
    private boolean ordenada;
    private int qtd;
    private Circulo[] dados;


    public ListaDeFiguras(int tam) {
    dados = new Circulo[tam];
    }
    public void inserir(Circulo circ) { //alterar para não inserir circulos iguais
        if (isFull() == true) {
            System.out.println("Lista cheia!");
        }
        else {
            this.dados[this.qtd] = circ;
            this.qtd ++;
            this.ordenada = false;
        }
    }
    public void exibirLista() {
        if (isEmpty() == true) {
            System.out.println("Lista vazia!");
        }
        else {
            for (int i = 0; i < this.qtd; i++) {
                System.out.println(this.dados[i]);
            }
        }
    }
    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull() {
        if (this.qtd == this.dados.length) {
            return true;
        }
        else {
            return false;
        }
    }
    public void arraySorting() {
        for (int i = 1; i < this.qtd; ++i) {
            Circulo key = this.dados[i];
            int j = i - 1;
 
            while (j >= 0 && this.dados[j].compareTo(key) > 0) {
                this.dados[j + 1] = this.dados[j];
                j--;
            }
            this.dados[j + 1] = key;
        }
        this.ordenada = true;
        System.out.println("Operação realizada com sucesso");
    }
    public int buscar(Circulo c) {
        int pos;
        if (this.ordenada == true) {
            pos = this.buscaBinaria(c);
        }
        else {
            pos = buscaSequencial(c);
        }
        return pos;
    }
}
