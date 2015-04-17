package Main;

import java.util.Scanner;

/**
 * Created by Artur on 17.04.2015.
 */
public class main {

    public static void main(String[] args){
        String str_data;
        int result = 0, mult = 0;
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        str_data = scan.next();
        if(!str_data.isEmpty()){
            for(int i = 0; i < str_data.length(); i++ ){
                switch (str_data.charAt(i)){
                    case '1': {
                        mult = 1;
                        break;
                    }
                    case '2': {
                        mult = 2;
                        break;
                    }
                    case '3': {
                        mult = 3;
                        break;
                    }
                    case '4': {
                        mult = 4;
                        break;
                    }
                    case '5': {
                        mult = 5;
                        break;
                    }
                    case '6': {
                        mult = 6;
                        break;
                    }
                    case '7': {
                        mult = 7;
                        break;
                    }
                    case '8': {
                        mult = 8;
                        break;
                    }
                    case '9': {
                        mult = 9;
                        break;
                    }
                    case '0': {
                        mult = 0;
                        break;
                    }
                    default: {
                        System.out.println("Неверный ввод");
                        System.exit(0);
                    }

                }
                result = result + (int)(mult*Math.pow(10,str_data.length() - i-1));
            }
            System.out.println(result);
        }
    }



}
