// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //do while loop__-----__-----__-----__-عدد اولي----__-----__-----__-----
          int i =1;
           do{
            if(i !=1
                    && i%2 !=0
                    && i%3 !=0
                    && i%5 !=0
                    && i%7 !=0
                    || i==2
                    || i==3
                    || i==5
                    || i==7){
                System.out.println(i);}
               i++;
          }while(i<=100);
    }
}