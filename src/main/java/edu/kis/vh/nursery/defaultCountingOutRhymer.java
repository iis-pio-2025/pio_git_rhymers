package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {
	private static final int MAX_SIZE = 12;
	private static final int EMPTY_RHYMER_INDICATOR = -1;
	private static final int RETURN_VALUE_IF_EMPTY = -1;
	
	private final int[] numbers = new int[MAX_SIZE];

	public static int getMaxSize() {
		return MAX_SIZE;
	}

	public static int getEmptyRhymerIndicator() {
		return EMPTY_RHYMER_INDICATOR;
	}

	public static int getReturnValueIfEmpty() {
		return RETURN_VALUE_IF_EMPTY;
	}

	public int getTotal() {
		return total;
	}

	private int total = EMPTY_RHYMER_INDICATOR;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_RHYMER_INDICATOR;
	}

	public boolean isFull() {
		return total == MAX_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return RETURN_VALUE_IF_EMPTY;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return RETURN_VALUE_IF_EMPTY;
		return numbers[total--];
	}

	public int[] getNumbers() {
		return numbers;
	}
}
