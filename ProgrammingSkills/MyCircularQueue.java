class MyCircularQueues {
    private int[] queue;
    private int size, cnt, idx;
    public MyCircularQueues(int k) {
        queue = new int[k];
        cnt = 0; idx = 0;
        size = k;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) return false;
        queue[(idx + cnt) % size] = value;
        cnt += 1;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) return false;
        idx = (idx + 1) % size;
        cnt -= 1;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) return -1;
        return queue[idx];
    }
    
    public int Rear() {
        if (isEmpty()) return -1;
        return queue[(idx + cnt - 1) % size];
    }
    
    public boolean isEmpty() {
        return cnt == 0;
    }
    
    public boolean isFull() {
        return cnt == size;
    }
}

public class MyCircularQueue {
    public static void main(String[] args) {
        MyCircularQueues myCircularQueue = new MyCircularQueues(3);
        myCircularQueue.enQueue(1); // return True
        myCircularQueue.enQueue(2); // return True
        myCircularQueue.enQueue(3); // return True
        myCircularQueue.enQueue(4); // return False
        myCircularQueue.Rear();     // return 3
        myCircularQueue.isFull();   // return True
        myCircularQueue.deQueue();  // return True
        myCircularQueue.enQueue(4); // return True
        myCircularQueue.Rear();     // return 4
    }
}
