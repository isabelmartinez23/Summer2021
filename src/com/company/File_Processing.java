package com.company;
import java.io.*;
import java.util.*;
public class File_Processing {

    public static void main(String[] args) throws FileNotFoundException{
        File file = new File ("/Users/isabel/IdeaProjects/Summer2021/src/com/company/weather.txt");
        Scanner scan = new Scanner(file);
        double temp1 = 0;
        double temp2 = 0;
        if (scan.hasNextDouble()){
            temp1 = scan.nextDouble();
        }
        boolean flag = false;
        while (scan.hasNextLine()){
            if (scan.hasNextDouble()) {
                temp2 = scan.nextDouble();
                flag = true;
            }
            else{
                String trash = scan.next();
                flag = false;
            }
            System.out.printf("The difference between %5.2f  and  %5.2f   is   %5.2f \n", temp1, temp2, (temp2-temp1));
            temp1=temp2;
        }

    }
}
