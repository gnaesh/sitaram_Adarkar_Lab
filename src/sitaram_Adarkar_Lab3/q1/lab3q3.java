package sitaram_Adarkar_Lab3.q1;
public class lab3q3 
{
  public static void main(String[] args) 
  {StringBuffer str=new StringBuffer("KING");
  
	System.out.println(str+" changed to "+lab3q3.alterString(str));
}
  public static StringBuffer alterString(StringBuffer str)
  {
	  return str.replace(0,1, "S");
  }
}