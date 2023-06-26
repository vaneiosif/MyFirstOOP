public class Main {public class Main {
    public static void staticMethod1(){
        System.out.println("static method1 (void) is called and calls method2");
        System.out.println("method 2 return is "+staticMethod2());

    }
    public static int staticMethod2(){
        System.out.println("static method2 does something");
        return 1+2;
    }
    public static void main(String[] args) {
        //creeaza un obiect din clasa DemoClass
//        DemoClass obiect1 = new DemoClass();
//        DemoClass obiect2 = new DemoClass();
//        System.out.println(obiect1.x);
//        System.out.println(obiect2.x);
//        obiect1.x=6;
//        System.out.println(obiect1.x);
//        System.out.println(obiect2.x);
//        obiect1.afiseazaText();
//        obiect2.text = "something else";
//        System.out.println(obiect2.text);
        //DemoClass.afiseazaTextStatic();

        //exemple clasa Human
        Human cristina = new Human("test@test.com","test");//instantiem obiect din clasa Human
        //cristina.email="cristina@test.com";//atribuim valori
        cristina.verify();
        cristina.sendEmail();
        System.out.println(cristina.getEmail());
        Human jon = new Human("jon@test.com","test");//adaugam un obiect nou
        //jon.address="Test Street 123";
        System.out.println(jon.getAddress());
        System.out.println(jon.getEmail());
        cristina.planet = "Earth";
        jon.planet = "Mars";
        System.out.println("Cristina's planet is "+cristina.planet+
                " Jon's planet is "+jon.planet);
        staticMethod1();
        //staticMethod2();
        //System.out.println(staticMethod2());
        //System.out.println(staticMethod2());


        //exemple clasa Book
        //se apeleaza constructorul cu 1 argument
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setAuthor("Mihai Eminescu");
        book1.setTitle("Poezii");
        //se apeleaza constructorul cu 3 argumente
        Book book3 = new Book(150.00,"Marile sperante","Mark Twain");
        //book2.author="Ion Creanga";
        //book2.title="Amintiri din copilarie";
        System.out.println(book1.afiseaza());
        System.out.println(book2.afiseaza());
        System.out.println(book2.afiseaza());
        System.out.println(book3.afiseaza());
        System.out.println(book1.getPrice());
        System.out.println(book3.getTitle());

        //exemple clasa Sportiv-Intotator
        Inotator inotator1 = new Inotator("Popescu","RO");
        Maratonist maratonist1 = new Maratonist("Ionescu","RO");
        inotator1.seAntreneaza();
        inotator1.seOdihneste();
        maratonist1.seOdihneste();

        Fotbalist fotbalist1 = new Fotbalist("Mbappe","FR");
        fotbalist1.seOdihneste();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Pisica","verde",false);
        animal1.mananca();
        animal1.doarme();
        System.out.println(animal1.method1());
        animal2.mananca();
        animal2.doarme();
        System.out.println(animal2.method1());


        Animal animal3 = new Animal();
        Animal animal4 = new Animal();
        Animal animal5 = new Animal();
        animal3.nume = "caine";
        animal4.nume = "papagal";
        animal5.nume = "caracatita";
        animal3.setNrPicioare(4);
        animal4.setNrPicioare(2);
        animal5.setNrPicioare(8);
        animal3.picioare();
        animal4.picioare();
        animal5.picioare();

        Patruped animal6 = new Patruped();
        animal6.nume = "Azorel";

    }
    }


    }