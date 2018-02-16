import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.Gson;
import java.util.List;

public class FlashCardGame {

    public static void main(String[] args) {
        System.out.println("Starting flashcard game");
        FlashCardGame game = new FlashCardGame();
        Cards cards = game.updateCardsFromJSON();
        if (cards == null) {
            System.err.println("Cards are null.. terminating");
            return;
        }
        game.showCards(cards);
    }

    private void showCards(Cards cards) {
        for (FlashCard card : cards.getCards()) {
            if (card.getQuestion().length() > 0) {
                System.out.println(card.getQuestion());
            }
        }
    }

    private Cards updateCardsFromJSON() {
        Gson gson = new Gson();
        Cards cards = null;
        try {
            cards = gson.fromJson(new FileReader("FlashCards.json"), Cards.class);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return cards;
    }
}

class Cards {

    private List<FlashCard> cards;

    public Cards() {
    }

    public List<FlashCard> getCards() {
        return this.cards;
    }

    public void setCards(List<FlashCard> aList) {
        this.cards = aList;
    }
}

class FlashCard {
    private String question;
    private String answer;

    public FlashCard() {
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setQuestion(String aQuestion) {
        this.question = aQuestion;
    }

    public void setAnswer(String aAnswer) {
        this.answer = aAnswer;
    }
}