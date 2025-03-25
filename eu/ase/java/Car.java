package eu.ase.java;



public class Car {
    
    
    int speed;
    String model;
    int[] dimensions;

    public Car()
    {

    }

    
    public Car(int speed, String model) {
        super();
        this.speed = speed;
        this.model = model;
    }

    public Car(int speed, String model, int[] dimensions) {
        this.speed = speed;
        this.model = model;
        if(this.dimensions!=null){
        this.dimensions=new int[dimensions.length];
        for (int i=0;i<dimensions.length;i++)
        {
            this.dimensions[i]=dimensions[i];
        }
    }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(int[] dimensions) {
        this.dimensions = dimensions;
    }


    @Override
    protected Object clone() {
       
       Car clone= new Car(this.speed,this.model,this.dimensions);
       return clone;
    }


    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }


    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }


    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
    



}
