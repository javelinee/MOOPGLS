package tugasgls;

public class Six extends BaseCharacter implements IArtist{

	public Six(String name, String description) {
		super(name, description);
	}

	@Override
	public void Paint() {
		System.out.println(" in class six is painting");
	}
}
