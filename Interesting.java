import java.io.*;

public class Interesting {

        public static void main(String args[]) throws IOException
        {
                List head = new List(null, 10);
                for (int i = 0; i < 10; i++)
                        head = new List(head, i);

                BST tree = new BST(5);
                tree = tree.insert(2);
                tree = tree.insert(10);
                tree = tree.insert(8);
                tree = tree.insert(9);
                tree = tree.insert(1);
                tree = tree.insert(3);

                System.in.read();
        }
}

class List {
        public List(List n, int d) 
        { 
                next = n; 
                data = d; 
        }

        int data;
        List next;
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
