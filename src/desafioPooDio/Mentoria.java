package desafioPooDio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public double calcularXp(){
        return XP_PADRAO + 20;
    }

    public Mentoria() {

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [data=" + data + ", getTitulo()=" + getTitulo() + ", getDescricao()=" + getDescricao() + "]";
    }

  

   

}
