package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int SIZE = 12;
    private int[] numbers = new int[SIZE];
    private static final int  ERR_CODE = -1;
    private int total = ERR_CODE;

    public int getTotal(){
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERR_CODE;
    }

    public boolean isFull() {

        return total == SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total--];
    }
}
