import greenfoot.*;

public class MenuScreen extends Screen {
  private Avatar avatar = new Avatar();

  public MenuScreen() {
    super();
    push();

    addObject(avatar, 300 - 96, 160);
    addObject(new Button(this::goInstructions, "Instructions", 160), 300 - 96, 340);
    addObject(new Button(this::goHighscores, "Highscores", 160), 300 + 96, 340);
    addObject(new Button(avatar::nextAvatar, "Next"), 300 + 96, 160);
  }

  public void goInstructions() {
    new InstructionScreen().push();
  }

  public void goHighscores() {
    new HighscoreScreen().push();
  }
}