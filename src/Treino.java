import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Treino
{
    String nome;
    ArrayList<Exercicio> exercicios = new ArrayList<>();

    public Treino(String nome){
        this.nome = nome;
    }

    public void exibirFicha(){
        System.out.println("\n==================================");
        System.out.println("FICHA CADASTRADA " + this.nome);
        System.out.println("\n==================================");

        for(Exercicio i : exercicios){
            System.out.println(" " + i.getNome() + " (" + i.getGrupoMuscular() + ")");
            System.out.println(" " + i.getSeries() + " séries de " + i.getReps() + " repetições. Carga: " + i.getCarga() + "kg\n");
        }
    }
    public void salvarEmArquivo(){
        String nomeDoArquivo = this.nome + ".txt";
        try {
            FileWriter arquivo = new FileWriter(nomeDoArquivo);
            PrintWriter escritor = new PrintWriter(arquivo);
            for (Exercicio i : exercicios) {
                escritor.println(i.getNome() + ";" + i.getGrupoMuscular() + ";" + i.getSeries() + ";" + i.getReps() + ";" + i.getCarga());
            }
            escritor.close();
            System.out.println("O arquivo " + nomeDoArquivo + " foi salvo com sucesso");

        }
        catch(IOException e){
            System.out.println("Ocorreu o seguinte erro ao salvar o arquivo " + nomeDoArquivo + ": " + e.getMessage());
        }


    }
    public void carregarArquivo(){
        String nomeDoArquivo = this.nome + ".txt";
        File arquivo = new File(nomeDoArquivo);
        try {
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()){
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");
                if (dados.length == 5){
                    String nome = dados[0];
                    String grupoMuscular = dados[1];
                    int series = Integer.parseInt(dados[2]);
                    int reps = Integer.parseInt(dados[3]);
                    double carga = Double.parseDouble(dados[4]);

                    Exercicio exercicio = new Exercicio(nome, grupoMuscular, series, reps, carga);
                    this.exercicios.add(exercicio);
                }
            }
            leitor.close();
            System.out.println("O arquivo " + nomeDoArquivo + " foi carregado com sucesso");
        }
        catch (FileNotFoundException e){
            System.out.println("Nenhum arquivo encontrado com este nome: " + nomeDoArquivo);
        }
    }
}
