import java.util.ArrayList;

public class Questions {
  private String question;
  private ArrayList<String> choices = new ArrayList<>();
  private String correctAnswer;

  public void addQuestion(String question) {
    this.question = question;
  }

  public String getQuestion() {
    return question;
  }

  public void addChoices(String choice) {
    choices.add(choice);
  }

  public ArrayList<String> getChoices() {
    return choices;
  }

  public void setCorrectAnswer(String correctAnswer) {
    this.correctAnswer = correctAnswer;
  }
}
