package ru.skypro;

public class Hogwarts {
    private final String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        setMagicPower(magicPower);
        setTransgressionDistance(transgressionDistance);
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        if (isQualityLegal(magicPower)) {
            this.magicPower = magicPower;
        }
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        if (isQualityLegal(transgressionDistance)) {
            this.transgressionDistance = transgressionDistance;
        }
    }

    protected boolean isQualityLegal(int quality) {
        if (quality >= 0 && quality < 100) {
            return true;
        } else {
            throw new IllegalArgumentException("Качества студента должны быть от 0 до 100");
        }
    }

    public static void printStudentInfo(Hogwarts student) {
        System.out.printf("%s -> Сила магии: %d. Трансгрессивность: %d. %s\n",
                student.getName(), student.getMagicPower(), student.getTransgressionDistance(), student);
    }

    private int getSumScore() {
        return getMagicPower() + getTransgressionDistance();
    }

    public static void printBestStudent(Hogwarts that, Hogwarts another) {
        if (that != null && another != null) {
            if (that.getSumScore() > another.getSumScore()) {
                System.out.printf("%s обладает бОльшеймощностью магии, чем %s.%n", that.getName(), another.getName());
            } else if (that.getSumScore() < another.getSumScore()) {
                System.out.printf("%s обладает бОльшеймощностью магии, чем %s.%n", another.getName(), that.getName());
            } else {
                System.out.println("У студентов одинаковая мощность магии");
            }
        } else {
            System.out.println("Один из студентов не инициализирован!!");
        }
    }
}
