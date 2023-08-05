// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String [] words={"Hello","in","our","new","world"};
        String space=" ";
        String star="*";
        String row="";
        String FirstRow="";
        int maxLength =words[0].length();
        for (int i = 0;i<words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
            }
        }
        FirstRow=star.repeat(maxLength +2);
        System.out.println(FirstRow);
        for(int i=0; i<words.length; i++){
            row="*"+words[i];
            row=row+space.repeat(maxLength - words[i].length());
            row=row +"*";
            System.out.println(row);
        }
        System.out.println(FirstRow);
    }
  
}