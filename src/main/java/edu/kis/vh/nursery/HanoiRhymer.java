package edu.kis.vh.nursery;

/**
 * Rhymer typu Hanoi, który odrzuca wartości większe od aktualnie znajdującej się na szczycie stosu.
 * Zlicza wszystkie takie przypadki jako odrzucone.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Liczba wartości odrzuconych przy próbie dodania do stosu.
     */
    private int totalRejected = 0;

    /**
     * Zwraca łączną liczbę odrzuconych wartości.
     *
     * @return liczba odrzuceń
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje wartość do stosu, jeśli jest mniejsza lub równa aktualnej wartości na szczycie.
     * W przeciwnym razie zwiększa licznik odrzuceń.
     *
     * @param in wartość do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaBoo())
            totalRejected++;
        else
            super.countIn(in);
    }

    /**
     * Getter do odczytu liczby odrzuceń.
     *
     * @return liczba odrzuceń
     */
    public int getTotalRejected() {
        return totalRejected;
    }
}