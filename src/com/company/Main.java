package com.company;

public class Main {

    public static void main(String[] args) {
	    Box box1 = new Box();
        Box box2 = new Box(2);
        Box box3 = new Box(2,3,4);

        System.out.println(box3.getArea());
        System.out.println(box3.getVolume());

        System.out.println("------------------------------------");
        //queue is an int array with maxSize integers.
        Queue qu1 = new Queue();
        Queue qu2 = new Queue(3);

        qu1.push(1);
        qu1.push(2);
        qu1.push(3);
        qu1.pop();
        qu1.push(4);

        qu1.printQueue();
    }
}
