package com.company;

public class Queue {
    private int size = 0;
    private int maxSize;
    private int rear = -1;
    private int front = 0;

    private int myQueue[];

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        myQueue = new int[maxSize];
    }

    public Queue() {

        this.maxSize = 5000;//Integer.MAX_VALUE;
        myQueue = new int[maxSize];
    }

    public void push(int num) {
        if (isFull()) {
            System.out.println("This queue is full");
            System.exit(1);
        }

        rear = (rear + 1) % maxSize;
        myQueue[rear] = num;
        size++;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("This queue is empty");
            System.exit(1);
        }
        front = (front + 1) % maxSize;
        size--;
    }

    public float peek() {
        if (isEmpty()) {
            System.out.println("This queue is empty");
            System.exit(1);
        }
        return myQueue[front];
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("This queue is empty");
            System.exit(1);
        }
        for (int i = front; i < size + front; i++) {
            System.out.println(myQueue[i%maxSize]);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public int getSize() {
        return size;
    }

    public int getMaxSize() {
        return maxSize;
    }

}
