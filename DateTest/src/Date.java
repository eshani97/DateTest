
public class Date {
			
		private int month;
		private int day;
		private int year;
		
		public Date()
		{ 
			System.out.println("\nConstructor called");
		month=0;
		day=0;
		year=0;
		}
		
		public void setMonth(int month)
		{
			this.month=month;
		}
		public void setDay(int day)
		{
			this.day=day;
		}
		public void setYear(int year)
		{
			this.year=year;
		}
	    public int getMonth()
	    {
	    	return month;
	    }
	    public int getDay()
	    {
	    	return day;
	    }
	    public int getYear()
	    {
	    	return year;
	    }
	    public void displayDate()
	    {
	    	System.out.printf(" %n The date is : %d / %d / %d ",getMonth(),getDay(),getYear());
	 }
	    

}
