package ScrollHandler;

/**
 * Created by pidho on 02.04.2018.
 * Interface for ScrollHandler
 */
public interface ScrollHandler{

    /*
     *Reaction on button click
     */
    void onClick();

    /*
     * Update bird position
     * @param delta The <code>float</code> that shows how much time passes from the previous update position
     */
    void update(float delta);

    /*
     *Shows type of Handler
     */
    String getScrollHandlerClass();
}
