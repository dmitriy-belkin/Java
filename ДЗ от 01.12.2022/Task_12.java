// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() 
// - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.NoSuchElementException;

public class Task_12<E> {

    private DoublyLinkedNode<E> beginning;
    private DoublyLinkedNode<E> end;

    int size;

    public void enqueue(E item) {

        DoublyLinkedNode<E> oldEnd = this.end;

        DoublyLinkedNode<E> oldNewEnd = new DoublyLinkedNode<E>(item);

        if (oldEnd != null) {
            oldEnd.setWillBe(oldNewEnd);
            oldNewEnd.setWillBe(null);
            this.end = oldNewEnd;

        } else {
            this.end = oldNewEnd;
            this.beginning = oldNewEnd;
        }
        size++;
    }

    public boolean isEmpty() {
        return this.beginning == null;
    }

    public int length() {
        return size;
    }

    public E deque() {
        if (isEmpty()) {
            throw new NoSuchElementException("Недостаточный поток очереди");
        }

        E data = this.beginning.getData();

        this.beginning = this.beginning.getWillBe();

        size--;

        return data;
    }

    public E peek() {
        return this.beginning.getData();
    }

    public static void main(String[] args) {
        Task_12<Double> list = new Task_12<Double>();
        list.enqueue(21.7);
        list.enqueue(42.1);
        list.enqueue(87.6);
        list.enqueue(51.3);
        list.enqueue(98.7);

        list.deque();
        System.out.println("Просмотр списка очередей: " + list.peek());

        list.deque();
        System.out.println("Длина списка очереди: " + list.length());
        System.out.println("Просмотр списка очередей: " + list.peek());
    }
}

class DoublyLinkedNode<E> {
    private E data;
    private DoublyLinkedNode<E> willBe;
    private DoublyLinkedNode<E> previousBe;

    public DoublyLinkedNode(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public DoublyLinkedNode<E> getWillBe() {
        return willBe;
    }

    public void setWillBe(DoublyLinkedNode<E> nextNode) {
        this.willBe = nextNode;
    }

    public DoublyLinkedNode<E> getPreviousBe() {
        return previousBe;
    }

    public void setPreviousBe(DoublyLinkedNode<E> prevNode) {
        this.previousBe = prevNode;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

}