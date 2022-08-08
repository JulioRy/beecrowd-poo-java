// Algoritmo Fundamental Nº 2 JS
// Descrição : Contagem
// Problema  : Dado um conjunto de n notas de alunos em um exame,
//             fazer uma contagem do número de alunos que foram
//             aprovados no exame. Será considerado aprovado o aluno
//             que tirar nota 50 ou maior (no intervalo de 0 a 100).
// Aplicações: Todas as formas de contagem.

import java.util.Scanner;

public class untitled {
    public static void main(String[] args) {

        Scanner entrada;
        int i;
        int contador = 0;
        int nota;

        System.out.println("Informe qnt de notas dos alunos");
        entrada = new Scanner(System.in);
        int n = entrada.nextInt();

        for (i = 0; i < n; i++) {
            System.out.println("Informe a nota do aluno");
            Scanner entrada2;
            entrada2 = new Scanner(System.in);
            nota = entrada2.nextInt();
            if (nota >= 50) {
                contador++;
            }
        }

        System.out.println("Numero de alunos aprovados " + contador);
    }


}


