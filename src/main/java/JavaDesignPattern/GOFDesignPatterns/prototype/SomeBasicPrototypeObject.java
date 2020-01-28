package JavaDesignPattern.GOFDesignPatterns.prototype;

public abstract class SomeBasicPrototypeObject implements Cloneable{

    private int numberOfTrades = 500;

    @Override
    public SomeBasicPrototypeObject clone() throws CloneNotSupportedException {
        return (SomeBasicPrototypeObject) super.clone();
    }

    protected final int getNumberOfTrades(){
        return numberOfTrades;
    }

    public abstract void setAdditionalTrades(int trades);

    public abstract int getAllTrades();
}
