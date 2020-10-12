class Node<V> {
    public V value;
    public Node<V> next;

    public Node(V value, Node<V> next) {
        this.value = value;
        this.next = next;
    }
}

public class Solution {
    public static int solution (Node<String> head, String elem){

        int index = 0;
        //boolean bool = false;

        while (true){
            try {

                if(head.value.equals(elem)){
                    return index;
                }

                    head = head.next;
                    index++;
            }
            catch (Exception e){
                break;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
