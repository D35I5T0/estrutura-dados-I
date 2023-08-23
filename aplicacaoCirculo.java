package figurasgeometricas;
import java.util.Scanner;
public class aplicacaoCirculo {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int op;
        System.out.println("Informe a quantidade de círculos: ");
        int tam = sc.nextInt();
        ListaDeFiguras listaCirculos = new ListaDeFiguras(tam);


        do {
            menu();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe o raio do círculo: ");
                    double raio = sc.nextDouble();
                    System.out.println("Informe a posição: ");
                    System.out.println("X: ");
                    double x = sc.nextDouble();
                    System.out.println("Y: ");
                    double y = sc.nextDouble();
                    Circulo c = new Circulo(x, y, raio);
                    listaCirculos.inserir(c);
                    break;
                case 2:
                    listaCirculos.exibirLista();
                    break;
                case 3:
                    listaCirculos.arraySorting();
                    break;
                case 0:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }    
        } while (op != 0);
        sc.close();
    }
    public static void menu () {
        System.out.println("Opções \r\n"
        + "1- Inserir círculo. \r\n"
        + "2- Exibir lista.\r\n"
        + "3- Ordenar lista.\r\n"
        + "0- Finalizar programa.");
    }
}
