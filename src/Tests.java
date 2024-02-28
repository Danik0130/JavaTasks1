public class Tests {
    // 1.1.1 Точка координат
    public static void test1_1_1()

    {
        Point point1 = new Point(3.5, 7.2);
        Point point2 = new Point(-1.0, 0.0);
        Point point3 = new Point(10.5, -4.8);
        System.out.println("Точки координат:");
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
    }

    // 1.1.2 Человек
    public static void test1_1_2() {
        Person person1 = new Person("Клеопатра", 152);
        Person person2 = new Person("Пушкин", 167);
        Person person3 = new Person("Владимир", 189);
        System.out.println("\nЛюди:");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }

    // 1.1.3 Имена
    public static void test1_1_3() {
        Name name1 = new Name("Клеопатра", null, null);
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Владимир", "Маяковский", null);
        System.out.println("\nИмена:");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }


    // 1.1.4 Время
    public static void test1_1_4() {
        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);
        System.out.println("\nВремя:");
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }

    // 1.1.5 Дом
    public static void test1_1_5() {
        House house1 = new House(1);
        House house2 = new House(5);
        House house3 = new House(23);
        System.out.println("\nДома:");
        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);
    }

    //Задача 1.2.1 Прямая
    public static void test1_2_1() {
        Point point1 = new Point(1, 3);
        Point point2 = new Point(23, 8);
        Line line1 = new Line(point1, point2);
        System.out.println(line1 +  "\n");

        Point point3 = new Point(5, 10);
        Point point4 = new Point(25, 10);
        Line line2 = new Line(point3, point4);
        System.out.println(line2);

        Line line3 = new Line(point1, point4);
        System.out.println(line3 +  "\n");
    }

    //Задача 1.2.2 Человек с именем
    public static void test1_2_2() {
        Name name1 = new Name("Клеопатра", null, null);
        HumanWithName human1 = new HumanWithName(name1, 152);
        System.out.println(human1);

        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        HumanWithName human2 = new HumanWithName(name2, 167);
        System.out.println(human2);

        Name name3 = new Name("Маяковский", "Владимир", null);
        HumanWithName human3 = new HumanWithName(name3, 189);
        System.out.println(human3 +  "\n");
    }

    //Задача 1.2.3 Человек с родителем
    public static void test1_2_3() {
        HumanWithParent ivan = new HumanWithParent(new Name("Иван", "Чудов", null), 0, null);
        HumanWithParent petr = new HumanWithParent(new Name("Петр", "Чудов", null), 0, ivan);
        HumanWithParent boris = new HumanWithParent(new Name(null, "Борис", null), 0, petr);

        System.out.println(ivan);
        System.out.println(petr);
        System.out.println(boris +  "\n");
    }

    //Задача 1.2.4 Сотрудники и отделы
    public static void test1_2_4() {
        Employee kozlov = new Employee("Козлов", new Department("IT", kozlov));
        Employee petrov = new Employee("Петров", new Department("IT", kozlov));
        Employee sidorov = new Employee("Сидоров", new Department("IT", kozlov));

        Department itDepartment = new Department("IT", kozlov);

        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov +  "\n");
    }


}
