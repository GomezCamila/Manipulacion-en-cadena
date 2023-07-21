
public class StringManipulatorTest{
public static void main(String[] args){
    StringManipulator almendra = new StringManipulator();
    String maniMani = almendra.trimAndConcat(" Gracias     ", "  Marta  ");
    System.out.println(maniMani);


char letter ='n';
int a = almendra.getIndexOrNull("coding", letter);
int b = almendra.getIndexOrNull("Hola Mundo",letter);
int c = almendra.getIndexOrNull("Mirar", letter);
System.out.println(a);
System.out.println(b);
System.out.println(c);


String word = "Hola";
String subString = "la";
String notSubString = "mundo";
int popi1 = almendra.getIndexOrNull( word, subString);
int popi2 = almendra.getIndexOrNull(word, notSubString);
System.out.println(popi1);
System.out.println(popi2);

String tutuca = "No Mabel, eso es otra cosa";
String arroz = almendra.concatSubString(tutuca, 3, 9, "Si Mabel, si es");
System.out.println(tutuca);
System.out.println(arroz);
}
}
