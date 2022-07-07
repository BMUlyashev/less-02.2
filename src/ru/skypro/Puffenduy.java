package ru.skypro;

public class Puffenduy extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffenduy(String name, int magicPower, int transgressionDistance,
                     int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        setIndustriousness(industriousness);
        setLoyalty(loyalty);
        setHonesty(honesty);
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        if (isQualityLegal(industriousness)) {
            this.industriousness = industriousness;
        }
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (isQualityLegal(loyalty)) {
            this.loyalty = loyalty;
        }
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (isQualityLegal(honesty)) {
            this.honesty = honesty;
        }
    }

    @Override
    public String toString() {
        return String.format("Трудолюбие: %d. Верность: %d. Честность: %d.", getIndustriousness(), getLoyalty(), getHonesty());
    }

    public static void printBestStudent(Puffenduy that, Puffenduy another) {
        if (that != null && another != null) {
            if (that.getSumScore() > another.getSumScore()) {
                System.out.printf("%s лучший Пуффендоец, чем %s.%n", that.getName(), another.getName());
            } else if (that.getSumScore() < another.getSumScore()) {
                System.out.printf("%s лучший Пуффендоец, чем %s.%n", another.getName(), that.getName());
            } else {
                System.out.println("Студенты по способностям равны");
            }
        } else {
            System.out.println("Один из студентов не инициализирован!!");
        }
    }

    private int getSumScore() {
        return getIndustriousness() + getLoyalty() + getHonesty();
    }
}
