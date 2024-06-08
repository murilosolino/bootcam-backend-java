package DesafioProjetos.projeto_abstraindo_bootcamp_poo;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscritos;
    private Set<Conteudo> conteudoConcluido;

    public Dev(){
        conteudoConcluido = new LinkedHashSet<>();
        conteudoInscritos =  new LinkedHashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }

    
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
      Optional <Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
      if(conteudo.isPresent()){
        this.conteudoConcluido.add(conteudo.get());
        this.conteudoInscritos.remove(conteudo.get());
      } else {
        System.err.println("Voce nao esta inscrtito em nenhum conteudo !!");
      }
    };

    public double calcularXp(){

     return this.conteudoConcluido.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
     
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudoInscritos == null) ? 0 : conteudoInscritos.hashCode());
        result = prime * result + ((conteudoConcluido == null) ? 0 : conteudoConcluido.hashCode());
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
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudoInscritos == null) {
            if (other.conteudoInscritos != null)
                return false;
        } else if (!conteudoInscritos.equals(other.conteudoInscritos))
            return false;
        if (conteudoConcluido == null) {
            if (other.conteudoConcluido != null)
                return false;
        } else if (!conteudoConcluido.equals(other.conteudoConcluido))
            return false;
        return true;
    }



        
}
