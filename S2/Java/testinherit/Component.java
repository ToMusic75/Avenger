package testinherit;

import java.util.Objects;

public abstract class Component {
    private int x;
    private int y;

    public abstract void draw() ;

    public Component() {
    }

    public Component(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return x == component.x &&
                y == component.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Component{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void print() {
        System.out.println("coordinates x : "+ x + ", y : " + y);
    }
}
