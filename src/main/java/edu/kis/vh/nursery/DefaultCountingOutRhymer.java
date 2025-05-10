package edu.kis.vh.nursery;

/**
 * Klasa reprezentująca licznikowy system liczenia z tablicą liczb.
 * Umożliwia dodawanie liczb, sprawdzanie stanu pustego i pełnego,
 * oraz wyciąganie ostatnio dodanej liczby.
 *
 * Klasa implementuje podstawową funkcjonalność stosu o stałej pojemności.
 */
public class DefaultCountingOutRhymer {

    /**
     * Wskaźnik wskazujący na stan pustego systemu liczenia.
     */
    private static final int EMPTY_RHYMER_INDICATOR = -1;

    /**
     * Wartość domyślna zwracana w przypadku, gdy brak jest elementów.
     */
    private static final int DEFAULT_VALUE = -1;

    /**
     * Pojemność tablicy przechowującej liczby.
     */
    private static final int CAPACITY = 12;

    /**
     * Indeks ostatniego elementu w tablicy.
     */
    private static final int LAST_INDEX = CAPACITY - 1;

    /**
     * Tablica przechowująca liczby w systemie liczenia.
     */
    final int[] numbers = new int[CAPACITY];

    /**
     * Wskaźnik na aktualną pozycję w tablicy.
     * Przechowuje indeks ostatnio dodanego elementu.
     */
    int total = EMPTY_RHYMER_INDICATOR;

    /**
     * Dodaje liczbę do systemu liczenia.
     *
     * @param in Liczba do dodania.
     */
    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    /**
     * Sprawdza, czy system liczenia jest pusty.
     *
     * @return true, jeśli system liczenia jest pusty, w przeciwnym razie false.
     */
    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    /**
     * Sprawdza, czy system liczenia jest pełny.
     *
     * @return true, jeśli system liczenia jest pełny, w przeciwnym razie false.
     */
    public boolean isFull() {
        return total == LAST_INDEX;
    }

    /**
     * Zwraca ostatnio dodaną liczbę, bez jej usuwania.
     *
     * @return Ostatnia liczba dodana do systemu liczenia,
     *         lub wartość domyślną, jeśli system liczenia jest pusty.
     */
    protected int showPeekaboo() {
        if (callCheck()) {
            return DEFAULT_VALUE;
        }
        return numbers[total];
    }

    /**
     * Usuwa ostatnio dodaną liczbę i ją zwraca.
     *
     * @return Ostatnia liczba usunięta z systemu liczenia,
     *         lub wartość domyślną, jeśli system liczenia jest pusty.
     */
    public int countOut() {
        if (callCheck()) {
            return DEFAULT_VALUE;
        }
        return numbers[total--];
    }

    /**
     * Zwraca liczbę elementów w systemie liczenia.
     *
     * @return Liczba elementów w systemie liczenia.
     */
    public int getTotal() {
        return total;
    }
}
