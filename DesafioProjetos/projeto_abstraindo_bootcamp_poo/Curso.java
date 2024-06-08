package DesafioProjetos.projeto_abstraindo_bootcamp_poo;

public class Curso extends Conteudo {
    private int cargaHoraria;
    

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return super.toString() + " Curso [cargaHoraria=" + cargaHoraria + "]";
    }


    
}
