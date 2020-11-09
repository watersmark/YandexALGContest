
public class testPrF {
    public static Node<String> solution(Node<String> head, int idx) {
        Node<String> tempF = head;

        if (idx == 0) {
            return head.next;
        }

        while ((idx - 1) > 0) {
            head = head.next;
            idx--;
        }

        try {
            head.next = head.next.next;
        }
        catch (Exception e){
            head.next = null;
        }

        return tempF;
    }

    public static void main(String[] args) {

    }
}
