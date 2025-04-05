package edu.kis.vh.nursery;

// 4.1 poprawa nazw klas
// 4.2 zmiana konwencji nazewniczej metod

public class HanoiRhymer extends defaultCountingOutRhymer {
	// 5.1 Poprawienie błędów w  konwencji nazewniczej pól klas we wszystkich klasach


	int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
	    if (!callCheck() && in > peekaboo())
	            totalRejected++;
		else
	            super.countIn(in);
    }
}
