package Collections.Set.OperacoesBasicasSet.ConjuntoConvidados;

public class Convidado {
    
    private int codigoConvidado;
    private String nome;

    public Convidado(int codigoConvidado, String nome) {
        this.codigoConvidado = codigoConvidado;
        this.nome = nome;
    }

    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Convidado [codigoConvidado=" + codigoConvidado + ", nome=" + nome + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvidado;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codigoConvidado != other.codigoConvidado)
            return false;
        return true;
    }

    

}
