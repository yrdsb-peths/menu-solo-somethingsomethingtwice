import greenfoot.*;

public class Avatar extends Actor {
    private Queue<GreenfootImage> images = new Queue<GreenfootImage>();

    public Avatar() {
        nextAvatar();
    }
    
    public void nextAvatar() {
        if (images.isEmpty()) {
            for (int i = 0; i < 3; i++)
                images.enqueue(new GreenfootImage("avatars/" + i + ".png"));
        }
        setImage(images.dequeue());
    }
}
