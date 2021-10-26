package ggc.exceptions;

public class DaysToAdvanceNotValidException extends Exception {
    /** invalid date */
    private int _date;

    /**
     * @param date
     */
    public DaysToAdvanceNotValidException(int date) {
        _date = date;
    }

    /**
     * @return the date
     */
    public int getDate() {
        return _date;
    }
}
