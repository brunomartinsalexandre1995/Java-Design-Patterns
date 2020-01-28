package JavaDesignPattern.GOFDesignPatterns.prototype;

public class SomeConcretePrototypeObject extends SomeBasicPrototypeObject implements Cloneable {

    private int additionalTrades = 0;
    public static int numberOfConstructorExecutions = 0;

    public SomeConcretePrototypeObject(){
        numberOfConstructorExecutions++;
    }

    @Override
    public SomeConcretePrototypeObject clone() throws CloneNotSupportedException {
        return (SomeConcretePrototypeObject) super.clone();
    }

    @Override
    public void setAdditionalTrades(int trades){
        additionalTrades += trades;
    }

    public int getAllTrades(){
        return getNumberOfTrades() + additionalTrades;
    }

}
