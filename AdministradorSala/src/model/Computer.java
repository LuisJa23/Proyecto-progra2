package model;

import java.io.Serializable;

public class Computer implements Serializable {

    private String id;
    private boolean available;

    public Computer(String id, boolean available) {
        this.id = id;
        this.available = available;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id='" + id + '\'' +
                ", available=" + available +
                '}';
    }
}
