package trail3;

import java.util.Scanner;

public class Store
{
	String Items[]= new String[10];
	int Itemcost[]= new int[10];
	String Content[]=new String[10];
	Scanner sc=new Scanner(System.in);
	Line lineobj=new Line();
	String Bill="";
	static String name,num;
	int Price;
	static int count=0;
	public void welcome()
	{
		lineobj.linestar();
		System.out.println("Welcome at AK all in One Stores Trail3");
		lineobj.linestar();
	}
	public void Itemdetail()
	{
		String conitem[]= {"1.Clothes","2.Electronics","3.Fruits","4.Vegetables"};
		for(int i=0;i<conitem.length;i++)
		{
			Content[i]=conitem[i];
		}
		contentshow(conitem.length);
		SBill();
		System.out.print("Please Choose an option ==> ");
		int op=Integer.parseInt(sc.nextLine());
		lineobj.lineunderscore();
		switch(op)
		{
			case 1:Clothes();break;
			case 2:Electronics();break;
			case 3:Fruits();break;
			case 4:Vegetables();break;
			case 22:TotBill();break;
			default:invalid();Itemdetail();break;
		}
	}
	public void Clothes()
	{
		String conitem[]= {"1.Men Wear","2.Women Wear","99.Back"};
		for(int i=0;i<conitem.length;i++)
		{
			Content[i]=conitem[i];
		}
		contentshow(conitem.length);
		SBill();
		System.out.print("Please Choose an option ===> ");

			int op=Integer.parseInt(sc.nextLine());
			switch(op)
				{
					case 1:menWear();break;
					case 2:womenWear();break;
					case 99:Itemdetail();break;
					case 22:TotBill();break;
					default:invalid();Clothes();break;
				}
	}
	public void Electronics()
	{
		String conitem[]= {"1.Mobiles","2.Laptops","3.Tv","99.Back"};
		for(int i=0;i<conitem.length;i++)
		{
			Content[i]=conitem[i];
		}
		contentshow(conitem.length);
		SBill();
		System.out.print("Please Choose an option ===> ");
		int op=Integer.parseInt(sc.nextLine());
		switch(op)
		{
			case 1:mobiles();break;
			case 2:laptops();break;
			case 3:tv();break;
			case 0:Itemdetail();break;
			case 22:TotBill();break;
			default:invalid();Itemdetail();break;
		}
	}
	public void menWear()
	{
		int n=4;//No.of items in this Category
		String mens[]= {"Shirts","Pants","Jeans","Formals"};
		int eachcost[]= {250,350,450,600};
		for(int i=0;i<n;i++)
		{
			Items[i]=mens[i];
			Itemcost[i]=eachcost[i];
		}
		show(n);
		SBill();
		System.out.print("Please Choose an option ===> ");
		int op=Integer.parseInt(sc.nextLine());
		switch(op)
		{
			case 0:
			case 1:
			case 2:
			case 3:
				{
					System.out.print("Enter the Quantity ===> ");count++;
					int qty=Integer.parseInt(sc.nextLine());
					lineobj.lineunderscore();
					menushow(op,qty);
					lineobj.lineunderscore();
					menubill(op,qty);
				}break;
			case 99:Clothes();break;
			case 22:TotBill();break;
			default:invalid();menWear();break;
		}
		System.out.println("To Continue in Men Wear \t\tpress m");
		System.out.println("For Clothing Section\t\t\tpress c");
		System.out.println("For Stores\t\t\t\tpress s");
		System.out.println("For Bill\t\t\t\tpress b");
		System.out.print("Please Choose your option ===> ");
		String ch=sc.nextLine();
		lineobj.lineunderscore();
		switch(ch)
		{
		case "m":
		case "M":menWear();break;
		case "c":
		case "C":Clothes();break;
		case "s":
		case "S":Itemdetail();break;
		case "b":
		case "B":TotBill();break;
		default:invalid();menWear();break;
		}
	}
	public void womenWear()
	{
		int n=4;//No.of items in this Category
		String womens[]= {"Sarees","HalfSaree","Chudidar","Punjabi Dresses"};
		int eachcost[]= {250,350,450,600};
		for(int i=0;i<n;i++)
		{
			Items[i]=womens[i];
			Itemcost[i]=eachcost[i];
		}
		show(n);
		SBill();
		System.out.print("Please Choose an option ===> ");
		int op=Integer.parseInt(sc.nextLine());
		switch(op)
		{
			case 0:
			case 1:
			case 2:
			case 3:
				{
					System.out.print("Enter the Quantity ===> ");count++;
					int qty=Integer.parseInt(sc.nextLine());
					lineobj.lineunderscore();
					menushow(op,qty);
					lineobj.lineunderscore();
					menubill(op,qty);
				}break;
			case 99:Clothes();break;
			case 22:TotBill();break;
			default:invalid();womenWear();break;
		}
		System.out.println("To Continue in Women Wear \t\tpress w");
		System.out.println("For Clothing Section\t\t\tpress c");
		System.out.println("For Stores\t\t\t\tpress s");
		System.out.println("For Bill\t\t\t\tpress b");
		System.out.print("Please Choose your option ===> ");
		String ch=sc.nextLine();
		lineobj.lineunderscore();
		switch(ch)
		{
		case "w":
		case "W":womenWear();break;
		case "c":
		case "C":Clothes();break;
		case "s":
		case "S":Itemdetail();break;
		case "b":
		case "B":TotBill();break;
		default:invalid();womenWear();break;
		}
	}
	public void mobiles()
	{
		int n=5;//No.of items in this Category
		String mobile[]= {"Apple","Mi","Nokia","Realme","Samsung"};
		int mobilecost[]= {50000,10000,15000,13000,12000};
		for(int i=0;i<n;i++)
		{
			Items[i]=mobile[i];
			Itemcost[i]=mobilecost[i];
		}
		show(n);
		SBill();
		System.out.print("Please Choose an option ===> ");
		int op=Integer.parseInt(sc.nextLine());
		switch(op)
		{
			case 0:
			case 1:
			case 2:
			case 3:
				{
					System.out.print("Enter the Quantity ===> ");count++;
					int qty=Integer.parseInt(sc.nextLine());
					lineobj.lineunderscore();
					menushow(op,qty);
					lineobj.lineunderscore();
					menubill(op,qty);
				}break;
			case 99:Electronics();break;
			case 22:TotBill();break;
			default:invalid();mobiles();break;
		}
		System.out.println("To Continue in Mobiles \t\tpress m");
		System.out.println("For Electronics Section\t\t\tpress e");
		System.out.println("For Stores\t\t\t\tpress s");
		System.out.println("For Bill\t\t\t\tpress b");
		System.out.print("Please Choose your option ===> ");
		String ch=sc.nextLine();
		lineobj.lineunderscore();
		switch(ch)
		{
		case "m":
		case "M":mobiles();break;
		case "e":
		case "E":Electronics();break;
		case "s":
		case "S":Itemdetail();break;
		case "b":
		case "B":TotBill();break;
		default:invalid();mobiles();break;
		}
	}
	public void laptops()
	{
		int n=4;//No.of items in this Category
		String laptop[]= {"Asus","Dell","Hp","Lenovo"};
		int laptopcost[]= {50000,35000,45000,30000};
		for(int i=0;i<n;i++)
		{
			Items[i]=laptop[i];
			Itemcost[i]=laptopcost[i];
		}
		show(n);
		SBill();
		System.out.print("Please Choose an option ===> ");
		int op=Integer.parseInt(sc.nextLine());
		switch(op)
		{
			case 0:
			case 1:
			case 2:
			case 3:
				{
					System.out.print("Enter the Quantity ===> ");count++;
					int qty=Integer.parseInt(sc.nextLine());
					lineobj.lineunderscore();
					menushow(op,qty);
					lineobj.lineunderscore();
					menubill(op,qty);
				}break;
			case 99:Electronics();break;
			case 22:TotBill();break;
			default:invalid();laptops();break;
		}
		System.out.println("To Continue in Laptops \t\tpress l");
		System.out.println("For Electronics\t\t\tpress e");
		System.out.println("For Stores\t\t\t\tpress s");
		System.out.println("For Bill\t\t\t\tpress b");
		System.out.print("Please Choose your option ===> ");
		String ch=sc.nextLine();
		lineobj.lineunderscore();
		switch(ch)
		{
		case "l":
		case "L":laptops();break;
		case "e":
		case "E":Electronics();break;
		case "s":
		case "S":Itemdetail();break;
		case "b":
		case "B":TotBill();break;
		default:invalid();laptops();break;
		}
	}
	public void tv()
	{
		int n=3;//No.of items in this Category
		String tv[]= {"Onida","Sony","Toshiba"};
		int tvcost[]= {20000,30000,20000};
		for(int i=0;i<n;i++)
		{
			Items[i]=tv[i];
			Itemcost[i]=tvcost[i];
		}
		show(n);
		
		SBill();
		System.out.print("Please Choose an option ===> ");
		int op=Integer.parseInt(sc.nextLine());
		switch(op)
		{
			case 0:
			case 1:
			case 2:
			case 3:
				{
					System.out.print("Enter the Quantity ===> ");count++;
					int qty=Integer.parseInt(sc.nextLine());
					lineobj.lineunderscore();
					menushow(op,qty);
					lineobj.lineunderscore();
					menubill(op,qty);
				}break;
			case 99:Electronics();break;
			case 22:TotBill();break;
			default:invalid();invalid();tv();break;
		}
		System.out.println("To Continue in Tv \t\tpress t");
		System.out.println("For Electronics\t\t\tpress e");
		System.out.println("For Stores\t\t\t\tpress s");
		System.out.println("For Bill\t\t\t\tpress b");
		System.out.print("Please Choose your option ===> ");
		String ch=sc.nextLine();
		lineobj.lineunderscore();
		switch(ch)
		{
		case "t":
		case "T":tv();break;
		case "e":
		case "E":Electronics();break;
		case "s":
		case "S":Itemdetail();break;
		case "b":
		case "B":TotBill();break;
		default:invalid();tv();break;
		}
	}
	public void Fruits()
	{
		int n=7;//No.of items in this Category
		String fruits[]= {"Apple","Banana","Cherry","Grapes","Guava","Mango","Papaya"};
		int fruitcost[]= {100,40,80,60,20,150,30};
		for(int i=0;i<n;i++)
		{
			Items[i]=fruits[i];
			Itemcost[i]=fruitcost[i];
		}
		show(n);
		SBill();
		System.out.print("Please Choose an option ===> ");
		int op=Integer.parseInt(sc.nextLine());
		switch(op)
		{
			case 0:
			case 1:
			case 2:
			case 3:
				{
					System.out.print("Enter the Quantity ===> ");count++;
					int qty=Integer.parseInt(sc.nextLine());
					lineobj.lineunderscore();
					menushow(op,qty);
					lineobj.lineunderscore();
					menubill(op,qty);
				}break;
			case 99:Itemdetail();break;
			case 22:TotBill();break;
			default:invalid();Fruits();break;
		}
		System.out.println("For Fruits\t\t\tpress f");
		System.out.println("For Stores\t\t\t\tpress s");
		System.out.println("For Bill\t\t\t\tpress b");
		System.out.print("Please Choose your option ===> ");
		String ch=sc.nextLine();
		lineobj.lineunderscore();
		switch(ch)
		{
		case "f":
		case "F":Fruits();break;
		case "s":
		case "S":Itemdetail();break;
		case "b":
		case "B":TotBill();break;
		default:invalid();Fruits();break;
		}
	}
	public void Vegetables()
	{
		int n=6;//No.of items in this Category
		String vegetable[]= {"Bitter Guard","Cucumber","Ladies Finger","Pumpkin","Potato","Tomato"};
		int vegcost[]= {50,45,60,40,60,20};
		for(int i=0;i<n;i++)
		{
			Items[i]=vegetable[i];
			Itemcost[i]=vegcost[i];
		}
		show(n);
		SBill();
		System.out.print("Please Choose an option ===> ");
		int op=Integer.parseInt(sc.nextLine());
		switch(op)
		{
			case 0:
			case 1:
			case 2:
			case 3:
				{
					System.out.print("Enter the Quantity ===> ");count++;
					int qty=Integer.parseInt(sc.nextLine());
					lineobj.lineunderscore();
					menushow(op,qty);
					lineobj.lineunderscore();
					menubill(op,qty);
				}break;
			case 99:Itemdetail();break;
			case 22:TotBill();break;
			default:invalid();Vegetables();break;
		}
		System.out.println("For Vegetables\t\t\tpress v");
		System.out.println("For Stores\t\t\t\tpress s");
		System.out.println("For Bill\t\t\t\tpress b");
		System.out.print("Please Choose your option ===> ");
		String ch=sc.nextLine();
		lineobj.lineunderscore();
		switch(ch)
		{
		case "v":
		case "V":Vegetables();break;
		case "s":
		case "S":Itemdetail();break;
		case "b":
		case "B":TotBill();break;
		default:invalid();Vegetables();break;
		}
	}
	public void show(int n)
	{
		lineobj.lineunderscore();
		System.out.println("S.No\t"+"Item\t\t\t\t1\t\t\t\tCost");
		lineobj.lineunderscore();
		for(int i=0;i<n;i++)
		{
			System.out.print(i+"\t"+Items[i]);
			System.out.print("\t\t\t\t1\t\t\t\t");
			System.out.println(Itemcost[i]);
		}
		System.out.println("99\tBack");
	}
	public void menushow(int op,int qty)
	{
		System.out.println(op+"\t"+Items[op]+"\t\t\t"+qty+"\t\t\t"+Itemcost[op]*qty);
	}
	public void contentshow(int n)
	{
		for(int i=0;i<n;i++)
		{
		System.out.println(Content[i]);
		}
	}
	public void menubill(int op,int qty)
	{
		Bill=Bill+count+"\t\t"+Items[op]+"\t\t\t"+qty+"\t\t\t\t"+Itemcost[op]*qty+"\n";
		Price=Price+Itemcost[op]*qty;
	}
	public void SBill()
	{
		if(count>0) 
			System.out.println("For Bill Enter 22");
	}
	public void customername() 
	{
		System.out.print("Customer Name: ");
		name=sc.nextLine();
		if(name.length()<1)
		{
			System.out.println("Enter a valid name ");
			customername();
		}
		customernum();
	}
	public void customernum()
	{
		System.out.print("Mobile: ");
		num=sc.nextLine();
		if(num.length()!=10)
		{
			System.out.println("Enter valid num");
			customernum();
		}
	}
	public void TotBill()
	{
		customername();
		System.out.println("\n\nCustomer name: "+name+"\t\t\t\t\t\t\tMobile: "+num);
		lineobj.linestar();
		System.out.println("ItemCode\tItem\t\t\tQuantity\t\t\tCost");
		lineobj.linestar();
		System.out.println(Bill);
		lineobj.linestar();
		System.out.println("Bill\t\t\t\t\t\t\t\t\t="+Price);
		int discount=Price/10;
		if(Price>10000)System.out.println("Discount\t\t\t\t\t\t\t\t  "+discount);
		System.out.println("Total Bill\t\t\t\t\t\t\t\t="+(Price-discount));
		lineobj.linestar();
		System.out.println("Thank You For Shopping-----------Visit Again");
		System.exit(0);
	}
	public void invalid()
	{
		lineobj.linestar();
		System.out.println("Please Enter a valid input");
		lineobj.linestar();
	}
}