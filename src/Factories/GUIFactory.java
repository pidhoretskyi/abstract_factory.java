package Factories;
import Bird.Bird;
import ScrollHandler.ScrollHandler;

/**
 * Created by pidho on 02.04.2018.
 * Interface for Abstract Factory
 */
public interface GUIFactory {
    /*
    *Create and return new bird
    *
    * @param x First <code>float</code> coordinate for the initial position of the bird
    * @param y Second <code>float</code> coordinate for the initial position of the bird
    * @param width The <code>int</code> to set width of bird
    * @param height The <code>int</code> to set height of bird
     */
    Bird createBird(float x, float y, int width, int height);

    /*
    *Create ScrollHandler
     */
    ScrollHandler createScrollHandler();
}
