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
        return String.format("%s. Хитрость: %d. Решительность: %d. Амбициозность: %d. Жажда власти: %d",
                super.toString(),getCunning(), getDetermination(), getAmbition(), getResourcefulness(), getAuthority());
    }

    public void slizerinCompareTo(Slizerin another) {
        if (this != null && another != null) {
            if (this.getSumScore() > another.getSumScore()) {
                System.out.printf("%s лучший Слизеринец, чем %s.%n", this.getName(), another.getName());
            } else if (this.getSumScore() < another.getSumScore()) {
                System.out.printf("%s лучший Слизеринец, чем %s.%n", another.getName(), this.getName());
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
