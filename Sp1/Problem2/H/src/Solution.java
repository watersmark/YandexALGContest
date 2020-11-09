class Node<V> {
    public V value;
    public Node<V> next;
    public Node<V> prev;

    public Node(V value, Node<V> next, Node<V> prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}


public class Solution {

    public static Node<String> solution(Node<String> head) {

        //Node<String> temp = null;

        for (int i = 0; ; i++) {
            try {

                if(head.next == null){
                    throw new Exception();
                }

                Node<String> temp = head.next;

                if (i == 0) {
                    Node<String> tempS = head.prev;

                    head.prev = head.next;
                    head.next = tempS;
                    head = temp;
                    continue;
                }

                head.next = head.prev;
                head.prev = temp;
                head = temp;


            } catch (Exception e) {

                Node<String> tempF = head.next;

                head.next = head.prev;
                head.prev = tempF;

                return head;
            }
        }
        //return head;
    }

    public static void main(String[] args) {
        /*
        Node<String> el1 = new Node<String>("GG", null, null);
        Node<String> el2 = new Node<String>("BB", null, el1);
        Node<String> el3 = new Node<String>("DD", null, el2);

        el1.next = el2;
        el2.next = el3;


        Node<String> test = solution(el1);

        while (true){

            System.out.println(test.value);

            if(test.next == null){
                break;
            }

            test = test.next;

        }

        System.out.println("FFFFFF");

         */
    }
}
