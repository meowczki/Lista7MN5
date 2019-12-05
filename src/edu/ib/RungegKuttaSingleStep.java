package edu.ib;

public class RungegKuttaSingleStep implements ODESingleStep {
    @Override
    public double singleStep(FirstOrderODE ode, double t, double x, double h) {
       double k1=ode.f(t,x);
       double k2=ode.f(t+h/2,x+k1/2);
       double k3=ode.f(t+h/2,x+k2/2);
       double k4=ode.f(t+h/2,x+k3);
       x=x+(1/6)*(k1+2*k2+2*k3+k4);
        return x;
    }
}
