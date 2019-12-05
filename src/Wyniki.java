import java.util.ArrayList;
import java.util.List;

public class Wyniki {
    private   List<Double> x;
    private List<Double> t;

    public List<Double> getX() {
        return x;
    }

    public void setX(List<Double> x) {
        this.x = x;
    }

    public List<Double> getT() {
        return t;
    }

    public void setT(List<Double> t) {
        this.t = t;
    }

    public Wyniki(List<Double> x, List<Double> t) {
        this.x = x;
        this.t = t;
    }
}
