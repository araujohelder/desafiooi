package br.com.desafio.jogotabuleiro;

public class Games {
    private int[] combinations ;
    private int n ;
    private String[] dado ;
    private int playOptions ;
    private int numberOfHouses;
 
    
    public Games(String[] dado, int playOptions, int numberOfHouses) 
    {
        this.playOptions = playOptions;
        this.n = dado.length;
        this.combinations = new int[playOptions + 1];
        this.dado = dado;
        this.numberOfHouses = numberOfHouses;
    }
 
    public boolean hasNext() 
    {
        return this.combinations[this.playOptions] == 0 ;
    }
 
    public String[] next() 
    {
        String[] saida = new String[this.playOptions];
        int i, j ;
        int sumSteps = 0;
        for(i=0, j=this.playOptions-1; i < this.playOptions; i++) 
        {
            sumSteps+= new Integer(dado[this.combinations[i]]); 
        	if (sumSteps <= this.numberOfHouses) 
            {
            	saida[j] = dado[this.combinations[i]] ;
            }
            else 
            {
            	saida[j] = "0" ;
            }
            j-=1 ;        	
        }
        this.combinations[0] += 1 ;
        for(i=0; i < this.playOptions; i++) 
        {
            if(this.combinations[i] == this.n) 
            {
                this.combinations[i] = 0;
                this.combinations[i+1] += 1 ;
            }
        }
        return saida ;
    }
}