import java.util.Scanner;
import Itens.Filmes;


public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Filmes Filme = new Filmes(System.in);

        System.out.println("\nEsse é o screen match");

        int validador = 0;
        while (validador == 0){
            System.out.println("\nDigite a senha:");
            String senha = leia.nextLine();
            if (senha.equals("12345")) {
                System.out.println("Acesso autorizado!");
                validador = 1;
            } else {
                System.out.println("Senha incorreta.");
            }
        }

        System.out.println("Vamos cadastrar um filme: ");
        System.out.println("\nQual o nome Do Filme");
        Filme.setNomeDoFilme(leia.nextLine());
        System.out.println("\nQual o ano de lançamento:");
        Filme.setAnoDelancamento(leia.nextInt());
        System.out.println("\nQual a nota atual da critica:");
        Filme.setNotaDaCritica(leia.nextDouble());
        System.out.println("\nQual a nota do Público");
        Filme.setNotaDoExpectador(leia.nextDouble());
        System.out.println("\nÉ incluso em Planos?");
        Filme.setIncluidoNoPlano(leia.nextBoolean());

        String sinopse;
        sinopse = (String.format("""


                        Filme: %s
                        Ano de lançamento: %d
                        Nota da critica: %f
                        Nota do publico: %f
                        Nota Média: %f
                        Estrelas: %d
                        Incluso no plano: %s
                        """,Filme.getNomeDoFilme(),Filme.getAnoDelancamento(),Filme.getNotaDaCritica(),Filme.getNotaDoExpectador(),Filme.getNotaMedia(),Filme.getEstrelas(),Filme.isIncluidoNoPlano()));

        System.out.println(sinopse);

    }

}