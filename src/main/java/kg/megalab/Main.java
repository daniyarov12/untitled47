package kg.megalab;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String str="Test text for Java course in Megalab";
        FileWriter fw=new FileWriter("megalab.docx");
        for (int i=0;i< str.length();i++)
            fw.write(str.charAt(i));
        System.out.println(" Writing successful" );
        fw.close();
        int ch;
        FileReader fr=null;
        try{
            fr=new FileReader("output.txt");
        }catch (FileNotFoundException fe) {
            System.out.println(" File not found");
        }
        while ((ch= fr.read())!=-1);
        System.out.println((char)ch );
        fr.close();
    }
}