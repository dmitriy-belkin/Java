// Написать метод, который принимает массив элементов, помещает их в стэк 
// и выводит на консоль содержимое стэка.

public class Task_13_1 {
    private int size;
    private int[] array;
    private int top;

    public Task_13_1(int s) {
        size = s;
        array = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int a) {
        int i = ++top;
        array[i] = a;
        System.out.println(array[i]);
    }

    public static void main(String[] args) {
        Task_13_1 stack = new Task_13_1(5);
        stack.push(5);
        stack.push(4);
        stack.push(7);
        stack.push(10);
        stack.push(8);

    }
}