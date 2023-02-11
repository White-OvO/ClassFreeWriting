package class_freeWriting;

public class week4Videos {

	
	
	public static void main(String[] args) {
/*
		
		why use a string buider instead of a string?

		A: a string cannot be changed. a string builder and create a string
*/
// create a new stringBuilder and append the character 0 through 9 to it seprated by dashes
	
		
		
		
StringBuilder sb = new StringBuilder();



/*
				 // it can go like this ...
			    sb.append(0);
				sb.append('-');
				sb.append(1);
				
				or...
*/
	

StringBuilder sb2 = new StringBuilder(); {

	for(int i = 0; i < 10; i++) {
		sb2.append(i);
	
		if (i != 9) { //this line is saying .. as long as it does not equal to nine increment 
		sb2.append(" - ");
	
	}
	}
System.out.println(sb2.toString());
	
	
	
	
	
}

}
}