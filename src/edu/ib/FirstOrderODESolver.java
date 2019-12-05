package edu.ib;

public class FirstOrderODESolver{
    private ODESingleStep odeSingleStep;
    private  StepHandler stepHandler;

    public FirstOrderODESolver(ODESingleStep odeSingleStep) {
        this.odeSingleStep = odeSingleStep;
    }

    public void addHandler(StepHandler stepHandler){
        this.stepHandler=stepHandler;
    }

    public double integrate(FirstOrderODE ode, double tStart, double xStart, double tStop , int n){
        double h=(tStop-tStart)/n;
        double x= xStart;
        double t=tStart;
        for(int i=0;i<n;i++){
            if(stepHandler!=null)  stepHandler.handleStep(t,x);
           x=odeSingleStep.singleStep(ode,t,x,h);
            t+=h;
        }
        if(stepHandler!=null)  stepHandler.handleStep(t,x);
        return x;
    }
}
