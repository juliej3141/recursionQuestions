import doodlepad.*;
//import com.phidget22.*;

public class RecursionTF {
	
	public static void main(String[] args) {
      Rectangle r1 = new Rectangle(60, 70, 400, 150);
      Rectangle r3 = new Rectangle(260, 220, 200, 150);
      Rectangle r4 = new Rectangle(60, 220, 200, 150);
      Text true1 = new Text("True", 150, 280);
      Text false1 = new Text("False", 70, 80);
      Text question1 = new Text("public long factorial(long a) {
        	if(a <= 1) {
				return 1;
        	}
        	return a * factorial(a-1);
		}

Is if(a <= 1) { return 1;} the base case? 
" , 300, 280);

    }
}
