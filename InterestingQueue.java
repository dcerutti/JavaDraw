import java.io.IOException;

public class InterestingQueue {
		int data;
        InterestingQueue next = null;
        

        public InterestingQueue(int data)
        {
                this.data = data;
        }

        public static void main(String args[]) throws IOException
        {
                InterestingQueue head, tail;
                head = tail = new InterestingQueue(5);
                
                // enqueue the numbers 0 through 20
                for (int i = 0; i < 20; i++) {
                        tail.next = new InterestingQueue((i * 7) % 20);
                        tail = tail.next;
                }

                // dequeue 3 times
                System.out.println("Removing: " + head.data);
                head = head.next;
                System.out.println("Removing: " + head.data);
                head = head.next;
                System.out.println("Removing: " + head.data);
                head = head.next;

                // enqueue 100
                tail = (tail.next = new InterestingQueue(100));

                InterestingQueue curr = head;
                while (curr != null) {
                        System.out.print(curr.data + " -> ");
                        curr = curr.next;
                }
                System.out.println("END");
                System.in.read();
        }
}
