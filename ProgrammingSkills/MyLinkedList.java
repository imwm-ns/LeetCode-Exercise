import java.util.LinkedList;

class MyLinkedLists {
    LinkedList<Integer> linkedLst;
    public MyLinkedLists() {
        linkedLst = new LinkedList<>();
    }
    
    public int get(int index) {
        if (index >= linkedLst.size()) return -1;
        return linkedLst.get(index);
    }
    
    public void addAtHead(int val) {
        linkedLst.addFirst(val);
    }
    
    public void addAtTail(int val) {
        linkedLst.addLast(val);
    }
    
    public void addAtIndex(int index, int val) {
        if (index < linkedLst.size()) linkedLst.add(index, val);
        else if (index == linkedLst.size()) linkedLst.addLast(val);
    }
    
    public void deleteAtIndex(int index) {
        if (index < linkedLst.size()) linkedLst.remove(index);
    }
}

public class MyLinkedList {
    public static void main(String[] args) {
        MyLinkedLists myLinkedList = new MyLinkedLists();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        myLinkedList.get(1);              // return 2
        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        myLinkedList.get(1);              // return 3
    }
}
