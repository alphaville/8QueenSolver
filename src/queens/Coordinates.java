package queens;

/**
 *
 * @author chung
 */
public class Coordinates {

    public int x = 1;
    public int y = 1;

    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int diag(){
        return x-y;
    }

    public int adiag(){
        return x+y;
    }
    

}
