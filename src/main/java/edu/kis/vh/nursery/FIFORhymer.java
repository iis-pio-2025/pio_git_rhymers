package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	private final defaultCountingOutRhymer tmp = new defaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())

			tmp.countIn(super.countOut());

		int ret = tmp.countOut();

		while (!tmp.callCheck())

			countIn(tmp.countOut());

		return ret;
	}

	public defaultCountingOutRhymer getTmp() {
		return tmp;
	}
}
