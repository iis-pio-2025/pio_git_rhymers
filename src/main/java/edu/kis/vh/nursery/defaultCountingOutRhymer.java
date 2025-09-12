package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    static final int numbers_size = 12;
    static final int total_base_value = -1;
    
    final private int[] NUMBERS = new int[numbers_size];

    public int total = total_base_value;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == total_base_value;
        }
        
            public boolean isFull() {
                return total == numbers_size - 1;
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
