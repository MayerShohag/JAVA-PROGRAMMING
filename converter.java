package Converter;
import java.util.Scanner;
public class converter {

	public static void main(String[] args) {
		Scanner all = new Scanner(System.in);
		int exit;
		int all_in_one;
		System.out.println("1. Unit Converter");
	    System.out.println("2. Storage Converter");
	    System.out.println("3. Temperature Converter");
	    System.out.print("Press your button : ");
	    all_in_one = all.nextInt();
	    switch (all_in_one) {
	    	case 1:
	    	{
	    		int lenth, lenth2;
	    		double miles, yards, Feet, Inches, Kilometers, Meters, Centimeters, Millimeters;
	    		
	    		System.out.println("______________________Unit Convertion_______________________");
	    		System.out.println("                                                            ");
	    		System.out.println("                     ***Select Unit***                      ");
	    		System.out.println("____________________________________________________________\n");
	    		System.out.println("1. Miles-(ml)");
	    		System.out.println("2. Yards-(yd)");
	    		System.out.println("3. Feet-(ft)");
	    		System.out.println("4. Inches-(inch)");
	    		System.out.println("5. Kilometers-(km)");
	    		System.out.println("6. Meters-(m)");
	    		System.out.println("7. Centimeters-(cm)");
	    		System.out.println("8. Millimeters-(mm)");
	    		System.out.print("Press integer key (1-8)...");
	    		lenth = all.nextInt();
	    		System.out.println("                                                              ");
	    		//Selected unit
	    		System.out.println("____________________Select Unit to Convert__________________");
	    		System.out.println("1. Miles-(ml)");
	    		System.out.println("2. Yards-(yd)");
	    		System.out.println("3. Feet-(ft)");
	    		System.out.println("4. Inches-(inch)");
	    		System.out.println("5. Kilometers-(km)");
	    		System.out.println("6. Meters-(m)");
	    		System.out.println("7. Centimeters-(cm)");
	    		System.out.println("8. Millimeters-(mm)");
	    		System.out.print("Press integer key (1-8)...");
	    		lenth2 = all.nextInt();
	    		System.out.println("\n____________________________________________________________\n");
	    		switch (lenth)
	    		{
	    			case 1: System.out.print("	You selected {Miles} Convert to");
	    				break;
	    			case 2: System.out.print("	You selected {Yards} Convert to");
	    				break;
	    			case 3: System.out.print("	You selected {Feet} Convert to");
	    				break;
	    			case 4: System.out.print("	You selected {Inches} Convert to");
	    				break;
	    			case 5: System.out.print("	You selected {Kilometers} Convert to");
	    				break;
	    			case 6: System.out.print("	You selected {Meters} Convert to");
	    				break;
	    			case 7: System.out.print("	You selected {Centimeters} Convert to");
	    				break;
	    			case 8: System.out.print("	You selected {Millimeters} Convert to");
	    				break;
	    		}
	    		switch (lenth2)
	    		{
	    			case 1: System.out.println(" {Mies}");
	    				break;
	    			case 2: System.out.println(" {Yards}");
	    				break;
	    			case 3: System.out.println(" {Feet}");
	    				break;
	    			case 4: System.out.println(" {Inches}");
	    				break;
	    			case 5: System.out.println(" {Kilometers}");
	    				break;
	    			case 6: System.out.println(" {Meters}");
    					break;
	    			case 7: System.out.println(" {Centimeters}");
	    				break;
	    			case 8: System.out.println(" {Millimeters}");
	    				break;
	    		}
	    		if (lenth == 1)
	    		{
	    			System.out.println("\n____________________________________________________________\n");
	    			System.out.print("Enter Miles : ");
	    			miles = all.nextDouble();
	    			if (lenth == 1 && lenth2 == 1) 
	    			{
	    				//miles to miles
	    				miles = miles;
	    				System.out.print("Your selected unit are equal...!!!");
	    				System.out.println("\n____________________________________________________________\n");
	    				
	    			}
	    			else if (lenth == 1 && lenth2 == 2)
	    			{
	    				//miles to yards
	    				yards = miles*1760;
	    				System.out.print("Your Yards is : "+ yards+"yd");
	    				System.out.println("\n____________________________________________________________\n");
	    				
	    			}
	    			else if (lenth==1 && lenth2==3)
	                {
	    				//miles to feet
	                    Feet = miles*5280;
	                    System.out.print("Your Feet is : "+ Feet + "ft");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    		    //miles to inches
	                else if (lenth==1 && lenth2==4)
	                {
	                    Inches = miles*63360;
	                    System.out.print("Your Inches is : "+Inches+"inch");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    		    //miles to kilometers
	                else if (lenth==1 && lenth2==5)
	                {
	                    Kilometers = miles*1.60934;
	                    System.out.print("Your Kilometers is : "+Kilometers+"km");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    		    //miles to meters
	                else if (lenth==1 && lenth2==6)
	                {
	                    Meters = miles*1609.34;
	                    System.out.print("Your Meters is : "+Meters+"m");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    		    //miles to centimeters
	                else if (lenth==1 && lenth2==7)
	                {
	                    Centimeters = miles*160934;
	                    System.out.print("Your Centimeters is : "+Centimeters+"cm");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    		    //miles to millimeters
	                else if (lenth==1 && lenth2==8)
	                {
	                    Millimeters = miles*1609344;
	                    System.out.print("Your Millimeters is : "+ Millimeters+"mm");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else 
	                { 
	                    System.out.print("Invalid Lenth....!!!");
	    				System.out.println("\n____________________________________________________________\n");
	                }
	    		}
	    		else if (lenth==2)
	    		{
	    			System.out.println("\n____________________________________________________________\n");
	    			System.out.print("Enter Yards : ");
	    			yards = all.nextDouble();
	    			if (lenth==2 && lenth2==1)
	    			{
	    				//yards to miles
	                    miles = yards/1760;
	                    System.out.print("Your Miles is : "+ miles+"ml");
	                    System.out.println("\n____________________________________________________________\n");
	    			}
	    			else if (lenth==2 && lenth2==2)
	                {
	                    //yards to yards
	                    yards=yards;
	                    System.out.print("Your selected volume are equal...!!!");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==2 && lenth2==3)
	                {
	                    //yards to feet
	                    Feet = yards*3;
	                    System.out.print("Your Feet is : "+Feet+"ft");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==2 && lenth2==4)
	                {
	                    //yards to inches
	                    Inches = yards*36;
	                    System.out.print("Your Inches is : "+Inches+"inch");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==2 && lenth2==5)
	                {
	                    //yards to kilometers
	                    Kilometers = yards/1093.6132983;
	                    System.out.print("Your Kilometer is : "+Kilometers+"km");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==2 && lenth2==6)
	                {
	                    //yards to meters
	                    Meters = yards/1.0936132983;
	                    System.out.print("Your Meters is : "+ Meters+"m");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==2 && lenth2==7)
	                {
	                    //yards to centimeters
	                    Centimeters = yards*91.44;
	                    System.out.print("Your Centimeters is : "+ Centimeters+"cm");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==2 && lenth2==8)
	                {
	                    //yards to millimeters
	                    Millimeters = yards*914.4;
	                    System.out.print("Your Millimeters is : "+ Millimeters+"mm");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else 
	    			{
	    				System.out.print("Invalid lenth....!!!");
	    				System.out.println("\n____________________________________________________________\n");
	    			}
	    		}
	    		else if (lenth==3)
	    		{
	    			System.out.println("\n____________________________________________________________\n");
	    			System.out.print("Enter Feet : ");
	    			Feet = all.nextDouble();
	    			if (lenth==3 && lenth2==1)
	    			{
	    				 //feet to miles
	                    miles = Feet/5280;
	                    System.out.print("Your miles is : "+ miles+"ml");
	                    System.out.println("\n____________________________________________________________\n");
	    			}
	    			else if (lenth==3 && lenth2==2)
	                {
	                    //feet to yards
	                    yards = Feet/3;
	                    System.out.print("Your Yards is : "+ yards+ "yd");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==3 && lenth2==3)
	                {
	                    //feet to feet
	                    Feet=Feet;
	                    System.out.print("Your selected volume are equal...!!!");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==3 && lenth2==4)
	                {
	                    //feet to inches
	                    Inches = Feet*12;
	                    System.out.print("Your Inches is : "+ Inches+ "inch");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==3 && lenth2==5)
	                {
	                    //feet to kilometers
	                    Kilometers = Feet/3280.839895;
	                    System.out.print("Your kilometers is : "+ Kilometers+ "km");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==3 && lenth2==6)
	                {
	                    //feet to meters
	                    Meters = Feet/3.280839895;
	                    System.out.print("Your meters is : "+ Meters+ "m");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==3 && lenth2==7)
	                {
	                    //feet to centimeters
	                    Centimeters = Feet*30.48;
	                    System.out.print("Your Centimeters is : "+Centimeters+"cm");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==3 && lenth2==8)
	                {
	                    //feet to millimeters
	                    Millimeters = Feet*304.8;
	                    System.out.print("Your Milimeters is : "+ Millimeters+ "mm");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else
	    			{
	    				System.out.print("Invalid lenth...!!!");
	    				System.out.println("\n____________________________________________________________\n");
	    			}
	    		}
	    		else if (lenth==4)
	    		{
	    			System.out.println("\n____________________________________________________________\n");
	    			System.out.print("Enter inches : ");
	    			Inches = all.nextDouble();
	    			if (lenth==4 && lenth2==1)
	    			{
	    				//inches to miles
	                    miles = Inches/63360;
	                    System.out.print("Your Miles is : "+miles+"ml");
	                    System.out.println("\n____________________________________________________________\n");
	    			}
	    			else if (lenth==4 && lenth2==2)
	                {
	                    //inches to yards
	                    yards = Inches/36;
	                    System.out.print("Your Yards is : "+yards+"yd");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==4 && lenth2==3)
	                {
	                    //inches to feet
	                    Feet = Inches/12;
	                    System.out.print("Your Feet is : "+ Feet+"ft");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==4 && lenth2==4)
	                {
	                    //inches to inches
	                    Inches=Inches;
	                    System.out.print("Your selected volume are equal...!!!");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==4 && lenth2==5)
	                {
	                    //inches to kilometers
	                    Kilometers = Inches/39370.07874;
	                    System.out.print("Your Kilometers is : "+ Kilometers+ "km");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==4 && lenth2==6)
	                {
	                    //inches to meters
	                    Meters = Inches/39.37007874;
	                    System.out.print("Your Meters is : "+ Meters+ "m");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==4 && lenth2==7)
	                {
	                    //inches to centimeters
	                    Centimeters = Inches*2.54;
	                    System.out.print("Your Centimeters is : "+ Centimeters+ "cm");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    			else if (lenth==4 && lenth2==8)
	                {
	                    //inches to millimeters
	                    Millimeters = Inches*25.4;
	                    System.out.print("Your Millimeters is : "+Millimeters+ "mm");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else 
	                { 
	                	System.out.print("Invalid lenth...!!!");
	                	System.out.println("\n____________________________________________________________\n");
	                }
	    		}
	    		else if (lenth==5)
	    		{
	    			System.out.println("\n____________________________________________________________\n");
	    			System.out.print("Enter Kilometers : ");
	    			Kilometers = all.nextDouble();
	    			if (lenth==5 && lenth2==1)
	                {
	                    //kilometers to miles
	                    miles = Kilometers/1.609344;
	                    System.out.print("Your Miles is : "+miles+"ml");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==5 && lenth2==2)
	                {
	                    //kilometers to yards
	                    yards = Kilometers*1093.6132983;
	                    System.out.print("Your Yards is : "+ yards+ "yd");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==5 && lenth2==3)
	                {
	                    //kilometers to feet
	                    Feet = Kilometers*3280.839895;
	                    System.out.print("Your Feet is : "+Feet+"ft");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==5 && lenth2==4)
	                {
	                    //kilometers to inches
	                    Inches = Kilometers*39370.07874;
	                    System.out.print("Your Inches is : "+ Inches+"inch");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==5 && lenth2==5)
	                {
	                    //kilometers to kilometers
	                    Kilometers = Kilometers;
	                    System.out.print("Your selected volume are equal...!!!");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==5 && lenth2==6)
	                {
	                    //kilometers to meters
	                    Meters = Kilometers*1000;
	                    System.out.print("Your Meters is : "+ Meters+ "m");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==5 && lenth2==7)
	                {
	                    //kilometers to centimeters
	                    Centimeters = Kilometers*100000;
	                    System.out.print("Your Centimeters is : "+ Centimeters+ "cm");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==5 && lenth2==8)
	                {
	                    //kilometers to millimeters
	                    Millimeters = Kilometers*1000000;
	                    System.out.print("Your Millimeters is : "+ Millimeters+ "mm");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else 
	                {
	                    System.out.print("Invalid Lenth...!!!");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	    		}
	    		else if (lenth==6)
	    		{
	    			System.out.println("\n____________________________________________________________\n");
	    			System.out.print("Enter Meters : ");
	    			Meters = all.nextDouble();
	    			if (lenth==6 && lenth2==1)
	                {
	                    //meters to miles
	                    miles = Meters/1609.344;
	                    System.out.print("Your Miles is : "+ miles+ "ml");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==6 && lenth2==2)
	                {
	                    //meters to yards
	                    yards = Meters*1.0936133;
	                    System.out.print("Your Yards is : "+ yards+ "yd");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==6 && lenth2==3)
	                {
	                    //meters to feet
	                    Feet = Meters*3.2808399;
	                    System.out.print("Your Feet is : "+ Feet+ "ft");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==6 && lenth2==4)
	                {
	                    //meters to inches
	                    Inches = Meters*39.3700787;
	                    System.out.print("Your Inches is : " +Inches+ "inch");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==6 && lenth2==5)
	                {
	                    //meters to kilometers
	                    Kilometers = Meters/1000;
	                    System.out.print("Your Kilometers is : "+ Kilometers+ "km");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==6 && lenth2==6)
	                {
	                    //meters to meters
	                    Meters = Meters;
	                    System.out.print("Your selected volume are equal...!!!");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==6 && lenth2==7)
	                {
	                    //meters to centimeters
	                    Centimeters = Meters*100;
	                    System.out.print("Your Centimeters is : "+ Centimeters+ "cm");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==6 && lenth2==8)
	                {
	                    //meters to millimeters
	                    Millimeters = Meters*1000;
	                    System.out.print("Your Millimeters is : "+ Millimeters+ "mm");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else 
	                {
	                	System.out.print("Invalid Lenth...!!!");
	                	System.out.println("\n____________________________________________________________\n");
	                }
	    		}
	    		else if (lenth==7)
	    		{
	    			System.out.println("\n____________________________________________________________\n");
	    			System.out.print("Enter Centimeters : ");
	    			Centimeters = all.nextDouble();
	    			if (lenth==7 && lenth2==1)
	                {
	                    //centimeters to miles
	                    miles = Centimeters/160934.4;
	                    System.out.print("Your miles is : "+ miles+ "ml");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==7 && lenth2==2)
	                {
	                    //centimeters to yards
	                    yards = Centimeters/91.44;
	                    System.out.print("Your Yards is : "+ yards+ "yd");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==7 && lenth2==3)
	                {
	                    //centimeters to feet
	                    Feet = Centimeters/30.48;
	                    System.out.print("Your Feet is : "+ Feet+ "ft");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==7 && lenth2==4)
	                {
	                    //centimeters to inches
	                    Inches = Centimeters/2.54;
	                    System.out.print("Your Inches is : "+ Inches+ "inch");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==7 && lenth2==5)
	                {
	                    //centimeters to kilometers
	                    Kilometers = Centimeters/100000;
	                    System.out.print("Your Kilometers is : "+ Kilometers+ "km");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==7 && lenth2==6)
	                {
	                    //centimeters to meters
	                    Meters = Centimeters/100;
	                    System.out.print("Your Meters is : "+ Meters+ "m");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==7 && lenth2==7)
	                {
	                    //centimeters to centiemters
	                    Centimeters = Centimeters;
	                    System.out.print("Your selected volume are equal...!!!");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==7 && lenth2==8)
	                {
	                    //centimeters to millimeters
	                    Millimeters = Centimeters*10;
	                    System.out.print("Your Millimeters is : "+ Millimeters+ "mm");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else 
	                {
	                	System.out.print("Invalid Lenth...!!!");
	                	System.out.println("\n____________________________________________________________\n");
	                }
	    		}
	    		else if (lenth==8)
	    		{
	    			System.out.println("\n____________________________________________________________\n");
	    			System.out.print("Enter Millimeters : ");
	    			Millimeters = all.nextDouble();
	    			if (lenth==8 && lenth2==1)
	                {
	                    //millimeters to miles
	                    miles = Millimeters/1609344;
	                    System.out.print("Your Miles is : "+ miles+ "ml");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==8 && lenth2==2)
	                {
	                    //millimeters to yards
	                    yards = Millimeters/914.4;
	                    System.out.print("Your Yards is : "+ yards+ "yd");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==8 && lenth2==3)
	                {
	                    //millimeters to feet
	                    Feet = Millimeters/304.8;
	                    System.out.print("Your Feet is : "+ Feet+ "ft");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==8 && lenth2==4)
	                {
	                    //millimeters to inches
	                    Inches = Millimeters/25.4;
	                    System.out.print("Your Inches is : "+ Inches+ "inch");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==8 && lenth2==5)
	                {
	                    //millimeters to kilometers
	                    Kilometers = Millimeters/1000000;
	                    System.out.print("Your kilometers is : "+ Kilometers+ "km");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==8 && lenth2==6)
	                {
	                    //millimeters to meters
	                    Meters = Millimeters/1000;
	                    System.out.print("Your Meters is : "+ Meters +"m");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==8 && lenth2==7)
	                {
	                    //millimeters to centimeters
	                    Centimeters = Millimeters/10;
	                    System.out.print("Your Centimeters is : "+ Centimeters+ "cm");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else if (lenth==8 && lenth2==8)
	                {
	                    //millimeters to millimeters
	                    Millimeters = Millimeters;
	                    System.out.print("Your selected volume are equal...!!!");
	                    System.out.println("\n____________________________________________________________\n");
	                }
	                else 
	                {
	                	System.out.print( "Invalid Lenth...!!!");
	                	System.out.println("\n____________________________________________________________\n");
	                }
	    		}
	    		/*System.out.print("\n____________________________________________________________");
	    		System.out.print("\nPress any key and hit Enter to exit...");
	            exit = all.nextInt();
	            break;*/
	    	}
	    }    
	}
}
