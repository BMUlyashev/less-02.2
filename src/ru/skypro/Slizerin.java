package ru.skypro;

public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authority;

    public Slizerin(String name, int magicPower, int transgressionDistance,
                    int cunning, int determination, int ambition, int resourcefulness, int authority) {
        super(name, magicPower, transgressionDistance);
        setCunning(cunning);
        setDetermination(determination);
        setAmbition(ambition);
        setResourcefulness(resourcefulness);
        setAuthority(authority);
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (isQualityLegal(cunning)) {
            this.cunning = cunning;
        }
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (isQualityLegal(determination)) {
            this.determination = determination;
        }
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (isQualityLegal(ambition)) {
            this.ambition = ambition;
        }
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (isQualityLegal(resourcefulness)) {
            this.resourcefulness = resourcefulness;
        }
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        if (isQualityLegal(authority)) {
            this.authority = authority;
        }
    }

    @Override
    public String toString() {
        return String.format("Хитрость: %d. Решительность: %d. Амбициозность: %d. Жажда власти: %d",
                getCunning(), getDetermination(), getAmbition(), getResourcefulness(), getAuthority());
    }

    public static void printBestStudent(Slizerin that, Slizerin another) {
        if (that != null && another != null) {
            if (that.getSumScore() > another.getSumScore()) {
                System.out.printf("%s лучший Слизеринец, чем %s.%n", that.getName(), another.getName());
            } else if (that.getSumScore() < another.getSumScore()) {
                System.out.printf("%s лучший Слизеринец, чем %s.%n", another.getName(), that.getName());
            } else {
                System.out.println("Студенты по способностям равны");
            }
        } else {
            System.out.println("Один из студентов не инициализирован!!");
        }
    }

    private int getSumScore() {
        return getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getAmbition();
    }

}
