package DesafioProjetos.projeto_abstraindo_bootcamp_poo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setDescricao("curso java");
        curso.setTitulo("Bootcamp Java");
        curso.setCargaHoraria(4);

        curso.calcularXp();

        Mentoria mentoria =  new Mentoria();
        mentoria.setTitulo("Mnetoria Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        
        Bootcamp bootcamp =  new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Dev1: " + dev1.getConteudoInscritos());
        dev1.progredir();
        System.out.println("Conteudos concluidos: " + dev1.getConteudoConcluido());
        System.out.println("XP:" + dev1.calcularXp());

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        System.out.println("Conteudos inscritos Dev 2: " + dev2.getConteudoInscritos());


    }
}
