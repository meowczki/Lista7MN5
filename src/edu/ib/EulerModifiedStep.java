package edu.ib;

public class EulerModifiedStep implements ODESingleStep {
    @Override
    public double singleStep(FirstOrderODE ode, double t, double x, double h) {

        return x+ode.f(t+h/2,x+ode.f(t,x)*h/2)*h;
    }
}
