package Factories;

import Bird.EasyBird;
import Bird.Bird;
import ScrollHandler.ScrollHandler;
import ScrollHandler.EasyScrollHandler;

/**
 * Created by pidho on 02.04.2018.
 * Easy mode version of Factory
 */
public class EasyFactory implements GUIFactory{

    @Override
    public Bird createBird(float x, float y, int width, int height)
    {
        return new EasyBird(x, y, width, height);
    }


    @Override
    public ScrollHandler createScrollHandler()
    {
        return new EasyScrollHandler();
    }
}
