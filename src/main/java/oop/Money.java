package oop;

public class Money {
    /*
    * Кол во монет
    * */
    private int count;
    /*
    * Номиниал монеты
    * */
    private int rating;

    public Money(int count, int rating) {
        this.count = count;
        this.rating = rating;
    }

    public int getCount() {
        return count;
    }

    public int getRating() {
        return rating;
    }
}
