package ru.skypro;

public abstract class  Hogwarts {
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

    public void printStudentInfo() {
        System.out.println(this);
    }

    private int getSumScore() {
        return getMagicPower() + getTransgressionDistance();
    }

    public void compareTo(Hogwarts another) {
        if (this != null && another != null) {
            int capabilitiesThis = this.getSumScore();
            int capabilitiesAnother = another.getSumScore();
            if (capabilitiesThis > capabilitiesAnother) {
                System.out.printf("%s обладает бОльшеймощностью магии, чем %s.%n", this.getName(), another.getName());
            } else if (capabilitiesThis < capabilitiesAnother) {
                System.out.printf("%s обладает бОльшей мощностью магии, чем %s.%n", another.getName(), this.getName());
            } else {
                System.out.println("У студентов одинаковая мощность магии");
            }
        } else {
            System.out.println("Один из студентов не инициализирован!!");
        }
    }

    @Override
    public String toString() {
        return String.format("%s: Сила магии %d. Трансрессия %d", name, magicPower, transgressionDistance);
    }
}
