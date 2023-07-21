//import java.lang.String;
public  class StringManipulator{
public String trimAndConcat(String str1,String str2){
    String mani1= str1.trim();
    String mani2= str2.trim();
    String mani3= mani1.concat(mani2);
    return mani3;
}
public int getIndexOrNull(String cadena, char letter){
    int indexOfLetter = cadena.indexOf(letter);
    return indexOfLetter;
}
public int getIndexOrNull(String mari1, String mari2){
    int indexMari2 = mari1.indexOf(mari2);
    return indexMari2;
}
public String concatSubString(String pan,int pom, int pon, String dulce ){
    String nuevoPan = pan.substring(pom,pon);
    String nuevoPompon = nuevoPan.concat(dulce);
    return nuevoPompon;
}

}