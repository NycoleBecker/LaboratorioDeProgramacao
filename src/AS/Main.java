package AS;
import java.util.ArrayList;
import java.util.Scanner;
                                            /*  NYCOLE BECKER E BRYAN */
public class Main {
    public static void main(String[] args) {

        ArrayList<Series> biblioteca = new ArrayList<Series>();
        Scanner tc = new Scanner(System.in);
        int programa = 0;
        do {
            System.out.println("\nDigite 1 para adicionar uma série: ");
            System.out.println("Digite 2 para listar as séries: ");
            System.out.println("Digite 3 para remover uma série por posição: ");
            System.out.println("Digite 4 para remover uma série pelo nome: ");
            System.out.println("Digite 5 para encontrar uma série pelo nome: ");
            System.out.println("Digite 6 para mostrar a quantidade de séries disponíveis:");
            System.out.println("Digite 7 para atualizar alguma série:");
            System.out.println("Digite 8 para encerrar o programa.");
            programa = tc.nextInt();
            switch (programa) {
                case 1: {
                    Series series = new Series();
                    series.lerDados();
                    biblioteca.add(series);
                    break;
                }
                case 2: {
                    System.out.println("\n --- SÉRIES DISPONÍVEIS ---:");
                    for (int i=0; i<biblioteca.size(); i++){
                        biblioteca.get(i).exibirDados();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Digite o número da série para removê-la: ");
                    int posicao= tc.nextInt();
                    Series apagar = biblioteca.remove(posicao);
                    if(apagar!=null){
                        System.out.println("A série "+apagar.nomeSerie+ " foi removida.");
                    }else{
                        System.out.println("Desculpa, mas a série "+apagar.nomeSerie+" não foi encontrada.");
                    }
                    break;
                }

                case 4: {
                    System.out.println("Digite o nome da série que deseja remover: ");
                    String nome = tc.next();
                    Series apagar = new Series(nome);
                    if(biblioteca.remove(apagar)){
                        System.out.println("A série "+apagar.nomeSerie+" foi removida.");
                    }else{
                        System.out.println("Desculpa, mas a série "+apagar.nomeSerie+ " não foi encontrada.");
                    }
                    break;
                }

                case 5: {
                    System.out.println("Digite o nome da série que deseja encontrar:");
                    String nome = tc.next();
                    Series buscar = new Series(nome);
                    if(biblioteca.contains(buscar)){
                        System.out.println("A série "+buscar.nomeSerie+" está disponível, ela corresponde ao número "+biblioteca.indexOf(buscar)+".");
                    }else{
                        System.out.println("Desculpe, mas a série "+buscar.nomeSerie+ " não foi encontrada.");
                    }
                    break;
                }

                case 6: {
                    System.out.println("A quantidade de séries disponíveis é "+biblioteca.size()+".");
                    break;
                }

                case 7:{
                    System.out.println("Digite o nome da série que deseja atualizar: ");
                    String nome = tc.next();
                    Series busca = new Series(nome);
                    if(biblioteca.contains(busca)){
                        int i = biblioteca.indexOf(busca);
                        Series newLivro = new Series();
                        newLivro.lerDados();
                        biblioteca.set(i, newLivro);
                    }else{
                        System.out.println("Desculpe, mas a série "+busca.nomeSerie+ " não foi encontrada.");
                    }
                    break;
                }
                case 8:{
                    System.out.println("\nPROGRAMA ENCERRADO");
                }
            }
        }while (programa != 8);
    }
}
