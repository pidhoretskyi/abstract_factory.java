package Factories;
import Bird.MiddleBird;
import Bird.Bird;
import ScrollHandler.ScrollHandler;
import ScrollHandler.MiddleScrollHandler;

/**
 * Created by pidho on 02.04.2018.
 * Middle mode version of Factory
 */
public class MiddleFactory implements GUIFactory{
    @Override
    public Bird createBird(float x, float y, int width, int height)
    {
        return new MiddleBird(x, y, width, height);
    }
    @Override
    public ScrollHandler createScrollHandler()
    {
        return new MiddleScrollHandler();
    }
}
