package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static int INTM1 = -1;
    public static int INT12 = 12;
    public static int INT11 = 11;
    private int[] numbers = new int[INT12];

    public int total = INTM1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INTM1;
    }

    public boolean isFull() {
        return total == INT11;
    }

    protected int peekaboo() {
        if (callCheck())
            return INTM1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INTM1;
        return numbers[total--];
    }

}
