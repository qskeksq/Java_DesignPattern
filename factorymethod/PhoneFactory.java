package factorymethod;

public class PhoneFactory extends FactoryMethod {

	@Override
	public Product make() {
		
		return new Phone();
	}

}
