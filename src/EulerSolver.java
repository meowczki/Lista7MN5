
import java.util.ArrayList;
import java.util.List;
public class EulerSolver {
    private Function dydx;
    private double x0;
    public Wyniki solve(double krok, double start, double end,double x0){
        List<Double> x=new ArrayList<>();
        List<Double> t=new ArrayList<>();
        int n= (int) ((end-start)/krok);
        x.add(x0);
        t.add(start);
        for(int i=0;i<n;i++){
            t.add(t.get(i)+krok);
            x.add(x.get(i)+krok*dydx.f(t.get(i),x.get(i)));
        }
        return new Wyniki(x,t);
    }
    public Wyniki solveBetter(double krok, double start, double end, double
            x0){
        List<Double> x=new ArrayList<>();
        List<Double> t=new ArrayList<>();
        int n= (int) ((end-start)/krok);
        x.add(x0);
        t.add(start);
        for(int i=0;i<n;i++){
            t.add(t.get(i)+krok);
            x.add(x.get(i)+krok*dydx.f(t.get(i)+krok/2,x.get(i)
                    +dydx.f(t.get(i),x.get(i))*krok/2));
        }
        return new Wyniki(x,t);
    }
}