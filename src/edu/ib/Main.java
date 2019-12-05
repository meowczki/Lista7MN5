package edu.ib;

public class Main {
    public static void main(String[] args) {
        FirstOrderODESolver solver=new FirstOrderODESolver(new EulerSingleStep());
        double xStop=solver.integrate((t,x)->-x,0,1,1,10);
        System.out.println(xStop);
        solver=new FirstOrderODESolver(new EulerModifiedStep());
        xStop=solver.integrate((t,x)->-x,0,1,1,10);
        System.out.println(xStop);

        solver=new FirstOrderODESolver(new EulerModifiedStep());
        solver.addHandler(new ConsoleStepHandler());
        xStop=solver.integrate((t,x)->-x,0,1,1,10);
        System.out.println(xStop);

        xStop=solver.integrate((t,x)->4*Math.exp(0.8*t)-0.5*x,0,1,4,15);

    }

}
