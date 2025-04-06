package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int MAX_INDEX = CAPACITY - 1;
    private static final int RETURN_MINUS_ONE = -1;
    private static final int EMPTY_VALUE = -1;
    private final int[] numbers = new int[CAPACITY];
    private int total = EMPTY_VALUE;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_MINUS_ONE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_MINUS_ONE;
        return numbers[total--];
    }

}
