public class GOTriangle extends GO {
    private double base;
    private double height;
    
    public GOTriangle(){
        base = 1.0;
        height = 1.0;           
    }
    public GOTriangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public GOTriangle(double base, double height, String color, boolean filled){
        super(color, filled);
        this.base = base;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
      
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea(){
        return base * height /2.0;
    }
        
    @Override
        public String toString(){
            return "Base: " + base + " height: " + height + super.toString();
        }
    }
