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
        return String.format("%s. Благородство: %d. Честь: %d. Храбрость: %d.", super.toString(), nobility, honor, bravery);
    }

    public void griffindorCompareTo(Griffindor another) {
        if (this != null && another != null) {
            if (this.getSumScore() > another.getSumScore()) {
                System.out.printf("%s лучший Грифиндорец, чем %s.%n", this.getName(), another.getName());
            } else if (this.getSumScore() < another.getSumScore()) {
                System.out.printf("%s лучший Грифиндорец, чем %s.%n", another.getName(), this.getName());
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
