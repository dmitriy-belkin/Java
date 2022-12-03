// Написать метод, который принимает массив элементов, помещает их в очередь и выводит 
// на консоль содержимое очереди

class Task_13_2 {
    private int[] queue;
    private int maximumQuantity;
    private int anotherElement;
    private int frontPart;
    private int backPart;

    public Task_13_2(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
        queue = new int[maximumQuantity];
        backPart = -1;
        frontPart = 0;
        anotherElement = 0;
    }

    public void insert(int elem) {
        if (backPart == maximumQuantity - 1) {
            backPart = -1;
        }

        queue[++backPart] = elem;
        anotherElement++;
    }

    public int remove() {
        int temp = queue[frontPart++];

        if (frontPart == maximumQuantity) {
            frontPart = 0;
        }
        anotherElement--;
        return temp;

    }

    public boolean isEmpty() {
        return (anotherElement == 0);
    }

    public static void main(String[] args) {
        test_2 myQueue = new test_2(5);

        myQueue.insert(1);
        myQueue.insert(2);
        myQueue.insert(3);
        myQueue.insert(4);
        myQueue.insert(5);

        while (!myQueue.isEmpty()) {
            int n = myQueue.remove();
            System.out.println("Элемент: " + n);
        }

    }

}
