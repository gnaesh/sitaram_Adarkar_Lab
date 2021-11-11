package sitaram_Adarkar_Lab5;

import sitaram_Adarkar_Lab5.FinalException;
import sitaram_Adarkar_Lab5.NameWrongException;

public class FinalException {
public static void valid(String name) {
	if(name=="ganesh") {
		throw new NameWrongException("Correct username ");
	}
	else {
	System.out.println("wrong");
}
}
	public static void main(String[] args) {
		try {
			FinalException.valid("ganesh");
		}catch(NameWrongException e){
			System.out.println(e.getMessage());
		}
}
}