//main calass where all the functions are implemented of the outputs. 
import java.util.*;

public class Main
{
	        public static void main (String[] args)
	        {
	                int option = 0;
	                ArrayList<Show> shows = new ArrayList<Show>();
	                ArrayList<Cinema> cinema = new ArrayList<Cinema>();
	                ArrayList<Booking> bookings = new ArrayList<Booking>();
	                ArrayList<Customer> customers = new ArrayList<Customer>();
	                Scanner select = new Scanner(System.in);
	                Scanner choice = new Scanner(System.in);
	                Scanner input = new Scanner(System.in);

		        	//Test Objects
	        	    Cinema testCinema = new Cinema("OD01", "Odeon London Cinema");
                	cinema.add(testCinema);
                	shows.add(new Show("Finding Nemo 3", cinema.get(0)));
	            do
	            {
	            //options for the system. 
	                System.out.println("------------------------------------");
	                System.out.println("Simple Cinema Booking System Prototype");
	                System.out.println("------------------------------------\n");
	                System.out.println("Please Enter 1 to Add Cinema");
	                System.out.println("Please Enter 2 to Add Film");
	                System.out.println("Please Enter 3 to Display Films");
	                System.out.println("Please Enter 4 to Create Movie Booking");
	                System.out.println("Please Enter 5 to Exit\n");

	                System.out.print("Enter Option: \n");
	                    option = select.nextInt();

//if statements based on which option the customer chooses 
	                    if(option==1)
	                    {
	                    	System.out.println("Add a cinema");
	                      System.out.println("-------------------------\n");
	                    	System.out.print("Enter a name for the cinema: ");
	                    	String cinemaName = choice.nextLine();
	                    	System.out.print("Enter an ID for the cinema: ");
	                    	String cinemaNumber = choice.nextLine();
	                    	Cinema cinemaInput = new Cinema (cinemaNumber, cinemaName); //function overloading
	                    	cinema.add(cinemaInput);
	                    }

	                    if(option==2)
	                    {
	                    		System.out.println("Add a Movie");
	                        System.out.println("-------------------------\n");
	                        System.out.print("Enter name of Movie: \n");
	                        String showName = choice.nextLine();
	                        System.out.println("Select a cinema by typing the number:");
	                        for (int i=0; i < cinema.size(); i++)
	                        {
	                        	System.out.println(i+1 + " " + cinema.get(i).getDescription());
	                        }
	                        int cinemaNumber = choice.nextInt();
	                        shows.add(new Show(showName, cinema.get(cinemaNumber-1)));
	                    }


	                    if(option==3)
	                    {
	                        System.out.println("Display all Movies");
	                        System.out.println("-------------------------\n");
	                        for (int i = 0; i < shows.size(); i++)
	                        {
	                        	int showNumber = i+1;
	                        	System.out.println("Movie Number: " + showNumber);;
	                          System.out.println("Movie Name: " + shows.get(i).getShowName());
	                          System.out.println("\n");
	                        }
	                        System.out.println("End of Movie List.\n");
	                    }

	                    if(option==4)
	                    {
	                        System.out.println("Create Movie Booking");
	                        System.out.println("-------------------------\n");
	                        Random rnd = new Random();
	                        int customerId = rnd.nextInt(999);
	                        Customer customer = new Customer(customerId);
	                        customers.add(customer);
	                        for (int i = 0; i< shows.size(); i++)
	                        {
	                        	int showNumber = i+1;
	                        		System.out.println("Movie ID: " + showNumber);
	                            System.out.println("Movie Name:   " + shows.get(i).getShowName());
	                            System.out.print("\n");
	                        }
	                        System.out.println("-------------------------");
	                        System.out.print("Enter the Movie number: ");
	                        int showNumber = choice.nextInt();
	                        int repeat = 0;
	                        System.out.println();

													// show tickets and prices and ask user how many tickets they would like
													//and then on next screen show total price message
													System.out.println("Enter the amount of Standard Adult tickets required: ");
													int ticketAdult = input.nextInt();
													int adultTicketPrice = Booking.getSeatPrice(ticketAdult, "adult");
													System.out.println("Enter the amount of Standard Child tickets required: ");
													int ticketChild = input.nextInt();
													int childTicketPrice = Booking.getSeatPrice(ticketChild, "child");
													System.out.println("Enter the amount of Standard OAP tickets required: ");
													int ticketOAP = input.nextInt();
													int oapTicketPrice = Booking.getSeatPrice(ticketOAP, "oap");
													System.out.println("Enter the amount of Standard Student tickets required: ");
													int ticketStudent = input.nextInt();
													int studentTicketPrice = Booking.getSeatPrice(ticketStudent, "student");

	                        System.out.println();
	                        System.out.println("Your Bill:");
	                        System.out.println("-------------------------");

                        	int totalCost = 0;
	      									totalCost = adultTicketPrice + childTicketPrice + oapTicketPrice + studentTicketPrice;
// the required output of the system
	                        System.out.println("CustomerID: " + customer.getId());
	                        System.out.println("The total cost of the tickets for the movie is:  £" + totalCost + ".\n");
	                        System.out.println();
	                    }

	                    if(option==5)
	                    {
	                    	System.exit(0);
	                    }

	              }while(true);
	        }
}
