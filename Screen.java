import greenfoot.*;
public class Screen extends World {
    private static Stack<Screen> screens = new Stack<Screen>();
    
    public Screen() {
        super(600, 400, 1);
    }

    public void push() {
        screens.push(this);
        Greenfoot.setWorld(this);
    }

    public void pop() {
        screens.pop();
        Greenfoot.setWorld(screens.peek());
    }
}
