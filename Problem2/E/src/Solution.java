public class Solution {
    public static void solution(Node<String> head) {

        while (true) {
            try {

                if (head.value == null) {
                    break;
                }

                System.out.println(head.value);
                head = head.next;
                
            } catch (Exception e) {
                break;
            }

        }
    }


}
