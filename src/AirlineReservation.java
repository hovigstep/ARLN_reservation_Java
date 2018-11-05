import java.util.Scanner;
import java.util.Arrays;



public class AirlineReservation {
	
	    String planeName;

		public int[] AB1c;

		public int[] ABbc = { 36 };

		int[] ABec = { 230 };

		int[] Bo1c = { 40 };

		int[] Bobc = { 36 };

		int[] Boec = { 330 };


	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		class Airbus {
			int i;
			int AB1c1[];
		};


		class Airbusines {
			int i;
			int ABbc[];
		};


		class AirEconomy {
			int i;
			int ABec[];
		};


		class Boi1clas {
			int i;
			int Bo1c[] ;
		};



		class BoiBusines {
			int i;
			int Bobc[];
		};


		class BoiEconomy {
			int i;
			int Boec[] ;
		};
		
		int Choice;
		int MaxChoices;
		String Username=" ";

		int PlaneCh;
		int Class;
		
		

		
		Airbus Firstclass=new Airbus();
		Airbusines busin= new Airbusines();
		AirEconomy Econom=new AirEconomy();
		//BOEIng seats **********************
		Boi1clas boi1c=new Boi1clas();
		BoiBusines boibus=new BoiBusines();
		BoiEconomy boieco= new BoiEconomy();
		{
		
		
		MaxChoices = 10;
		Choice = 0;
		System.out.print("Please Enter your First and Last Name:");
		Scanner input = new Scanner(System.in);
		int i=0;
		while (Choice < MaxChoices)
		{

			System.out.print("Welcome to Flight booking");
			System.out.print( Username);
			System.out.print("************** MAIN MENU ****************");
			System.out.print("Please Enter one of the following Choices");
			System.out.print("************** MAIN MENU ****************");
			System.out.print("1 - Reservation");
			System.out.print("2 - Cancellation");
			System.out.print("3 - View Seat Availability");

			System.out.print("10: Exit Flight Booking");
			Choice=input.nextInt();
			
			switch (Choice)
			{
			case 1:

				System.out.print( "Reservation" );
				System.out.print( "************** MENU ****************");
				System.out.print("Please Enter The Airplane Of Choice:" );
				System.out.print( "1 - Airbus 300A " );
				System.out.print("2 - Boeing 747 " );
				PlaneCh=input.nextInt();

				switch (PlaneCh)
				{
				case 1:

					System.out.print( "Thank You for choosing The Airbus 300A" );
					System.out.print( "Please Enter The Class of your choice" );
					System.out.print("1 - First Class " );
					System.out.print("2 - Business Class ");
					System.out.print("3 - Economy Class " );
					Class=input.nextInt();

					switch (Class)
					{
					case 1:
						System.out.print( "Thank You for choosing First Class");
						System.out.print( "Please Enter The Seat of your choice From Numbers 1-20" );

						Firstclass.i=input.nextInt();



						//printing

							if (Firstclass.i > 20 || Firstclass.i < 1)
							{
								System.out.print("Wrong Number Try Again !" );
							}
							else
							{
								Firstclass.AB1c1[i] = 1;
								System.out.print( Username);
								System.out.print("you have been assigned seat");
								System.out.print(Firstclass.i);
							}

						
						break;






					case 2:
						System.out.print( "Thank You for choosing Business Class");
						System.out.print( "Please Enter The Seat of your choice From Numbers 21-56");
						busin.i=input.nextInt();

						//printing
						if (busin.i > 56 || busin.i < 21)
						{
							System.out.print( "Wrong Number Try Again !");
						}
						else
							busin.ABbc[i] = 1;
							System.out.print( Username);
							System.out.print(" You have now been assigned seat ");
							System.out.print(busin.i);

							break;

					case 3:
						System.out.print( "Thank You for choosing Economy Class" );
						System.out.print( "Please Enter The Seat of your choice From Numbers 56-286" );
						Econom.i=input.nextInt();

						//printing
						if (Econom.i > 56 || Econom.i < 286)
						{
							System.out.print( "Wrong Number Try Again !" );
						}
						else
							Econom.ABec[i] = 1;
						System.out.print( Username);
						System.out.print(" You have now been assigned seat ");
						System.out.print(Econom.i );

						break;
					}


					break;

				case 2:

					System.out.print( "Thank You for choosing The Boeing 747 " );
					System.out.print( "Please Enter The Class of your choice");
					System.out.print( "1 - First Class ");
					System.out.print( "2 - Business Class ");
					System.out.print( "3 - Economy Class " );
					Class=input.nextInt();
					switch (Class)
					{
					case 1:
						System.out.print( "Thank You for choosing First Class");
						System.out.print( "Please Enter The Seat of your choice From Numbers 1-40" );
						boi1c.i=input.nextInt();

						//printing
						if (boi1c.i > 40 || boi1c.i < 1)
						{
							System.out.print("Wrong Number Try Again !" );
						}
						else
							boi1c.Bo1c[i] = 1;
						System.out.print( Username);
						System.out.print(" You have now been assigned seat ");
						System.out.print(boi1c.i);


						break;

					case 2:
						System.out.print( "Thank You for choosing Business Class" );
						System.out.print( "Please Enter The Seat of your choice From Numbers 40-76" );
						boibus.i=input.nextInt();

						//printing
						if (boibus.i > 40 || boibus.i < 76)
						{
							System.out.print( "Wrong Number Try Again !");
						}
						else
							boibus.Bobc[i] = 1;
						System.out.print( Username);
						System.out.print(" You have now been assigned seat ");
						System.out.print(boibus.i);

						break;

					case 3:
						System.out.print( "Thank You for choosing Economy Class" );
						System.out.print( "Please Enter The Seat of your choice From Numbers 76-406");
						boieco.i=input.nextInt();

						//printing
						if (boieco.i > 76 || boieco.i < 406)
						{
							System.out.print( "Wrong Number Try Again !");
						}
						else
							boieco.Boec[i] = 1;
						System.out.print( Username);
						System.out.print(" You have now been assigned seat ");
						System.out.print( boieco.i);

						break;
					}


					break;
				}
				break;


				//CANCELLATION  CANCELLATION  CANCELLATION  CANCELLATION  CANCELLATION 
				//CANCELLATION  CANCELLATION  CANCELLATION  CANCELLATION  CANCELLATION 

			case 2:

				System.out.print( "Cancellation" );
				System.out.print( "************** MENU ****************");
				System.out.print( "Please Enter Airoplane Number");
				System.out.print( "1 - Airbus 300A " );
				System.out.print( "2 - Boeing 747 ");
				PlaneCh=input.nextInt();

				switch (PlaneCh)
				{
				case 1:

					System.out.print( "Please Enter The Class of your choice" );
					System.out.print( "1 - First Class " );
					System.out.print( "2 - Business Class ");
					System.out.print( "3 - Economy Class ");
					Class=input.nextInt();

					switch (Class)
					{
					case 1:

						System.out.print( "Please Enter The Seat you wish to cancel 1-20" );
						Firstclass.i=input.nextInt();

						//printing
						if (Firstclass.i > 20 && Firstclass.i < 1)
						{
							System.out.print( "Wrong Number Try Again !" );
						}
						else
							Firstclass.AB1c1[i] = 0;
							System.out.print(Username);
							System.out.print(" You Have now cancelled seat number");
							System.out.print(Firstclass.i);

						break;

					case 2:

						System.out.print( "Please Enter The Seat you wish to cancel From Numbers 21-56");
						busin.i=input.nextInt();

						//printing
						if (busin.i > 56 || busin.i < 21)
						{
							System.out.print( "Wrong Number Try Again !");
						}
						else
							busin.ABbc[i] = 0;
						System.out.print( Username);
						System.out.print(" You have now cancelled seat number ");
						System.out.print(busin.i);

						break;

					case 3:

						System.out.print( "Please Enter The Seat you wish to cancel From Numbers 56-286");
						Econom.i=input.nextInt();

						//printing
						if (Econom.i > 56 || Econom.i < 286)
						{
							System.out.print( "Wrong Number Try Again !");
						}
						else
							Econom.ABec[i] = 0;
						System.out.print(Username);
						System.out.print(" You have cancelled seat number ");
						System.out.print( Econom.i);

						break;
					}


				case 2:

					System.out.print("Please Enter The Class of your choice");
					System.out.print( "1 - First Class " );
					System.out.print( "2 - Business Class ");
					System.out.print( "3 - Economy Class ");
					Class=input.nextInt();
					switch (Class)
					{
					case 1:

						System.out.print( "Please Enter The seat you wish to cancel From Numbers 1-40");
						boi1c.i=input.nextInt();

						//printing
						if (boi1c.i > 40 || boi1c.i < 1)
						{
							System.out.print( "Wrong Number Try Again !");
						}
						else
							boi1c.Bo1c[i] = 0;
						System.out.print( Username);
						System.out.print(" You have now canceled seat number ");
						System.out.print(boi1c.i);


						break;

					case 2:

						System.out.print( "Please Enter The Seat you wish to cancel From Numbers 40-76");
						boibus.i=input.nextInt();

						//printing
						if (boibus.i > 40 || boibus.i < 76)
						{
							System.out.print( "Wrong Number Try Again !");
						}
						else
							boibus.Bobc[i] = 0;
						System.out.print( Username);
						System.out.print(" You have now canceled seat number ");
						System.out.print( boibus.i);

						break;

					case 3:

						System.out.print( "Please Enter The Seat you wish to cancel From Numbers 76-406" );
						boibus.i=input.nextInt();

						//printing
						if (boibus.i > 76 || boibus.i < 406)
						{
							System.out.print( "Wrong Number Try Again !" );
						}
						else
							boieco.Boec[i] = 0;
						System.out.print( Username);
						System.out.print( " You have now canceled the seat number ");
						System.out.print( boibus.i);

						break;
					}

				}
			
					break;


					//SEAT AVAILABILITY

				case 3:

					System.out.print("Welcome To Seat Availability" );
					System.out.print("************** MENU ****************" );
					System.out.print("Please Enter Airoplane Number" );
					System.out.print("1 - Airbus 300A ");
					System.out.print("2 - Boeing 747 " );
					PlaneCh=input.nextInt();
					switch (PlaneCh)
					{
					case 1:



						System.out.print(" First Class Seats Available" );
						System.out.print("- Business Class Seats Available " );
						System.out.print("- Economy Class Seats Available " );
						System.out.print("- Total Available Seats" );

						break;

					case 2:

						System.out.print("- First Class Seats Available " );
						System.out.print("- Business Class Seats Available " );
						System.out.print("- Economy Class Seats Available " );
						System.out.print("- Total Available Seats" );

						break;
					case 10:
						break;
					}
				}
		}}}}


