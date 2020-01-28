package JavaDesignPattern.GOFDesignPatterns;

import JavaDesignPattern.GOFDesignPatterns.prototype.SomeBasicPrototypeObject;
import JavaDesignPattern.GOFDesignPatterns.prototype.SomeConcretePrototypeObject;
import JavaDesignPattern.GOFDesignPatterns.singleton.SomeObjectSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GofDesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GofDesignPatternsApplication.class, args);
	}

	@Autowired
	private void runSingletonDemonstration()  {
		System.out.println("Running Singleton Pattern");
		SomeObjectSingleton obj1 = SomeObjectSingleton.getInstance();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		SomeObjectSingleton obj2 = SomeObjectSingleton.getInstance();

		System.out.println("Singleton Object 1 Date: " + obj1);
		System.out.println("Singleton Object 2 Date: " + obj2);
	}


	@Autowired
	private void runPrototypeDemonstration() throws CloneNotSupportedException {
		System.out.println("Running Prototype Pattern");
		SomeBasicPrototypeObject basicObj = new SomeConcretePrototypeObject();

		SomeBasicPrototypeObject prototype1 = basicObj.clone();
		prototype1.setAdditionalTrades(500);

		SomeBasicPrototypeObject prototype2 = prototype1.clone();
		prototype2.setAdditionalTrades(300);

		System.out.println("Prototype 1: " + prototype1.getAllTrades() + " trades.");
		System.out.println("Prototype 2: " + prototype2.getAllTrades() + " trades.");
		System.out.println("Number of constructor executions: " + SomeConcretePrototypeObject.numberOfConstructorExecutions);
	}

}
