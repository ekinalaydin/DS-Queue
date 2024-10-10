public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue(8);



        System.out.println("Before enqueue():");
        System.out.println("--------------");
        myQueue.printAll();

        myQueue.enqueue(1);

        System.out.println("\n\nAfter enqueue():");
        System.out.println("-------------");
        myQueue.printAll();

    }}