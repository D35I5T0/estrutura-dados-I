public class ListaDeFiguras {
    private int qtd;
    private Circulo[] dados;

    public ListaDeFiguras(int tam) {
    dados = new Circulo[tam];
    qtd = 0;
    }
    public void inserirNaLista(Circulo circ) {
        this.dados[this.qtd] = circ;
        this.qtd ++;
    }
    public void exibirLista() {
        for(int i = 0; i < this.qtd; i++) {
            System.out.println(this.dados[i]);
        }
    }
    public void arraySort() {
        for (int i = 1; i < this.qtd; ++i) {
            Circulo key = this.dados[i];
            int j = i - 1;
 
            while (j >= 0 && this.dados[j].getRaio().compareTo(key.getRaio()) { //incompleto
                this.dados[j + 1] = this.dados[j];
                j--;
            }
            this.dados[j + 1] = key;
        }
    }
}
