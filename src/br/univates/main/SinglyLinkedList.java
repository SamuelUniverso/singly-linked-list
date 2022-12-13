package br.univates.main;

public class SinglyLinkedList {
	
	Node head; /// cabecalho
	int size;
	 
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
        size++;
   
        return list;
    }
    
    public void bubbleSort() {
        if (size > 1) {
            boolean wasChanged;

            do {
                Node current = head;
                Node previous = null;
                Node next = head.next;
                wasChanged = false;

                while ( next != null ) {
                    if (current.data > next.data) {
                        wasChanged = true;

                        if ( previous != null ) {
                            Node sig = next.next;

                            previous.next = next;
                            next.next = current;
                            current.next= sig;
                        } else {
                            Node sig = next.next;

                            head = next;
                            next.next = current;
                            current.next = sig;
                        }

                        previous = next;
                        next = current.next;
                    } else { 
                        previous = current;
                        current = next;
                        next = next.next;
                    }
                } 
            } while(wasChanged);
        }
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
