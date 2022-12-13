package br.univates.main;

public class SinglyLinkedList {
	
	Node head; /// cabecalho
	 
	/// Nó da lista
    static class Node {
   
        int data;
        Node next;
   
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
   
    /**
     * Insere um novo nó
     * @param list
     * @param data
     * @return
     */
    public SinglyLinkedList insert(SinglyLinkedList list, int data)
    {
        Node new_node = new Node(data);
         
   
        /// Se a lista estiver vazia, novo nó vira cabeçalho
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            /// Senao, percorre lista até o final
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            /// Insere o no no final
            last.next = new_node;
        }
   
        return list;
    }
   
    /**
     * Imprime lista
     * @param list
     */
    public void printList()
    {
        Node currNode = this.head;
    
        System.out.print("LinkedList: ");
    
        while (currNode != null) {
            System.out.print(currNode.data + " ");
    
            currNode = currNode.next;
        }
    }

}
