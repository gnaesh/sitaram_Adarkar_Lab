package sitaram_Adarkar_Lab3.q1;

public class lab3q2 
{

	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("EARTH");
		System.out.println(str + "|" + lab3q2.GetImage(str));
	}

	public static StringBuffer GetImage(StringBuffer str)
	{
		return str.reverse();
	}

}
