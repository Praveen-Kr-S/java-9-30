package Learn_Strings;

public class LearnStrings {

	public static void main(String[] args) {
		
//		String Literal
		String s1 = "Pradeepan";
		String s2 = "PradeepanRSS";
		String s3 = new String("PRADEEPAN");
		String s4 = new String("Pradeepan");
		System.out.println(s1+"\n"+s2);
		System.out.println(s1 == s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s3));
		/*
		 * String Indexing
		 * 
		 * Reverse indexing= -4 -3 -2 -1
		 *				 a = "J  A  V  A"
		 * forward indexing=  0  1  2  3
		 * length          =  1  2  3  4
		 */
		
		//Build-in-functions in string
		/*
		 * variable.build-in-functions
		 */
		System.out.println(s1.charAt(3));
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s4.concat(" R"));
		System.out.println(s1.contains("z"));
		System.out.println(s1.endsWith("an"));
		System.out.println(s1.startsWith("P"));
		System.out.println(s1.indexOf("p"));
		System.out.println(s1.hashCode());
		System.out.println("java".isBlank());
		System.out.println("python".equalsIgnoreCase("PYTHON"));
		System.out.println("Subash".lastIndexOf("a"));
		System.out.println(" ".isEmpty());
		System.out.println("".isBlank());
		String name = "Praveen";
		System.out.println(name.replace('P', 'p'));
		System.out.println(name);
		System.out.println("      Praveen Kumar   ".strip());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
	}

}
