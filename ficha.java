import java.util.Scanner;

public class ficha {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Circulo [] figuras;
        System.out.println("Informe a quantidade de círculos: ");
        int tam = sc.nextInt();
        figuras = new Circulo[tam];


        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Círculo " + (i+1) + ": ");
            System.out.println("Informe a coordenada X: ");
            double x = sc.nextDouble();
            System.out.println("Informe a coordenda Y: ");
            double y = sc.nextDouble();
            System.out.println("Informe o tamanho do raio: ");
            double r = sc.nextDouble();
            Circulo c = new Circulo(x, y, r);
            figuras[i] = c;
        }


        do {
            System.out.println("1- Circuferência do círculo.\r\n"
            + "2- Área do círculo.\r\n"
            + "3- Volume da esfera.\r\n"
            + "4- Mover círculo.\r\n"
            + "5- Comparar dois círculos.\r\n"
            + "0- Finalizar programa.");
        }
        sc.close();
    }
}