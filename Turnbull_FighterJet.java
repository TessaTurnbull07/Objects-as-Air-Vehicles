//class that implements both AirVehicle and SoundBarrier interfaces
//includes variables, two constructors, getters and setters for all variables, 
//a toString method, the three methods from Turnbull_AirVehicle interface, 
//and the one method fromTurnbull_SoundBarrier interface
//

public class Turnbull_FighterJet implements Turnbull_AirVehicle, Turnbull_SoundBarrier {

	//variables
	public int numberOfEngines;
	public int numberOfCrewMembers;
	public String nameOfJet;
	public String nameOfManu;
	
	//constructors
	public Turnbull_FighterJet() {	
	}
	
	public Turnbull_FighterJet(int numberOfEngines, int numberOfCrewMembers, 
	String nameOfJet, String nameOfManu) {	
		this.numberOfEngines = numberOfEngines;
		this.numberOfCrewMembers = numberOfCrewMembers;
		this.nameOfJet = nameOfJet;
		this.nameOfManu = nameOfManu;
	}

	//getters
	public int getNumberOfEngines() {
		return numberOfEngines;
	}

	public int getNumberOfCrewMembers() {
		return numberOfCrewMembers;
	}

	public String getNameOfJet() {
		return nameOfJet;
	}

	public String getNameOfManu() {
		return nameOfManu;
	}

	//setters
	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}

	public void setNumberOfCrewMembers(int numberOfCrewMembers) {
		this.numberOfCrewMembers = numberOfCrewMembers;
	}

	public void setNameOfJet(String nameOfJet) {
		this.nameOfJet = nameOfJet;
	}

	public void setNameOfManu(String nameOfManu) {
		this.nameOfManu = nameOfManu;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Turnbull_FighterJet [numberOfEngines=" + numberOfEngines + ", numberOfCrewMembers="
				+ numberOfCrewMembers + ", nameOfJet=" + nameOfJet + ", nameOfManu=" + nameOfManu + "]";
	}
	
	//implements methods from Turnbull_AirVehicle interface
	@Override
	public void avTakeOff() {
		System.out.println(nameOfJet + " has started the takeoff roll.");	
	}
	
	@Override
	public void avFly() {
		System.out.println(nameOfJet + " has taken off and is now flying.");	
	}
	
	@Override
	public void breakSoundBarrier() {
		System.out.println(nameOfJet + " has broken the sound barrier!!!");	
	}
	
	@Override
	public void avLand() {
		System.out.println(nameOfJet + " has successfully landed.");
	}

}
