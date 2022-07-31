import desafio.dio.dominio.Curso;
import desafio.dio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("JavaScript");
        curso.setDescricao("Curso sobre JavaScript");
        curso.setCargahorario(10);
        System.out.println(curso);

    }
}
