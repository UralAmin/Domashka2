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











    }



}
