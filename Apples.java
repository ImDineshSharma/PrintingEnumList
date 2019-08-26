// Main class

import java.util.EnumSet;
public class Apples {
 public static void main(String[] args) {
	
	 // print the enum list in tuna class
	 
	 for(tuna cricketers: tuna.values())
	 System.out.printf("%s\t\t%s\t%s\n", cricketers, cricketers.getSkill(), cricketers.getAge());
	 
	 
	 //print a specific range, we first need to import EnumSet in order to do this operation
   
	 System.out.println("\nSpecific range \n");
	 
	 for(tuna cricketers: EnumSet.range(tuna.Warner, tuna.bumrah))
	 System.out.printf("%s\t\t%s\t%s\n", cricketers, cricketers.getSkill(), cricketers.getAge());
   
 }
  
}

// Enum class

public enum tuna {
	// enum list of five people
	virat("Batsman", "30"),
	Warner("Batsman", "30"),
	stokes("all rounder", "28"),
	bumrah("bowler", "30"),
	rohit("batsman", "30");
	
	private String skill;
	private String age;
	
  // get set go!
	tuna(String skl, String ag) {
		skill = skl;
		age = ag;
	}
	
	public String getSkill() {
		return skill;
	}
	
	public String getAge() {
		return age;
	}

}




