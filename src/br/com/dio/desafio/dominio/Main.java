package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("curso Java básico");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("curso JavaScript básico");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("");
        mentoria.setDescricao("");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devValdineia = new Dev();
        devValdineia.setNome("Valdineia");
        devValdineia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devValdineia.getConteudosInscritos());
        devValdineia.progredir();
        devValdineia.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devValdineia.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devValdineia.getConteudosConcluidos());
        System.out.println("XP:" + devValdineia.calcularTotalXp());

        System.out.println("-----------------------");

        Dev devLisa = new Dev();
        devLisa.setNome("Lisa");
        devLisa.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devLisa.getConteudosInscritos());
        devLisa.progredir();
        devLisa.progredir();
        devLisa.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devLisa.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devLisa.getConteudosConcluidos());
        System.out.println("XP:" + devLisa.calcularTotalXp());






    }
}
