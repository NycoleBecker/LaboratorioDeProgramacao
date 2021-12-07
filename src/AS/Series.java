package AS;
import java.util.Objects;
import java.util.Scanner;
import java.lang.String;

                                    /*  NYCOLE BECKER E BRYAN */

public class Series {
    public int qntdEpisodios;
    public int qntsTemporadas;
    public String nomeSerie;
    public String sinopse;
    public String serieAssistida;

    public void lerDados(){
        System.out.println("- Informe o nome da série: ");
        Scanner tc = new Scanner(System.in);
        nomeSerie = tc.nextLine();

        System.out.println("- Informe a sinopse da série: ");
        sinopse = tc.nextLine();

        System.out.println("- Informe a quantidade de episódios da série: ");
        try{
            qntdEpisodios = tc.nextInt();
        }catch (Exception io){
            System.out.println("O que você digitou não é válido.");
            lerDados();
        }

        System.out.println("- Informe a quantidade de temporadas da série: ");
        try{
            qntsTemporadas = tc.nextInt();
        }catch (Exception io){
            System.out.println("O que você digitou não é válido.");
            lerDados();
        }

        System.out.println("- Você já assistiu essa série? (Sim) ou (Não)");
        serieAssistida = tc.next();
    }
    public Series(){

    }
    public Series(String nome){
        this.nomeSerie=nome;
    }

    public void exibirDados(){
        System.out.println("Série: "+this.nomeSerie);
        System.out.println("Sinopse da Série: "+this.sinopse);
        System.out.println("Quantidade de Episódios: "+this.qntdEpisodios);
        System.out.println("Quantidade de Temporadas: "+this.qntsTemporadas);
        System.out.println("Série assistida? "+this.serieAssistida+"\n");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(nomeSerie, series.nomeSerie);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nomeSerie);
    }
}

