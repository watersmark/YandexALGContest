class Node<V> {
    public V value;
    public Node<V> next;

    public Node(V value, Node<V> next) {
        this.value = value;
        this.next = next;
    }
}

public class testSol {
    public static void solution(Node<String> head){

        while(true){
            if(head.value == null){
                break;
            }
            System.out.println(head.value);

            if(head.next.value != null){
                head = head.next;
            }
            else{
                break;
            }

        }

    }

    public static void main(String[] args) {


    }
}
