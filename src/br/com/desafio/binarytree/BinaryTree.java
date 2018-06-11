package br.com.desafio.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
	
	private No noRaiz;

	public boolean isEmpty()
	{
        if(noRaiz == null)
        {
            return true;
        }
        return false;
    }
	
	public int getWeight()
	{
        return getWeight(this.noRaiz);
    }
    
    private int getWeight(No raiz)
    {
        if(raiz == null)
        {
            return 0;
        }
        int left = getWeight(raiz.getLeftSide());
        int right = getWeight(raiz.getRightSide());
      
        if(left > right)
        {
            return left + 1;
        } 
        else 
        {
            return right + 1;
        }
    }
    
    public int getQuantityNos()
    {
        return getQuantityNos(noRaiz);
    }
    
    private int getQuantityNos(No raiz)
    {
        
    	if(raiz == null)
    	{
            return 0;
        }
        int quantityNosLeftSide = getQuantityNos(raiz.getLeftSide());
        int quantityNosRightSide = getQuantityNos(raiz.getRightSide());
        return quantityNosLeftSide + quantityNosRightSide + 1;
    }
    
    public void show()
    {
        if(this.noRaiz == null) 
        {
            System.out.println("A arvore esta sem nós");
        }
        
        else 
        {
        	show(this.noRaiz);
        }
        	
    }
    
    private void show(No no)
    {
    	if(no.getLeftSide() != null)
    	{
    		show(no.getLeftSide());
        }
        if (no.getRightSide() != null)
        {
        	show(no.getRightSide());
        }
        List<No> allNos = new ArrayList<No>();
        allNos.add(no);
        System.out.println("Nós " + allNos);
    }
    
    public void add(int weight)
    {
        add(this.noRaiz, weight);
    }
    
    public void add(No no, int weight) 
    {
        if(this.noRaiz == null)
        {
            this.noRaiz = new No(weight);
        } 
        else 
        {
            if (weight < no.getWeight()) 
            {
                if (no.getLeftSide() != null) 
                { 
                    add(no.getLeftSide(), weight); 
                } 
                else 
                { 
                    no.setLeftSide(new No(weight)); 
                } 
           
            } 
            else if (weight > no.getWeight()) 
            { 
           
                if (no.getRightSide() != null) 
                { 
                    add(no.getRightSide(), weight); 
                } 
                else 
                {
                    no.setRightSide(new No(weight)); 
                } 
            }
        }
    }
    
    
}
