package desafioPooDio;

public abstract class Conteudo {

    // protect só as classes filhas podem acessar, que no caso são conteudo e
    // mentoria. E static quer dizer o que o xp-padrao pode ser acessada fora dessa
    // classe conteudo.
    // final é uma costante e o atributo tem de ser em caixa alta .
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    // no caso esse calcularXp é um métado que estão nas classes filhas que sao
    // curso e mentoria, por isso tem que ser abstract pois cada uma das classes
    // trabalhar de forma independete nesse método
    public abstract double calcularXp();

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

}
