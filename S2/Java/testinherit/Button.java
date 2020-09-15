package testinherit;

public class Button extends Component {
    private String label;


    public Button(int x, int y, String label) {
        super(x,y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {

        this.label = label;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Label : "+ label);
    }

    @Override
    public void draw(){
        System.out.printf("exemple de tracé dans Button");
    }
}
