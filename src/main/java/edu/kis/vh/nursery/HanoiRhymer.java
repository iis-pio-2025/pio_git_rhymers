package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    /**
     * licznik całkowitych odrzuconych
     */
    int totalRejected = 0;

    /**
     * zwraca wartość całkowitych odrzuconych prób
     * @return liczba odrzuceń
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * sprawdza, czy dodawany element nie jest większy od tego na szczycie
     * jeśli jest, to go odrzuca, jeśli nie to dodaje
     * @param in wartość do dodania
     */
    @Override
    public void countIn(int in) {
    if (!callCheck() && in > peekaboo())
            totalRejected++;
            else
                super.countIn(in);
    }

    /**
     * alternatywny getter
     * @return liczba odrzuceń
     */
    public int getTotalRejected() {
        return totalRejected;
    }

}
