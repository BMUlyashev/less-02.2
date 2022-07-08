package ru.skypro;

public class Kogtevran extends Hogwarts {
    private int smart;
    private int wisdom;
    private int wit;
    private int creation;

    public Kogtevran(String name, int magicPower, int transgressionDistance,
                     int smart, int wisdom, int wit, int creation) {
        super(name, magicPower, transgressionDistance);
        setSmart(smart);
        setWisdom(wisdom);
        setWit(wit);
        setCreation(creation);
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        if (isQualityLegal(smart)) {
            this.smart = smart;
        }
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        if (isQualityLegal(wisdom)) {
            this.wisdom = wisdom;
        }
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        if (isQualityLegal(wit)) {
            this.wit = wit;
        }
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        if (isQualityLegal(creation)) {
            this.creation = creation;
        }
    }

    @Override
    public String toString() {
        return String.format("Ум: %d. Мудрость: %d. Остроумие: %d. Творчество: %d",
                getSmart(), getWisdom(), getWit(), getCreation());
    }

    public static void printBestStudent(Kogtevran that, Kogtevran another) {
        if (that != null && another != null) {
            if (that.getSumScore() > another.getSumScore()) {
                System.out.printf("%s лучший Когтевранец, чем %s.%n", that.getName(), another.getName());
            } else if (that.getSumScore() < another.getSumScore()) {
                System.out.printf("%s лучший Когтевранец, чем %s.%n", another.getName(), that.getName());
            } else {
                System.out.println("Студенты по способностям равны");
            }
        } else {
            System.out.println("Один из студентов не инициализирован!!");
        }
    }

    private int getSumScore() {
        return getSmart() + getWisdom() + getWit() + getCreation();
    }
}
