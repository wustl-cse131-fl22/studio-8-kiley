package studio8;

public class Date {


   
   private int month; 
   private int day;
   private int year;
   
   // constructor
  
   /**
    * constructor that adds values to instance variables
    * @param month
    * @param day
    * @param year
    */
   public Date(int month, int day, int year) {
	   this.month= month;
	   this.day= day;
	   this.year= year;
   }
   

    public String toString() {
    	return this.month + "/" + this.day + "/" + this.year;
    }
   // equals() 


  //  hashCode()
    public void setMonth(int month) {
    	this.month= month;
    }
    
    
 public static void main(String[] args) {
   Date date1 = new Date(5,3,2002);
   System.out.print(date1);
 }
}
