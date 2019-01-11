package Factories;
import Bird.Bird;
import ScrollHandler.ScrollHandler;

/**
 * Created by pidho on 02.04.2018.
 */
public interface GUIFactory {
    Bird createBird(float x, float y, int width, int height);
    ScrollHandler createScrollHandler();
}
