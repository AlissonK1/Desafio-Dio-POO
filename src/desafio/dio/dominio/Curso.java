package desafio.dio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargahorario;

    public Curso() {
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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargahorario() {
        return cargahorario;
    }

    public void setCargahorario(int cargahorario) {
        this.cargahorario = cargahorario;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargahorario=" + cargahorario +
                '}';
    }
}