import greenfoot.*;

public class MenuScreen extends Screen {
  public MenuScreen() {
    super();

    addObject(new Button(this::goInstructions, "Instructions"), 120, 340);
  }

  public void goInstructions() {
    new InstructionScreen().push();
  }
}