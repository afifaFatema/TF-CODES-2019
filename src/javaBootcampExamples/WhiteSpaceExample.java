package javaBootcampExamples;

public class WhiteSpaceExample {

	public static void main(String[] args) 
    { 
        String str = "      Afifa     Fatema    Learning   Java       "; 
       
        // Call the replaceAll() method 
        str = str.replaceAll("\\s", ""); 
       
        System.out.println(str); 
    } 

}
