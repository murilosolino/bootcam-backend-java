package DesafioProjetos.projeto_abstraindo_bootcamp_poo;

public abstract class  Conteudo {
    
   protected static final double  XP_PADRAO = 10.0;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String dfescricao) {
        this.descricao = dfescricao;
    }

    @Override
    public String toString() {
        return "Conteudo [titulo=" + titulo + ", dfescricao=" + descricao + "]";
    }


    
}
