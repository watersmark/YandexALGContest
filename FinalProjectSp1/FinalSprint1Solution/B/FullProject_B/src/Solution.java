import javax.swing.*;
import javax.swing.table.TableRowSorter;

// Номер посылки: 39350327

class Node<V> {
    private V value;

    private Node<V> next;

    public Node(V value, Node<V> next) {
        this.value = value;
        this.next = next;
    }

    public V getValue() {
        return value;
    }

    public Node<V> getNext() {
        return next;
    }

    public void setNext(Node<V> next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    public void setValue(V value) {
        this.value = value;
    }
}


// Класс для решения задачи
public class Solution {

    public static String hasCycle (Node head){
        // Объявляем два указателя один будет двигаться быстрее другого
        // Сразу инициализируем их с помощью head
        Node first = head;
        Node second = head;

        while (true){
            // Делаем два шага вторым курсором и на какждом шаге проверяем не закончился ли список
            // Если у списка есть конец, то возвращаем True
            if(!second.hasNext()){
                return "False";
            }
            else{
                second = second.getNext();
                if(!second.hasNext()){
                    return "False";
                }
                second = second.getNext();
            }

            // Для first курсора не проверяем на окончание цикла, так как он медленнее
            // чем второй курсоп(second) и не сможет достичь конца списка раньше него
            first = first.getNext();

            // Проверяем ссылки на объекты, если второй курсор догнал первый
            // То цикл есть
            if (first == second){
                return "True";
            }

        }
    }
}


class Start{
    public static void main(String[] args) {



    }
}