package com.surya.newbst.bst;

public class bst {
	Node rootNode=null;
	Node temp;
	int counter=0;
	public Node createNode(int val)
	{
		Node n= new Node();
		n.data=val;
		n.right=null;
		n.left=null;
		return n;
	}
	public Node insertElem(int newElem)
	{
		
		if(rootNode==null)
		{
			Node n=createNode(newElem);
			rootNode=n;
			temp=rootNode;
		}
		else
		{
			if(newElem>temp.data && temp.right==null)
			{
				
				
				Node n=createNode(newElem);
				temp.right=n;
				temp=rootNode;
			}
			else if(newElem>temp.data && temp.right!=null)
			{
				temp=temp.right;
				return insertElem(newElem);
			}
			else if(newElem<temp.data && temp.left==null)
			{
				Node n=createNode(newElem);
				temp.left=n;
				temp=rootNode;
			}
			else
			{
				temp=temp.left;
				return insertElem(newElem);
			}
		}
		return temp;
	}
	
	public String searchElem(int elem) throws Exception
	{
		
		if(elem==temp.data)
		{
			System.out.println("found at level"+counter);
			counter=0;
			temp=rootNode;
			return "found";
		}
		if (elem>temp.data)
		{
			counter++;
			temp=temp.right;
			return searchElem(elem);
		}
		if (elem<temp.data)
		{
			counter++;
			temp=temp.left;
			return searchElem(elem);
		}
		return "";
	}
}
