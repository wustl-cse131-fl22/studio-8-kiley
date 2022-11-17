package studio8;


public class Time {

	
private int hour;
private int minute;
private boolean militaryTime;
	
// method that determines how toString should be for how the time should be displayed
// 12- vs 24- hour time

/**
 * constructor that sets values to instance variables
 * military time influences how the hour will appear
 * @param hour
 * @param minute
 */
public Time(int hour, int minute, boolean militaryTime){
	this.militaryTime=militaryTime;
	if (militaryTime ) {
		this.hour = hour;

	} else {
		this.hour = hour/2;
	}
	this.minute= minute;
}

public String toString() {
	return this.hour +":"+ this.minute;
}

public void setHour(int hour) {
	this.hour=hour;
}
//equals() 


//hashCode()

public void main(String[] args) {
	//Time(5, 30, false);
	//	minute =30;
	//	militaryTime = false;
	setHour(5);

	System.out.println(hour);
	
}

}