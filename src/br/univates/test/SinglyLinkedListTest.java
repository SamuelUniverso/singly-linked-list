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
	
	@Test
	public void testMergeSort()
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
        
        list.mergeSort(list.head);
   
        /// Imprimir
        list.printList();
	}
	
	@Test
	public void testRandom()
	{
		 double value = Math.random() * 100;
		 int result = (int) value;
		 System.out.print(result);
	}
	
	@Test
	public void testSpeed()
	{
		/// Bubble Sort
		long iniBubble = System.currentTimeMillis();
		SinglyLinkedList list1 = new SinglyLinkedList();
		for(int i = 0; i < 10000; i++) {
			 double value = Math.random() * 100;
			 int result = (int) value;
			 list1.insert(list1, result);
		}
		list1.bubbleSort();
		long endBubble = System.currentTimeMillis();
		long timeBubble = (endBubble - iniBubble);
		
		/// Merge Sort
		long iniMerge  = System.currentTimeMillis();
		SinglyLinkedList list2 = new SinglyLinkedList();
		for(int i = 0; i < 10000; i++) {
			 double value = Math.random() * 100;
			 int result = (int) value;
			 list2.insert(list2, result);
		}
		list2.mergeSort(list2.head);
		long endMerge  = System.currentTimeMillis();
		long timeMerge = (endMerge - iniMerge);
		
		
		System.out.println(":::::::::::::: Tempo de Execução ::::::::::::::");
		System.out.println("Bubble Sort: " + timeBubble + " ms");
		System.out.println("Merge Sort: " + timeMerge + " ms");
	}
}
