package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer reprezentuje prosty mechanizm liczenia.
 * Ta klasa umożliwia dodawanie liczb do wewnętrznej pamięci (stos),
 * sprawdzanie, czy jest pełna, sprawdzanie, czy zawiera jakiekolwiek liczby oraz usuwanie (liczenie) liczb.
 */
public class DefaultCountingOutRhymer {

    /**
     * Maksymalna liczba elementów, które rhymer może przechować.
     */
    private static final int CAPACITY = 12;

    /**
     * Tablica, która przechowuje liczby w rhymerze.
     */
    private int[] numbers = new int[CAPACITY];

    /**
     * Kod błędu zwracany przez metody, gdy operacja jest niewłaściwa.
     */
    private static final int ERR_CODE = -1;
    /**
     * Wartość oznaczająca pusty stos
     */
    private static final int EMPTY_STACK_CODE = -1;
    /**
     * Indeks reprezentujący aktualną pozycję w rhymerze.
     * Inicjowany wartością EMPTY_STACK_CODE, aby wskazywać, że rhymer jest pusty.
     */
    private int total = EMPTY_STACK_CODE;

    /**
     * Zwraca wartość indeksu total, który reprezentuje aktualną pozycję w rhymerze.
     * Używane do określenia, ile liczb jest przechowywanych.
     *
     * @return aktualna pozycja (total).
     */
    public int getTotal(){
        return total;
    }

    /**
     * Dodaje liczbę do rhymera, jeśli nie jest pełny.
     * Jeśli rhymer jest pełny, ta metoda nic nie robi.
     *
     * @param in liczba do dodania do rhymera.
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy rhymer jest pusty.
     * Rhymer jest uznawany za pusty, jeśli total ma wartość EMPTY_STACK_CODE.
     *
     * @return true, jeśli rhymer jest pusty, w przeciwnym razie false.
     */
    public boolean callCheck() {
        return total == EMPTY_STACK_CODE;
    }

    /**
     * Sprawdza, czy rhymer jest pełny.
     * Rhymer jest pełny, jeśli total jest równy SIZE - 1.
     *
     * @return true, jeśli rhymer jest pełny, w przeciwnym razie false.
     */
    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    /**
     * Zwraca ostatnią liczbę w rhymerze, ale nie usuwa jej.
     * Jeśli rhymer jest pusty, zwraca kod błędu ERR_CODE.
     *
     * @return ostatnia liczba w rhymerze lub kod błędu ERR_CODE, jeśli rhymer jest pusty.
     */
    protected int peekaboo() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total];
    }

    /**
     * Usuwa ostatnią liczbę z rhymera i ją zwraca.
     * Jeśli rhymer jest pusty, zwraca kod błędu ERR_CODE.
     *
     * @return usunięta liczba lub kod błędu ERR_CODE, jeśli rhymer jest pusty.
     */
    public int countOut() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total--];
    }
}
