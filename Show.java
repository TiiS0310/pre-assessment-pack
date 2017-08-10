// class for movies 
import java.util.*;

public class Show {

	private String showName;
	private Cinema cinema;

	public Show(String showName,  Cinema cinema)
	{
		this.showName = showName;
		this.cinema = cinema;
	}

	public void setShowName(String showName)
	{
		this.showName = showName;
	}

	public void setCinema( Cinema cinema)
	{
		this.cinema = cinema;
	}

	public String getShowName()
	{
		return showName;
	}

	public Cinema getCinema()
	{
		return cinema;
	}
}
