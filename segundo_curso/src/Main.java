import cineflix.modelos.Filme;
import cineflix.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1980);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println(meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(4);
        meuFilme.avalia(8);
        meuFilme.avalia(4);

        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.retornaMedia());

        Serie sheldon = new Serie();
        sheldon.setNome("Sheldon");
        sheldon.setAnoDeLancamento(2018);
        sheldon.exibeFichaTecnica();
        sheldon.setTemporadas(8);
        sheldon.setEpisodiosPorTemporada(12);
        sheldon.setMinutosPorEpisodio(25);
        System.out.println("Duração da série: " + sheldon.getDuracaoEmMinutos());
    }

}
