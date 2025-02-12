public class GO {

    private String color; //if private child needs a setter
    private boolean filled;

    public GO() {
        color = "white";
        filled = false;
    }

    public GO (String color, boolean filled) {
       this.color = color;
       this.filled = filled;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    @Override
    public String toString(){
        return "geoObject: color = " + color + "  filled =  " + filled;
    }
}
