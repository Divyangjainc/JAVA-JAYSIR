package mmm;

public class POO7_String {
	public static void main(String[] args) {
		char name[] = { 'J', 'A', 'V', 'A' };
		System.out.println(name);
		String name1 = "JAVA";
		System.out.println(name1);
		String s1 = "java";
		String s2 = "JAVA";
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("va"));
		String s3 = "     ";
		System.out.println(s3.isBlank());
		System.out.println(s3.isEmpty());
		String s5 = "		tops tech			";
		System.out.println(s5);
		System.out.println(s5.trim());
	}
}