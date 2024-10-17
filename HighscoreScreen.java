import java.util.HashMap;
import java.util.Map;
import greenfoot.*;

public class HighscoreScreen extends Screen {
  private HashMap<String, Integer> map = new HashMap<String, Integer>();
  private Label label = new Label("", 32);

  public HighscoreScreen() {
    super();

    // Add to map
    map.put("Ethan", 1);
    map.put("Tom", 1000);
    map.put("Sally", 2400);

    int lines = 0;
    String str = "";
    for (Map.Entry<String, Integer> e : map.entrySet()) {
      str += e.getKey() + ": " + e.getValue() + "\n";
      lines++;
    }
    label.setValue(str);
    addObject(label, 300, 64 + 16 * lines);
    addObject(new Button(this::pop, "Go to Menu", 144), 300, 340);
  }
}