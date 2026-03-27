import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Treino meuTreino = criarTreino(scanner);

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {

            Exercicio novoExercicio = criarExercicio(scanner);

            meuTreino.exercicios.add(novoExercicio);
            System.out.println("-> Exercício adicionado com sucesso!\n");
            System.out.println("Deseja adicionar outro exercício neste treino? (s/n)");
            continuar = scanner.nextLine();
        }
        System.out.println("\nTreino finalizado com sucesso!");

        meuTreino.exibirFicha();
        meuTreino.salvarEmArquivo();


        scanner.close();


    }

    public static Treino criarTreino(Scanner scanner) {
        System.out.println("--- Criação de Treino ---");
        System.out.println("Digite o nome do treino (ex: Treino A - Peito e Tríceps): ");
        String nomeTreino = scanner.nextLine();
        System.out.println("Treino criado, agora vamos adicionar exercícios!");

        return new Treino(nomeTreino);
    }

    public static Exercicio criarExercicio(Scanner scanner) {
        System.out.println("\n--- Novo Exercício ---");
        System.out.println("Digite o grupo muscular: ");
        String grupoMuscular = scanner.nextLine();
        System.out.println("Digite o nome do exercício: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o número de séries: ");
        int series = scanner.nextInt();

        System.out.println("Digite o número de repetições: ");
        int reps = scanner.nextInt();

        System.out.println("Digite a carga em kg: ");
        double carga = scanner.nextDouble();

        scanner.nextLine();

        return new Exercicio(nome, grupoMuscular, series, reps, carga);
    }
}