

import java.util.*;

public class Main{

      
		

	    

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Random rd = new Random();//will use while assigning element for PC.
	    String ip = "";
	   String numbers = "012";
	   String st = null;// This Variable will have response of System

	   int user = 0;//This have Score of the User.
	   int pc = 0;//This will have Score of the PC/System.
	   int i = 0;//This will define number of rounds to be made for a Match.
	   while(i<10) {
		   System.out.println("Type your Choise below amoung STONE/SCISSOR and PAPER");
		   ip = sc.nextLine();
		

		   ip = ip.toUpperCase();//This will input from user to UpperCase.

		   boolean check = false;
	   int pcip = rd.nextInt(numbers.length());//Choice for the System will be asigned using this Int Varibale 
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
	    	   System.out.println("An error has occured. contact developer");
	    		   st = "Nothing";
	   }

        //Below have test cases. On basis of this Points will be given to user or system.
	   if(ip.equals("PAPER") && st.equals("STONE")) {
		   check = true;
		   if(check) {
			   System.out.println("User won " + ip  + " PC having " + st);
		   }else {
			   System.out.println("PC won with " + st);
		   }
	   }
	   if(ip.equals("PAPER") && st.equals("SCISSOR")) {
		   check = false;
		   if(check) {
			   System.out.println("User won " + ip + " PC having " + st);
		   }else {
			   System.out.println("PC won with " + st);
		   }
	   }
	   if(ip.equals("STONE") && st.equals("PAPER")) {
		   check = false;
		   if(check) {
			   System.out.println("User won " + ip + " PC having " + st);
		   }else {
			   System.out.println("PC won with " + st);
		   }
	   }if(ip.equals("STONE") && st.equals("SCISSOR")) {
		   check = true;
		   if(check) {
			   System.out.println("User won " + ip + " PC having " + st);
		   }else {
			   System.out.println("PC won with " + st);
		   }
	   }if(ip.equals("SCISSOR") && st.equals("STONE")) {
		   check = false;
		   if(check) {
			   System.out.println("User won " + ip + " PC having " + st);
		   }else {
			   System.out.println("PC won with " + st);
		   }
	   }if(ip.equals("SCISSOR") && st.equals("PAPER")) {
		   check = true;
		   if(check) {
			   System.out.println("User won " + ip + " PC having " + st);
		   }else {
			   System.out.println("PC won with " + st);
		   }
	   }
	   if(!(ip.equals("SCISSOR") && st.equals("PAPER")) && !(ip.equals("SCISSOR") && st.equals("STONE")) && !(ip.equals("PAPER") && st.equals("STONE")) && !(ip.equals("PAPER") && st.equals("SCISSOR")) && !(ip.equals("STONE") && st.equals("PAPER")) && !(ip.equals("STONE") && st.equals("SCISSOR")) && !(ip.equals("SCISSOR") && st.equals("STONE"))  && !(ip.equals(st))){
        System.out.println("Invalid Choice try again");	       
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
			   System.out.println("Match draw\n PC with " + pc + " User with " + user);
		   }else {
			   System.out.println("User won with points " + user);
		   }
	   }
	
	}
}
