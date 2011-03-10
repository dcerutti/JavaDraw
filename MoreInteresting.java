import java.io.*;

public class MoreInteresting {

        public static void main(String args[]) throws IOException
        {
                // Make a doubly linked list
                List tail;
                List head = new List(null, 10);
                tail = head;
                for (int i = 0; i < 10; i++)
                        head = new List(head, i);

                // Make a binary search tree
                BST tree = new BST(5);
                tree = tree.insert(2);
                tree = tree.insert(10);
                tree = tree.insert(8);
                tree = tree.insert(9);
                tree = tree.insert(1);
                tree = tree.insert(3);

                // Pause for input
                System.in.read();
        }
}

class List {
	int data;
        List prev, next;
        public List(List n, int d) 
        { 
                next = n; 
                data = d; 
                if (n != null)
                        n.prev = this;
        }

    
}

class BST {
        final int data;
        final BST left, right;

        public BST() {
                data = 0;
                left = right = null;
        }

        public BST(int n) 
        {
                data = n;
                left = new Leaf();
                right = new Leaf();
        }

        public BST(int n, BST l, BST r)
        {
                data = n;
                left = l;
                right = r;
        }

        public BST insert(int d) 
        {
                if (d < data)
                        return new BST(data, left.insert(d), right);
                else
                        return new BST(data, left, right.insert(d));
        }
}

class Leaf extends BST {
        public Leaf() {}

        @Override
        public BST insert(int n)
        {
                return new BST(n);
        }
}
