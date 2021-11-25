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

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("");
        mentoria.setDescricao("");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);




    }
}
