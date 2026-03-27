public class Exercicio {
    private String nome;
    private String grupoMuscular;
    private int series;
    private int reps;
    private double carga;

    //Construtor
    public Exercicio(String nome, String grupoMuscular, int series, int reps, double carga)
    {
        this.nome = nome;
        this.grupoMuscular = grupoMuscular;
        this.series = series;
        this.reps = reps;
        this.carga = carga;
    }

    public String getNome(){
        return nome;
    }
    public String getGrupoMuscular(){
        return grupoMuscular;
    }
    public int getSeries(){
        return series;
    }
    public int getReps(){
        return reps;
    }
    public double getCarga(){
        return carga;
    }
}
