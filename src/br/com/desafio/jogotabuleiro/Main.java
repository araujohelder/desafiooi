package br.com.desafio.jogotabuleiro;

public class Main {
    public static void  main(String[] args) {
        String[] dado =  {"1", "2", "3", "4", "5", "6"};
        String[] saida;
        int numberOfHouses = 5;
        Games p = new Games(dado, 6, numberOfHouses) ;
        while (p.hasNext()) {
            saida = p.next();
            System.out.print("combinações: ");
            for ( String e : saida ) {
                System.out.print(e + "," );
            }
            System.out.println() ;
        }
    }
}