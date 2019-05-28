package tugasgls;

public class Two extends BaseCharacter implements IChef{

	public Two(String name, String description) {
		super(name, description);
	}

	@Override
	public void Cook() {
		System.out.println(name + " in class two is cooking");
		
	}

}
