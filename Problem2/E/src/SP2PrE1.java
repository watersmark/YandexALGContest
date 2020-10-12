import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

class LinkedArray{

    public String name;
    public LinkedArray nextElem;

    LinkedArray(String name, LinkedArray el){
        this.name = name;
        this.nextElem = el;
    }

    // Для добавления пустых значений
    public void addElem(LinkedArray elem){
        this.nextElem = elem;
    }

    public static LinkedArray addElemInd(LinkedArray node, int index, String value){
        LinkedArray head = node;
        LinkedArray new_elem = new LinkedArray(value, null);

        if(index == 0){
            new_elem.nextElem = head;
            return new_elem;
        }

        int last_ind = 0;

        while(last_ind != index - 1){
            node = node.nextElem;
            last_ind ++;
        }

        LinkedArray tempInd = node.nextElem;
        node.nextElem = new_elem;
        new_elem.nextElem = tempInd;

        return head;
    }

}


public class SP2PrE1 {
    public static void main(String[] args) {

        LinkedArray third = new LinkedArray("Third", null);
        LinkedArray second = new LinkedArray("Second",third );
        LinkedArray head = new LinkedArray("First", second);

        LinkedArray.addElemInd(head, 2, "Good");

        LinkedArray now = head;

        while (true){

            if(now.nextElem == null){
                System.out.println("Null");
                break;
            }

            System.out.println(now.name);

            now = now.nextElem;


        }


    }
}
