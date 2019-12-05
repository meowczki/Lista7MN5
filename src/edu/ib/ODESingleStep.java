package edu.ib;

public interface ODESingleStep {
    public double singleStep(FirstOrderODE ode,double t, double x, double h);
}
