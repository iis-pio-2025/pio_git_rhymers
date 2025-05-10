package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY_VALUE = -1;
    public static final int DEFAULT_VALUE = -1;
    private final int[] numbers = new int[CAPACITY];

    public int total = EMPTY_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == CAPACITY-1;
    }

    protected int peekTop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}
