package task17.task1722;

/* 
Посчитаем
*/

public class Solution {

    public static Integer count = 0; //1
    public static int[] values = new int[105]; //2

    static {
        for (int i = 0; i < 105; i++) {
            values[i] = 0; //3 all values = 0
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter(); //create thread
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        counter1.start();// thread1 start
        counter2.start();
        counter3.start();
        counter4.start();

        counter1.join();
        counter2.join();
        counter3.join();
        counter4.join();

        for (int i = 1; i <= values.length; i++) {
            if (values[i] != 1) {
                System.out.println("Массив values содержит элементы неравные 1");
                break;
            }
        }
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

    }

    public static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static class Counter extends Thread {
        @Override
        public void run() {
            do {
                synchronized (values) {
                    incrementCount(); //count++
                    values[getCount()]++;
                }

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
            } while (getCount() < 100);
        }
    }
}
