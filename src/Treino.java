import java.util.ArrayList;

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
}
