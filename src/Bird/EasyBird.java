package Bird;

/**
 * Created by pidho on 02.04.2018.
 */
public class EasyBird implements Bird{
    private float x, y;
    private int width, height;

    public EasyBird(float x, float y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }



    @Override
    public void update(float delta){

    }

    @Override
    public String getBirdClass() {
        return "Easy";
    }

    @Override
    public void onClick(){

    }
}
