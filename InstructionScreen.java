import greenfoot.*;

public class InstructionScreen extends Screen {
  private int index = 0;
  private String[] instructions = {
    "Cycle through avatars with the next button!", 
    "Click on the \"Go to Menu\" button to head back!",
    "You can check highscores in the main menu.\nJust click the button!",
  };
  private Label label = new Label(instructions[index], 32);

  public InstructionScreen() {
    super();

    addObject(label, 300, 64);
    addObject(new Button(this::nextInstruction, "Next"), 600 - 120, 340);
    addObject(new Button(this::previousInstruction, "Back"), 120, 340);
    addObject(new Button(this::pop, "Go to Menu", 144), 300, 340);
  }
  
  public void nextInstruction() {
      index = (index + 1) % instructions.length;
      label.setValue(instructions[index]);
  }

  public void previousInstruction() {
    if (--index < 0)
      index = instructions.length;
    label.setValue(instructions[index]);
  }
}