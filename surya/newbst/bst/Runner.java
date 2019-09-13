package com.surya.newbst.bst;

public class Runner {
	public static void main(String []args)
	{
		bst n=new bst();
		n.insertElem(16);
		n.insertElem(18);
		n.insertElem(15);
		n.insertElem(20);
		
		n.insertElem(14);
		try {
			n.searchElem(14);
		} catch (Exception e) {
			System.out.println("sorry not found");
		}
		try {
			n.searchElem(18);
		} catch (Exception e) {
			System.out.println("sorry not found");
		}
//		System.out.println(n.rootNode.left.left.data);
	}

}
