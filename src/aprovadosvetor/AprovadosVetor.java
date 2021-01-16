package aprovadosvetor;

import java.util.Scanner;

public class AprovadosVetor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome[] = new String[3];
        int nota[] = new int[3];

        for (int i = 0; i < nome.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            nome[i] = input.next();
            System.out.print("Digite a nota do " + nome[i] + ": ");
            nota[i] = input.nextInt();

        }

        for (int i = 0; i < nota.length; i++) {
            if (nota[i] > 7) {

                System.out.println("O aluno " + nome[i] + " foi aprovado com a nota " + nota[i]);
            } else 
                System.out.println("O aluno " + nome[i] + " foi reprovado com a nota " + nota[i]);
            

        }
    }

}
