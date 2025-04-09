package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int MAX = 11;
    private static final int EMPTY = -1;
    private static final int RETURN = -1;
    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY;

    /**
     *
     * gettery
     */
    public static int getCAPACITY() {
        return CAPACITY;
    }

    public static int getMAX() {
        return MAX;
    }

    public static int getEMPTY() {
        return EMPTY;
    }

    public static int getRETURN() {
        return RETURN;
    }
    public int[] getNumbers() {
        return numbers;
    }

    /**
     *
     * dodanie przedmiotu na stos
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    /**
     *
     * Zwraca: true, jeśli nie ma żadnych elementów (czyli total == -1), w przeciwnym razie false
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     *
     * Zwraca: true, jeśli liczba elementów osiągnęła maksymalną wartość (total == 11), inaczej false.
     */
    public boolean isFull() {
        return total == MAX;
    }

    /**
     *
     *Podgląda ostatni element na stosie bez usuwania go
     */
    protected int peekaboo() {
        if (callCheck())
            return RETURN;
        return numbers[total];
    }

    /**
     *
     *Podgląda ostatni element na stosie bez usuwania go
     */
    public int countOut() {
        if (callCheck())
            return RETURN;
        return numbers[total--];
    }
    public int getTotal(){return total;}


}
