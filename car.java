import java.util.*;

class car 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println(".......Welcome to Honda..........");
		System.out.println(".......Enter the Driver Name..........");
		String Dname=sc.nextLine();
		System.out.println("\t\t\t.......Enter Gender..........\n\t\t\t1.Male \n\t\t\t2.Female");
		int gen = sc.nextInt();
		String resp = "Mr.";
		if (gen==1)
		{
			resp = "Mr.";
		}
		else if (gen==2)
		{
			resp = "Ms.";
		}
		else 
		{
			System.out.println("Invalid Answer");
		}
		System.out.println("\t\t\tWelcome "+resp +Dname+". \n\t\t\t Have a Nice Day"   );
		int a = 1;
		boolean car_engine=false;
		boolean petrol_cap = false;
		boolean autopilot =false;
		do
		{
			System.out.println("\n1.Start \n2.Stop \n3.Petrol - Open \n4.Petrol - Close \n5.Auto pilot mode \n6.Help \n7.Quit");
		    int user_ent=sc.nextInt();
			
		    if(user_ent==1 && car_engine==false && petrol_cap==false )
		    {
			    System.out.println("\t\t\tThe car has been Started...\n\t\t\tHappy Journey...");
			    car_engine = true;
			}
			else if (user_ent==1 && car_engine==true && petrol_cap==true )
			{
				System.out.println("\t\t\t Warning: Please Close the Petrol cap and Start the Engine\n\t\t\t For the Safety Purpose Car Stopped Automatically...Drive Safe by Closing the petrol - cap and  pressing 1...");
			    car_engine = false;
			}

			else if (user_ent==1 && car_engine ==true && petrol_cap== false )
			{
				System.out.println("\t\t\tThe car has been Started Already...");
			}
			else if (user_ent==1 && car_engine==false && petrol_cap==true )
			{
				System.out.println("\t\t\t Warning: Please Close the Petrol cap and Start the Engine\n\t\t\t For the Safety Purpose Car Stopped Automatically...Drive Safe by Closing the petrol - cap and  pressing 1...");
			    car_engine = false;
			}
			if (user_ent==2 && car_engine ==true)
			{
				System.out.println("\t\t\tThe car has been stopped...\n\t\t\tMiss You...");
			    car_engine=false;
			}
			else if (user_ent==2 && car_engine==false)
			{
				System.out.println("\t\t\tThe car has been already Stopped...");
			}

			if(user_ent==3 && petrol_cap==false )
		    {
			    System.out.println("\t\t\tFule cap is opened \n\t\t\tReady to Boost up");
			    car_engine=false;
				petrol_cap = true;
			}
			else if (user_ent==3 && petrol_cap ==true)
			{
				System.out.println("\t\t\tThe Fule cap is opened Already...");
			}
			if (user_ent==4 && petrol_cap ==true)
			{
				System.out.println("\t\t\tFule cap is Closed...\n\t\t\tThanks for the Treat "+resp +Dname+".");
			    petrol_cap=false;
			}
			else if (user_ent==4 && petrol_cap==false)
			{
				System.out.println("\t\t\tFule cap is Closed Already...");
			}
			if (user_ent==5 && autopilot==false)
			{
				System.out.println("\t\t\t Auto Pilot Mode is Activated...\n\t\t\tAutomatically return to Main Menu");
				autopilot = true;
			}
			else if (user_ent==5 && autopilot==true)
			{
				System.out.println("\t\t\tAuto Pilot Mode is Deactivated...\n\t\t\tAutomatically return to Main Menu");
				autopilot = false;
			}
			if (user_ent==6)
			{
				System.out.println("\t\t\t Call has been connecting to get help from Our Nearest Branch");
				Thread.sleep(3000);
				System.out.println("\t\t\t Call has been Connected... Help is on Your Way... \nAutomatically return to Main Menu");
				
			}
			if (user_ent==7)
			{
				a++;
				System.exit(user_ent);
			}
			if (user_ent>7 || user_ent<=0)
			{
				System.out.println("\t\t\t Invalid selection... Kindly select any valid option");
			}
		}
		while (a == 1);	
	}
}
