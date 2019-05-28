package tugasgls;

import java.util.*;

public class Main {

	Scanner scan = new Scanner(System.in);
	ArrayList<BaseCharacter> listCharacter = new ArrayList<>();
	
	String name;
	String description;
	
	public Main() {
		
		listCharacter.add(new One("Unemployed", " someone who don't have a job"));
		listCharacter.add(new Two("Chef", " someone who can cooks"));
		listCharacter.add(new Three("Multi Talent Person", " someone who can do everything"));
		listCharacter.add(new Four("Driver", " someone who can drives"));
		listCharacter.add(new Five("Worker", " someone who can works"));
		listCharacter.add(new Six("Artist", " someone who can paint"));
		
		String input;
		
		System.out.println("Simulasi Kelompok Kemampuan");
		System.out.println("0 : Unemployed");
		System.out.println("1 : Chef");
		System.out.println("2 : Multi Talent Person");
		System.out.println("3 : Drive");
		System.out.println("4 : Worker");
		System.out.println("5 : Artist");
		do {
			System.out.print("Input [Info|Cook|Drive|Work|Paint] and the number : ");
			input = scan.nextLine();
		}while(!input.contains("Info") && !input.contains("Cook") && !input.contains("Drive") && !input.contains("Work") && !input.contains("Paint"));
		
		String jobDesk = input.substring(0, input.indexOf(" "));
		String ID = input.substring(input.indexOf(" ")+1);
		
		for(int x=0;x<ID.length();x+=2) {
			Integer id = Integer.parseInt(ID.substring(x, x+1));

			switch(jobDesk) {
			case "Info" :
				listCharacter.get(id).getInfo();
				break;
			case "Cook" :
				if(listCharacter.get(id) instanceof IChef) {
					((IChef)listCharacter.get(id)).Cook();
				}else {
					System.out.println(listCharacter.get(id).name+ " can't cook");
				}
				break;
			case "Drive" :
				if(listCharacter.get(id) instanceof IDriver) {
					((IDriver)listCharacter.get(id)).Drive();
				}else {
					System.out.println(listCharacter.get(id).name + " can't drive");
				}
				break;
			case "Paint" :
				if(listCharacter.get(id) instanceof IArtist) {
					((IArtist)listCharacter.get(id)).Paint();
				}else {
					System.out.println(listCharacter.get(id).name + " can't paint");
				}
				break;
			case "Work" :
				if(listCharacter.get(id) instanceof IWorker) {
					((IWorker)listCharacter.get(id)).Work();
				}else {
					System.out.println(listCharacter.get(id).name + " can't work");
				}
				break;
			
			}
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}
