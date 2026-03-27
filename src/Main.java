import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;
        System.out.println("Bem-vindo ao MyFit");
        while (rodando) {
            System.out.println("\nMenu Principal ");
            System.out.println(" 1. Criar novo treino ");
            System.out.println(" 2. Acessar treino criado ");
            System.out.println(" 3. Sair ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
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

                    break;
                case 2:
                    System.out.println("Digite o nome do treino que deseja acessar: ");
                    String nomeArquivo = scanner.nextLine();
                    Treino treinoCarregado = new Treino(nomeArquivo);
                    treinoCarregado.carregarArquivo();
                    treinoCarregado.exibirFicha();
                    break;
                case 3:
                    System.out.println(" Fechando o MyFit... ");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            }
        scanner.close();
        }

        public static Treino criarTreino (Scanner scanner){
            System.out.println("--- Criação de Treino ---");
            System.out.println("Digite o nome do treino (ex: Treino A - Peito e Tríceps): ");
            String nomeTreino = scanner.nextLine();
            System.out.println("Treino criado, agora vamos adicionar exercícios!");

            return new Treino(nomeTreino);
        }

        public static Exercicio criarExercicio (Scanner scanner){
            System.out.println("\n--- Novo Exercício ---");
            System.out.println("Digite o grupo muscular: ");
            String grupoMuscular = scanner.nextLine();
            System.out.println("Digite o nome do exercício: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o número de séries: ");
            int series = scanner.nextInt();
            while (series <= 0) {
                System.out.println("O número de séries deve ser maior que 0. Tente novamente: ");
                series = scanner.nextInt();
            }

            System.out.println("Digite o número de repetições: ");
            int reps = scanner.nextInt();
            while (reps <= 0) {
                System.out.println(" O número de repetições deve ser maior que 0. Tente novamente: ");
                reps = scanner.nextInt();
            }

            System.out.println("Digite a carga em kg: ");
            double carga = scanner.nextDouble();
            while (carga <= 0) {
                System.out.println("A carga deve ser maior que 0. Tente novamente: ");
                carga = scanner.nextDouble();
            }

            scanner.nextLine();

            return new Exercicio(nome, grupoMuscular, series, reps, carga);
        }
    }