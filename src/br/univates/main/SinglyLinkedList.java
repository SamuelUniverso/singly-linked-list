package br.univates.main;

public class SinglyLinkedList {
	
	public Node head; /// cabecalho
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
    
    Node sortedMerge(Node a, Node b)
    {
    	Node result = null;

        if (a == null)
            return b;
        if (b == null)
            return a;
 
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
 
    public Node mergeSort(Node h)
    {
        if (h == null || h.next == null) {
            return h;
        }
 
        Node middle = getMiddle(h);
        Node nextofmiddle = middle.next;
 
        middle.next = null;
 
        Node left = mergeSort(h);
 
        Node right = mergeSort(nextofmiddle);
 
        Node sortedlist = sortedMerge(left, right);
        return sortedlist;
    }
 
    public static Node getMiddle(Node head)
    {
        if (head == null)
            return head;
 
        Node slow = head, fast = head;
 
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
