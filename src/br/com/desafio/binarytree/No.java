package br.com.desafio.binarytree;

/**
 * 
 * @author helder.araujo
 * @since 08.06.2018
 */
public class No {

	private Integer weight;
	private No leftSide;
	private No rightSide;

	public No() {}

	public No(Integer weight) 
	{
		super();
		this.weight = weight;
	}

	public Integer getWeight() 
	{
		return weight;
	}

	public void setWeight(Integer weight) 
	{
		this.weight = weight;
	}

	public No getLeftSide() 
	{
		return leftSide;
	}

	public void setLeftSide(No leftSide) 
	{
		this.leftSide = leftSide;
	}

	public No getRightSide() 
	{
		return rightSide;
	}

	public void setRightSide(No rightSide) 
	{
		this.rightSide = rightSide;
	}
	
	@Override
	public String toString() {
		return "Nó de Peso: " + weight ;
	}
}
