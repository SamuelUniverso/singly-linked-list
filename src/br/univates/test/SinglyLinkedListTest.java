package br.univates.test;

import org.junit.Test;

import br.univates.main.SinglyLinkedList;

public class SinglyLinkedListTest {

	@Test
	public void testarListaEncadeada()
	{
		SinglyLinkedList list = new SinglyLinkedList();
   
        list.insert(list, 1);
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 4);
        list.insert(list, 5);
        list.insert(list, 6);
        list.insert(list, 7);
        list.insert(list, 8);
   
        /// Imprimir
        list.printList();
	}
	
	@Test
	public void testBubbleSort()
	{
		SinglyLinkedList list = new SinglyLinkedList();
		   
        list.insert(list, 1);
        list.insert(list, 2);
        list.insert(list, 5);
        list.insert(list, 7);
        list.insert(list, 8);
        list.insert(list, 4);
        list.insert(list, 3);
        list.insert(list, 6);
        
        list.bubbleSort();
   
        /// Imprimir
        list.printList();
	}
}
