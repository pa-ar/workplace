public class Car {
	// Πεδία
	private String maker;
	private String model;
	private String color;
	private int kilometers;
	private int speed=0;
	
	// Κατασκευαστής
	public Car (String maker, String model, String color, int kilometers){
		this.maker=maker;
		this.model=model;
		this.color=color;
		this.kilometers=kilometers;
	}
	
	// Μέθοδοι
	public void carInfo(){
		System.out.println("Κατασκευαστής : "+maker);
		System.out.println("Μοντέλο : "+model);
		System.out.println("Χρώμα : "+color);
		System.out.println("Χιλιόμετρα : "+kilometers);
	}
	
	public void changeColor(String newColor){
		color=newColor;
		System.out.println("Αλλαγή χρώματος αυτοκινήτου πραγματοποιήθηκε...");
	}

      public void currentSpeed(){
    	System.out.println("Τρέχουσα ταχύτητα : "+speed);
    
      }
    
      public void setSpeed(int changespeed){
    	 speed=changespeed;
    	 if (speed<0){
    	    System.out.println("Οδηγείς πιο αργά από χελώνα!! :-)");
    	    speed=0;
    	 }
    	 else if (speed<=160)
    		System.out.println("Αλλαγή ταχύτητας αυτοκινήτου πραγματοποιήθηκε");
    	 else {
    		System.out.println("Οδηγείς επικίνδυνα!!");
    		speed=0;
    	 }
      }
              	
}

