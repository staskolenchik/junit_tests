package task17.task1710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str;
            while (!("выход".equals(str = reader.readLine()))) {
                if (str.charAt(1) == 'c') { // -c.... input
                    String[] sArray = str.split(" ");
                    SimpleDateFormat sDF = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = sDF.parse(sArray[3]);
                    if ("м".equals(sArray[2])) {
                        allPeople.add(Person.createMale(sArray[1], date));
                        System.out.println(allPeople.size() - 1);
                    } else if ("ж".equals(sArray[2])) {
                        allPeople.add(Person.createFemale(sArray[1], date));
                        System.out.println(allPeople.size() - 1);
                    } else {
                        throw new Exception();
                    }
                } else if (str.charAt(1) == 'u') {
                    String[] sArray = str.split(" ");
                    SimpleDateFormat sDF = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                    Date date = sDF.parse(sArray[4]);
                    if ("м".equals(sArray[3])) {
                        allPeople.set(Integer.parseInt(sArray[1]), Person.createMale(sArray[2], date));
                    } else if ("ж".equals(sArray[3])) {
                        allPeople.set(Integer.parseInt(sArray[1]), Person.createMale(sArray[2], date));
                    } else {
                        throw new Exception();
                    }
                } else if (str.charAt(1) == 'd') {
                    String[] sArray = str.split(" ");
                    allPeople.get(Integer.parseInt(sArray[1])).setName(null);
                    allPeople.get(Integer.parseInt(sArray[1])).setSex(null);
                    allPeople.get(Integer.parseInt(sArray[1])).setBirthDate(null);
                } else if (str.charAt(1) == 'i') {
                    String[] sArray = str.split(" ");
                    SimpleDateFormat sDF = new SimpleDateFormat("dd-MM-yyyy");
                    String date = sDF.format(allPeople.get(Integer.parseInt(sArray[1])).getBirthDate());
                    if (allPeople.get(Integer.parseInt(sArray[1])).getSex() == Sex.MALE) {
                        System.out.println(allPeople.get(Integer.parseInt(sArray[1])).getName() + " " +
                                "м" + " " + date);
                    } else if (allPeople.get(Integer.parseInt(sArray[1])).getSex() == Sex.FEMALE) {
                        System.out.println(allPeople.get(Integer.parseInt(sArray[1])).getName() + " " +
                                "ж" + " " + date);
                    } else {
                        throw new Exception();
                    }
                }
            }
        }catch(Exception e){
                System.out.println("Input correct data!");
        }

    }
}
