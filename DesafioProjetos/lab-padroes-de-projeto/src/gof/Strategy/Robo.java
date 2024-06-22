package gof.Strategy;

public class Robo {
    private Comportamento strategy;

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    public Comportamento getStrategy() {
        return strategy;
    }

    public void mover(){
        strategy.mover();
    }
}
