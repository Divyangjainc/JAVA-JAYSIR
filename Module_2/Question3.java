package Module_2;
//W.A.J.P to compare a given string to the specified character sequence. 
//Comparing topsint.com and topsint.com: true Comparing Topsint.com and 
//topsint.com: false 
public class Question3 {
public static void main(String[] args) {
    String str1 = "Tops Technologies", str2 = "Tops Technologies";
    CharSequence cs = "Tops Technologies";
     System.out.println("Comparing "+str1+" and "+cs+": " + str1.contentEquals(cs));
      System.out.println("Comparing "+str2+" and "+cs+": " + str2.contentEquals(cs));
          }
}
