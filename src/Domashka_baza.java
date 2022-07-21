public class Domashka_baza {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            System.out.print(i+"a ");

        }

        System.out.println();

        int ageChildren = 3;
        if (ageChildren >=1  && ageChildren <=6) {
            System.out.println("пойдет в детский сад");}
            else if (ageChildren <=11) {
            System.out.println("пойдет в младшую школу");}
            else if (ageChildren <=17) {
            System.out.println("пойдет в среднюю школу");}
            else  { System.out.println("пойдет в университет");
        }


            


    }
}