package inheritanceLabs;

class Bike{
	private String Brand;
	private int Mileage;
	Bike(String Brand,int Mileage)
	{
		this.Brand=Brand;
		this.Mileage=Mileage;
	}
	String getBrand()
	{return Brand;}
int getMileage() {
	return Mileage;
}

}

class Book{
	private String name;
	private String author;
	Book(String name,String author){
		this.name=name;
		this.author=author;
		}
	String getname()
	{return name;
	
	}
	String getauthor() {
		return author;
	}
}

class Heart{
	int weight;
	int bpm;
	Heart(int weight,int bpm){
		this.weight=weight;
		this.bpm=bpm;
	}
	int getweight()
	{return weight;
}
	int getbpm() {
		return bpm;
	}
	
class Brain{
	int weight;
String color;
Brain(int weight,String color)
{this.weight=weight;
this.color=color;
}
int getweight() {
	return weight;
}
String getcolor(){
	return color;
}

}
}
public class HasA {
public static void main(String args[]) {
	
}
}
