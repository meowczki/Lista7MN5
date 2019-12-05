package edu.ib;

public class ConsoleStepHandler implements StepHandler {
    @Override
    public void handleStep(double t, double x) {
        System.out.println(t+" : "+x);
    }
}
