package tugasgls;

public class Five extends BaseCharacter implements IWorker{

	public Five(String name, String description) {
		super(name, description);
	}

	@Override
	public void Work() {
		System.out.println(name + " in class five is working");
		
	}
	
}
