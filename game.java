
import java.awt.Desktop;
import java.net.URI;
import java.util.*;

public class game{

      
		

	    

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Random rd = new Random();
	    String ip = "";
	   String numbers = "012";
	   String st = null;

	   int user = 0;
	   int pc = 0;
	   int i = 0;
	   while(i<10) {
		   System.out.println("IP");
		   ip = sc.nextLine();
		

		   ip = ip.toUpperCase();

		   boolean check = false;
	   int pcip = rd.nextInt(numbers.length());
	   switch(pcip){
	       case 0:
	           st = "STONE";
	           break;
	       case 1:
	    	   st = "PAPER";
	    	   break;
	       case 2 :
	    	   st = "SCISSOR";
	    	   break;
	    	   default:
	    		   st = "Nothing";
	   }


	   if(ip.equals("PAPER") && st.equals("STONE")) {
		   check = true;
		   if(check) {
			   System.out.println("User won " + ip  + " PC having " + st);
		   }else {
			   System.out.println("PC won " + st);
		   }
	   }
	   if(ip.equals("PAPER") && st.equals("SCISSOR")) {
		   check = false;
		   if(check) {
			   System.out.println("User won " + ip + " PC having " + st);
		   }else {
			   System.out.println("PC won" + st);
		   }
	   }
	   if(ip.equals("STONE") && st.equals("PAPER")) {
		   check = false;
		   if(check) {
			   System.out.println("User won " + ip + " PC having " + st);
		   }else {
			   System.out.println("PC won" + st);
		   }
	   }if(ip.equals("STONE") && st.equals("SCISSOR")) {
		   check = true;
		   if(check) {
			   System.out.println("User won " + ip + " PC having " + st);
		   }else {
			   System.out.println("PC won " + st);
		   }
	   }if(ip.equals("SCISSOR") && st.equals("STONE")) {
		   check = false;
		   if(check) {
			   System.out.println("User won " + ip + " PC having " + st);
		   }else {
			   System.out.println("PC won " + st);
		   }
	   }if(ip.equals("SCISSOR") && st.equals("PAPER")) {
		   check = true;
		   if(check) {
			   System.out.println("User won " + ip + " PC having " + st);
		   }else {
			   System.out.println("PC won " + st);
		   }
	   }
	   if(!ip.equals(st)) {
		   i++;
		   if(check) {
			   user++;
		   }else {
			   pc++;
		   }
	   }else{
System.out.println("User and PC having same element");
}
	   
	   
	   
	   
	  
	   }
System.out.println();
	   if(user < pc) {
		   System.out.println("PC won with points " + pc);
	   }else {
		   if(user == pc) {
			   System.out.println("Match draw");
		   }else {
			   System.out.println("User won with points " + user);
		   }
	   }
	
	}
}
