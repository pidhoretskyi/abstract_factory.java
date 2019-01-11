package Factories;
import Bird.HardBird;
import Bird.Bird;
import ScrollHandler.ScrollHandler;
import ScrollHandler.HardScrollHandler;

/**
 * Created by pidho on 02.04.2018.
 * Hard mode version of Factory
 */
public class HardFactory implements GUIFactory{

    @Override
    public Bird createBird(float x, float y, int width, int height)
    {
        return new HardBird(x, y, width, height);
    }
    @Override
    public ScrollHandler createScrollHandler()
    {
        return new HardScrollHandler();
    }
}
