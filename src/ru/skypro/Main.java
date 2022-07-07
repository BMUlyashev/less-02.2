package ru.skypro;


import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Griffindor harryPotter = new Griffindor("Гарри Поттер", new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100));
        Griffindor hermionaGranger = new Griffindor("Гермиона Грейнджер", new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100));
        Griffindor ronWisli = new Griffindor("Рон Уизли", new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100));

        Puffenduy zahariyaSmit = new Puffenduy("Захария Смит", new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100));
        Puffenduy sedrikDiggory = new Puffenduy("Седрик Диггори", new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100));
        Puffenduy jastinFinchFletchi = new Puffenduy("Джастин Финч-Флетчли", new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100));

        Kogtevran jowChang = new Kogtevran("Чжоу Чанг", new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100));
        Kogtevran padmaPatil = new Kogtevran("Падма Патил", new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100));
        Kogtevran markusBelbi = new Kogtevran("Маркус Белби", new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100));

        Slizerin drakoMalfoy = new Slizerin("Драко Малфой", new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100));
        Slizerin grehemMontegu = new Slizerin("Грэхэм Монтегю", new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100));
        Slizerin gregoriGoil = new Slizerin("Грегори Гойл", new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100));

        Hogwarts.printStudentInfo(harryPotter);
        Hogwarts.printStudentInfo(hermionaGranger);
        Hogwarts.printStudentInfo(zahariyaSmit);
        Hogwarts.printStudentInfo(jowChang);
        Hogwarts.printStudentInfo(drakoMalfoy);

        Slizerin.printBestStudent(drakoMalfoy, gregoriGoil);
        Griffindor.printBestStudent(harryPotter, hermionaGranger);

        Hogwarts.printBestStudent(drakoMalfoy, harryPotter);

    }

}
