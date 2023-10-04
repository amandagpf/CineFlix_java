import br.com.cineflix.calculos.CalculadoraDeTempo;
import br.com.cineflix.calculos.FiltroRecomendacao;
import br.com.cineflix.modelos.Episodio;
import br.com.cineflix.modelos.Filme;
import br.com.cineflix.modelos.Serie;

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

        Filme outroFilme = new Filme();
        outroFilme.setNome("Meninas Malvadas");
        outroFilme.setAnoDeLancamento(2001);
        outroFilme.setDuracaoEmMinutos(120);
        System.out.println(outroFilme.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(sheldon);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(sheldon);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);
    }

}
