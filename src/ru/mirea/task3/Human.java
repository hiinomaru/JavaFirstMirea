package ru.mirea.task3;

public class Human {
    int tall;
    Leg L1 = new Leg(38);
    Leg L2 = new Leg(38);
    Head H = new Head('M');
    Hand H1 = new Hand(17);
    Hand H2 = new Hand(17);

    public Human(int tall) {
        this.tall = tall;
    }

    @Override
    public String toString() {
        return "Human{" +
                "tall=" + tall +
                ", L1=" + L1 +
                ", L2=" + L2 +
                ", H=" + H +
                ", H1=" + H1 +
                ", H2=" + H2 +
                '}';
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }
}
