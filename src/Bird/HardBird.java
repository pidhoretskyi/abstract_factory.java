package Bird;

/**
 * Created by pidho on 02.04.2018.
 * Hard mode version of Bird
 */
public class HardBird implements Bird{
    private float x, y;
    private int width, height;

    public HardBird(float x, float y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    @Override
    public void update(float delta){

    }

    @Override
    public String getBirdClass() {
        return "Hard";
    }

    @Override
    public void onClick(){

    }
}
