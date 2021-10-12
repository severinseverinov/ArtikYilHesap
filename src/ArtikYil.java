import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        boolean four= false;
        Scanner input=new Scanner(System.in);

        System.out.print("Yıl giriniz : ");
        year=input.nextInt();

        four=(year%4==0)?true:false;
        if(year%100==0){if(year%400==0){four=true;}else{four=false;}}

        if(four){
            System.out.println(year+" artık bir yıldır!");
        }else{
            System.out.println(year+" artık bir yıl değildir!");
        }

    }
}
