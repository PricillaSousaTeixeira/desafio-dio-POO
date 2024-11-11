import java.time.LocalDate;

import desafioPooDio.Bootcamp;
import desafioPooDio.Curso;
import desafioPooDio.Dev;
import desafioPooDio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição de Java");
       curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição de JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria01 = new Mentoria();
        mentoria01.setTitulo("Mentoria em Java");
        mentoria01.setDescricao("Descrição de Mentoriia Java");
        mentoria01.setData(LocalDate.now());

        /*
         * System.out.println(curso1);
         * System.out.println(curso2);
         * System.out.println(mentoria01);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootecamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria01);

        Dev aluno01 = new Dev();
        aluno01.setNome("Pricilla");
        aluno01.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos Pricilla" + aluno01.getConteudosInscritos());
        aluno01.progredir();
        aluno01.progredir();
        aluno01.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Pricilla" + aluno01.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Pricilla" + aluno01.getConteudosConcluidos());
        System.out.println("XP:" +aluno01.calcularTotalXp());

        Dev aluno02 = new Dev();
        aluno02.setNome("Sid");
        aluno02.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos Sideilton" + aluno02.getConteudosInscritos());
        aluno02.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Sideilton" + aluno02.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Sideilton" + aluno02.getConteudosConcluidos());
        System.out.println("XP:" +aluno02.calcularTotalXp());


    }
}
