package tugasgls;

public class Four extends BaseCharacter implements IDriver{

	public Four(String name, String description) {
		super(name, description);
	}

	@Override
	public void Drive() {
		System.out.println(name +" in class four is driving");
		
	}

}
