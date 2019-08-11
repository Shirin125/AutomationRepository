package stringClass;

public class String {

	public static void main(java.lang.String[] args) {
		java.lang.String name="shirin";
		java.lang.String name2="Shirin";
		
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(name2));
		
		java.lang.String str="shirin,firoj,ammu";
	java.lang.String[] strnames=	str.split(",");
	System.out.println(strnames.length);
	System.out.println(str.replace(",", "|"));
	System.out.println(str.substring(0,5));
	
	
	}

}
