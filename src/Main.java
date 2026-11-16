import java.util.Scanner;

public class Main {
    public static void main (String[] args){
     Carro[] carros = new Carro[50];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos carros deseja declarar: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        if (quantidade < 1 || quantidade > 50){
            System.out.println("A quantidade tem que ser maior que 1 e menor que 50");
            return;
        }
        int contador = 0;

        while (contador < quantidade) {
        carros [contador] = new Carro();

            System.out.println("Digite a marca do carro: ");
            String nome = scanner.nextLine();
            carros[contador].nome =nome;

            System.out.println("Digite o valor do carro: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();
            carros[contador].preco = valor;

            System.out.println("Digite o ano do carro: ");
            int ano = scanner.nextInt();
            scanner.nextLine();
            carros[contador].ano = ano;

            contador ++;
        }
        double soma = 0;

        for ( int i=0; i<quantidade; i++){
            soma += carros[i].preco;
            System.out.println();

            System.out.println("Nome " + carros[i].nome +" Ano do carro: " + carros[i].ano );
        }
        System.out.println("Total de carros cadastrados: " + quantidade);
        System.out.println("Soma dos preços: R$ " + soma);
    }
}