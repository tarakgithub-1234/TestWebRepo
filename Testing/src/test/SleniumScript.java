package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleniumScript {
	
	public static void main (String args[]) {
		interest i=(name)->{
			System.out.println("my method is implemented by " +name);
		};
		shape s=(a,b)->{return a+b;
		};
		shape s2=(a,b)->(a+b);
		System.out.println("sum is "+s.shaprect(10, 20));
		System.out.println("sum is "+s2.shaprect(10, 20));
		
		i.intertestbank("tarak");
		i.intertestbank("sujit");
		
		List l1=new ArrayList<String>();
		l1.add("apple");
		l1.add("orang0");
		l1.forEach(n->System.out.println(n));
				
	}
}
	
interface interest
{
	public void intertestbank(String name);
}
interface shape
{
	public int shaprect(int a, int b);
}



