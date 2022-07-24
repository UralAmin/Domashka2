public class Domashka_baza {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "a ");

        }

        System.out.println();

        int ageChildren = 3;
        if (ageChildren >= 1 && ageChildren <= 6) {
            System.out.println("пойдет в детский сад");
        } else if (ageChildren <= 11) {
            System.out.println("пойдет в младшую школу");
        } else if (ageChildren <= 17) {
            System.out.println("пойдет в среднюю школу");
        } else {
            System.out.println("пойдет в университет");
        }



        boolean chicken = true;
        boolean vegetables = false;
        boolean sauce = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;

        boolean salad1 = chicken && vegetables && sauce && toast;
        boolean salad2 = vegetables && (sausage || chicken) && eggs;
        boolean salad3 = vegetables;

        if (salad1) {
            System.out.println("Приготовили цезарь");
        } else if (salad2) {
            System.out.println("Приготовилии оливье");
        } else if (salad3) {
            System.out.println("Приготовили овощной");
        } else System.out.println("У меня ничего нет");

    }
}
