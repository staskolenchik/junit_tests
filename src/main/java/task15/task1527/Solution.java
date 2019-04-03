package task15.task1527;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            URL url = new URL(reader.readLine());
            List<String> list = new ArrayList<>();
            String[] sArray = url.getQuery().split("&");
            for (String str :
                    sArray) {
                String[] sArray2 = str.split("=");
                alert(sArray2[0]);
                if ("obj".equals(sArray2[0])) {
                    try {
                        list.add(sArray2[1]);
                    } catch (Exception e) {

                    }
                }
            }
            for (String strList :
                    list) {
                if (!("".equals(strList))) {
                    try {
                        double numDouble = Double.parseDouble(strList);
                        alert(numDouble);
                    } catch (Exception e) {
                        alert(strList);
                    }
                }
            }

        } catch (Exception e) {
            System.err.println(e);
        }


    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
