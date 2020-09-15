package testinherit;

import java.util.Objects;

public class TextField extends Component {
    String value;

    public TextField() {
    }

    public TextField(String value) {
        this.value = value;
    }

    public TextField(int x, int y, String value) {
        super(x, y);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TextField textField = (TextField) o;
        return Objects.equals(value, textField.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), value);
    }

    @Override
    public String toString() {
        return "TextField{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Text : " + value);
    }

    @Override
    public void draw(){
        System.out.printf("exemple de tracé dans TextField");
    }
}
