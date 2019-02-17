package extra;

public class Athlete {
	
	     static int nextBibNumber;
	     static String raceLocation = "New York";
	     static String raceStartTime = "9.00am";

	     String name;
	     int speed;
	     int bibNumber;

	Athlete (String name, int speed){
	     this.name = name;
	     this.speed = speed;
	    bibNumber=nextBibNumber;
	    nextBibNumber++;
	    raceLocation="Boston";
	}

	public static void main(String[] args) {
	     //create two athletes      //print their names, bibNumbers, and the location of their race. }
		Athlete athlete1= new Athlete("Ann",6);
		Athlete athlete2= new Athlete("Bnn",2);
System.out.println(athlete1.name);
System.out.println(athlete1.bibNumber);
System.out.println(athlete1.raceLocation);
System.out.println(athlete2.name);
System.out.println(athlete2.bibNumber);
System.out.println(athlete2.raceLocation);
	}


}
