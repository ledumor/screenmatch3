import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Recomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("The Godfather");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(121);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        meuFilme.avalia(9);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTempradas(10);
        lost.setEpisodiosPorTemporada(9);
        lost.setMinutosPorEpisodios(30);
        lost.avalia(9);
        lost.avalia(8);
        System.out.println("Total de avalidação do " + lost.getNome() + " = " + lost.getTotalDeAvaliacoes());
        System.out.println("Media = " + lost.pegaMedia());
        System.out.println("Duração total = " +  lost.getDuracaoEmMinutos() + " minutos");


        Filme outroFilme = new Filme();
        outroFilme.setNome("Rei Leão");
        outroFilme.setAnoDeLancamento(2000);
        outroFilme.setDuracaoEmMinutos(60+27);
        System.out.println("duracao do filme " + outroFilme.getNome() + " = "
                + outroFilme.getDuracaoEmMinutos() + " minutos");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluiTempo(meuFilme);
        calculadora.incluiTempo(outroFilme);
        calculadora.incluiTempo(lost);
        System.out.println(calculadora.getTempoTotal());

        // - classificando um filme - utilizando a interface Classificavel
        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        // classificando um episodio - utilizando a interface Classificavel
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(30);
        filtro.filtra(episodio);

    }
}