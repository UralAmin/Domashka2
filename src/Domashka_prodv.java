public class Domashka_prodv {
    public static void main(String[] args) {


        double increment = 0.01123;
        double result = 0;
        double million = 1_000_000;
        double i = 0;
        if (increment > 0) {
            while (i <= million) {
                i = i + increment;
                result++;
            }
            System.out.println(result);
        }


        //вторая задача

        int array[] = {1,1,1,1,1,1,1,1};

        for (int l = 0; l < array.length; l++) {
            int a = l % 2;
            if (a == 1) {
            array[l] = 0;
            System.out.print(array[l]);
        } else {
                System.out.print(array[l]);}
        }

        System.out.println();



        //Часть 3 задачи

        boolean hasFuel = false;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = false;


        boolean a = hasFuel;
        boolean b = hasElectricsProblem;
        boolean c = hasMotorProblem;
        boolean d = hasTransmissionProblem;
        boolean e = hasWheelsProblem;
        double sum = 0;


        if ((a) && (!b&&!c&&!d&&!e)) {
            System.out.println("Такого быть не может");
        } else if ((!a) && (!b&&!c&&!d&&!e)) { sum = 1000; System.out.println(sum);
        } else if (!a && !b && c && !d && !e) { sum = 10000;  System.out.println(sum);
        } else if (!a && b && !c && !d && !e) { sum = 5000;  System.out.println(sum);
        } else if (!a && !b && !c && d && !e) { sum = 4000;  System.out.println(sum);
        } else if (!a && !b && !c && d && e) { sum = 2000;  System.out.println(sum);
        }


        






    }



}
