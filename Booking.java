
import java.util.Calendar;

public class Booking {

	int cost;
	Customer customer;
	Show show;

	public Booking(Customer customer, Show show)
	{
		this.customer = customer;
		this.show = show;
	}

//function to set the price for wednesday discount 
	public static int getSeatPrice(Integer c, String s)
	{

		Calendar date = Calendar.getInstance();
		boolean wed;

//if statement- loop 
		if(date.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
		    wed = true;
			}
			else {
				wed = false;
			}

		if(wed == true)
		{
			if (s.equals("adult")) {
				return c * 6;
			}
			if (s.equals("child")) {
				return c * 2;
			}
			if (s.equals("oap")) {
				return c * 4;
			}
			if (s.equals("student")) {
				return c * 4;
			}
		}
		else
		{
			if (s.equals("adult")) {
				return c * 8;
			}
			if (s.equals("child")) {
				return c * 4;
			}
			if (s.equals("oap")) {
				return c * 6;
			}
			if (s.equals("student")) {
				return c * 4;
			}
		}
		return 0;
  }

	public Customer getCustomer()
	{
		return customer;
	}
}
