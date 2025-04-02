package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {
// wykonanie punktu 6
// wykonanie punktu 7
    public static final int EMPTY_INDEX = -1;
    public static final int MAX_SIZE = 12;
    private int[] NUMBERS = new int[MAX_SIZE];

    public int total = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == -1;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return -1;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return -1;
                        return NUMBERS[total--];
                    }

}
