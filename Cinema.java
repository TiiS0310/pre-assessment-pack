// class for the cinema 
import java.util.*;

public class Cinema{

//declaring variables for the cinema class
	private String cinemaNumber;
	private String description;

	public Cinema(String cinemaNumber, String description)
	{
		this.description = description;
		this.cinemaNumber = cinemaNumber;
	}

	public String getDescription()
	{
		return description;
	}
}
