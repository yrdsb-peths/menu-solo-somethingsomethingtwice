import greenfoot.*;

public class Button extends Actor {
    private Runnable action;
    private Label label = new Label("", 32);

    public void init(Runnable action, int xsc) {
        this.action = action;
        GreenfootImage image = new GreenfootImage("images/button_square_flat.png");
        image.scale(16 * xsc, image.getHeight());
        setImage(image);
    }

    public Button(Runnable action) {
        init(action, 4);
    }
    
    public Button(Runnable action, String text) {
        init(action, text.length());
        label.setValue(text);
    }

    public void addedToWorld(World world) {
        world.addObject(label, getX(), getY());
    }

    public void act() {
        if (Greenfoot.mouseClicked(this) || Greenfoot.mouseClicked(label)) {
            if (action != null) {
                action.run();
            }
        }
    }

    public void destroyLabel() {
        getWorld().removeObject(label);
    }
}