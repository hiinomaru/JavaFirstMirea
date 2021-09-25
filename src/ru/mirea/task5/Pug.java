package ru.mirea.task5;

public class Pug extends Dog{
    private boolean likes_to_get_out = true;

    public Pug(int age, String name, int tall, boolean likes_to_get_out) {
        this.setAge(age);
        this.setName(name);
        this.setTall(tall);
        this.likes_to_get_out = likes_to_get_out;
    }

    public String bark(){
        return "Гав!";
    }

    public boolean isLikes_to_get_out() {
        return likes_to_get_out;
    }

    public void setLikes_to_get_out(boolean likes_to_get_out) {
        this.likes_to_get_out = likes_to_get_out;
    }

    @Override
    public String toString() {
        return "Pug{" +
                "age=" + this.getAge() +
                ", name='" + this.getName() + '\'' +
                ", tall=" + this.getTall() +
                ", likes_to_get_out=" + likes_to_get_out +
                '}';
    }
}
