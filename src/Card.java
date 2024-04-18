public class Card {
    final private java.lang.String suit;
    final private java.lang.String name;
    final private int value;
    public Card(java.lang.String suit, java.lang.String name, int value) {
        this.suit = suit;
        this.name = name;
        this.value = value;
    }

    public void show() {
        String message = java.lang.String.format("%s of %s (value is %d)", this.name, this.suit, this.value);
        System.out.println(message);
    }
}
