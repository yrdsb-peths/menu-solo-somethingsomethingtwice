import greenfoot.*;

public class Button extends Actor {
    private Runnable action;
    private Label label = new Label("", 32);

    public void init(Runnable action, int width) {
        this.action = action;
        GreenfootImage image = new GreenfootImage("images/button_square_flat.png");
        image.scale(width, image.getHeight());
        setImage(image);
    }

    public Button(Runnable action) {
        init(action, 64);
    }

    public Button(Runnable action, int width) {
        init(action, width);
    }
    
    public Button(Runnable action, String text) {
        init(action, 64);
        label.setValue(text);
    }

    public Button(Runnable action, String text, int width) {
        init(action, width);
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