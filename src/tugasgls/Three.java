package tugasgls;

public class Three extends BaseCharacter implements IChef, IDriver, IWorker, IArtist {

	public Three(String name, String description) {
		super(name, description);
	}
	
	@Override
	public void Work() {
		System.out.println(name + " in class three is working");
		
	}
	@Override
	public void Drive() {
		System.out.println(name + " in class three is driving");
		
	}
	@Override
	public void Cook() {
		System.out.println(" in class three is cooking");
		
	}
	@Override
	public void Paint() {
		System.out.println(" in class three is painting");
		
	}

}
