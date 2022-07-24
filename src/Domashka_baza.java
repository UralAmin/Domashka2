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




        //Обьявил новый объект Car1
        Car car1 = new Car("Volkswagen", 160000, 2008);

        String marka = car1.getMarka();
        int probeg = car1.getProbeg();
        int god = car1.getGod();
        System.out.println("марка: "+marka+". Пробег: "+probeg+". Год: "+god);


        //сеттер и геттер для марки авто
        car1.SetMarka("Toyota");
        marka = car1.getMarka();
        System.out.println(marka);

        //сеттер и геттер для пробега
        car1.setProbeg(165000);
        probeg = car1.getProbeg();
        System.out.println(probeg);


        //сеттер и геттер для года авто
        car1.setGod(2009);
        god = car1.getGod();
        System.out.println(god);


        //Обьявил новый обьект Car2
        Car car2 = new Car("Audi", 34000, 2012);
        System.out.println("марка: "+marka+". Пробег: "+probeg+". Год: "+god);
        car2.SetMarka("Mazda");
        marka = car2.getMarka();
        System.out.println(marka);

        probeg = car2.getProbeg();
        System.out.println(probeg);

        System.out.println(Car.count);


        //Обьявил новый обьект kv
        kvartira kv = new kvartira("Ufa", "Lenina", 10);

        String gorod = kv.getGorod();
        String street = kv.getStreet();
        int dom = kv.getDom();

        System.out.println("Город: "+ gorod +". Улица: "+ street +". Дом: "+ dom);

        kv.setGorod("Moscow");
        gorod = kv.getGorod();
        System.out.println(gorod);

        kv.setStreet("Marksa");
        street = kv.getStreet();
        System.out.println(street);

        System.out.println(kv.count);


    }
}
