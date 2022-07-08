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
        return String.format("%s. Ум: %d. Мудрость: %d. Остроумие: %d. Творчество: %d",
                super.toString(), getSmart(), getWisdom(), getWit(), getCreation());
    }

    public void kogtevranCompareTo(Kogtevran another) {
        if (this != null && another != null) {
            if (this.getSumScore() > another.getSumScore()) {
                System.out.printf("%s лучший Когтевранец, чем %s.%n", this.getName(), another.getName());
            } else if (this.getSumScore() < another.getSumScore()) {
                System.out.printf("%s лучший Когтевранец, чем %s.%n", another.getName(), this.getName());
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
