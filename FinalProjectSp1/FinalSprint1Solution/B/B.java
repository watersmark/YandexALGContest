// Номер посылки: 39350327


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
