import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>();

    public Deck() {
        this.build();
        this.shuffle();
    }
    private void build() {
        System.out.println("Building the deck...");

        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] card_names = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

        for(int suit_index = 0; suit_index < suits.length; suit_index++) {
            for(int name_index = 0; name_index < card_names.length; name_index++) {
                int card_value = name_index + 1;

                if (name_index > 9) {
                    card_value = 10;
                }
                Card card = new Card(suits[suit_index], card_names[name_index], card_value);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        System.out.println("Shuffling the deck...");
        Collections.shuffle(cards);
    }

    public void dealCard() {
        Random random = new Random();

        int random_index = random.nextInt(1, this.cards.size() + 1);
        Card dealt_card = cards.get(random_index);

        System.out.print("Dealt card is ... ");
        dealt_card.show();
    }

    public void showCards() {
        for(int index = 0; index < this.cards.size(); index++) {
            this.cards.get(index).show();
        }
    }
}
