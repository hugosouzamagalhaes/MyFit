import java.util.ArrayList;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

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
}
