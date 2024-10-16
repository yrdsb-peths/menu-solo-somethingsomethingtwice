import greenfoot.*;

public class InstructionScreen extends Screen {
  private int index = 0;
  private String[] instructions = {"Cycle through avatars with the next button!", ""};
  private Label label = new Label(instructions[index], 32);

  public InstructionScreen() {
    super();

    addObject(label, 300, 32);
    addObject(new Button(this::nextInstruction, "Next"), 300 + 96, 160);
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