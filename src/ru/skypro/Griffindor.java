package ru.skypro;

public class Griffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int magicPower, int transgressionDistance,
                      int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        setNobility(nobility);
        setHonor(honor);
        setBravery(bravery);
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (isQualityLegal(nobility)) {
            this.nobility = nobility;
        }
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (isQualityLegal(honor)) {
            this.honor = honor;
        }
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (isQualityLegal(bravery)) {
            this.bravery = bravery;
        }
    }

    @Override
    public String toString() {
        return String.format("Благородство: %d. Честь: %d. Храбрость: %d.", nobility, honor, bravery);
    }

    public static void printBestStudent(Griffindor that, Griffindor another) {
        if (that != null && another != null) {
            if (that.getSumScore() > another.getSumScore()) {
                System.out.printf("%s лучший Грифиндорец, чем %s.%n", that.getName(), another.getName());
            } else if (that.getSumScore() < another.getSumScore()) {
                System.out.printf("%s лучший Грифиндорец, чем %s.%n", another.getName(), that.getName());
            } else {
                System.out.println("Студенты по способностям равны");
            }
        } else {
            System.out.println("Один из студентов не инициализирован!!");
        }
    }

    private int getSumScore() {
        return getNobility() + getHonor() + getBravery();
    }
}
