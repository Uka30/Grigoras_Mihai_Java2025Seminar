package eu.ase.java;

public class Main {
    public static void main(String[] args)
    {
        

        int x=10;
        System.out.println(("java"));
      


        Car c= new Car(100,"Toyota");
       Car clone= (Car)c.clone();
        c.model="Dacia";

        System.out.println(c.getModel());

        int[] dimensions={100,200,300};
        int[] newDimensions= new int[3];
        newDimensions[0]=100;
        newDimensions[1]=200;
        newDimensions[2]=300;

        Car d= new Car(100,"Toyota",dimensions);
      // for (int i=0;i<d.dimensions.length;i++)
      // {
        //System.out.println(d.dimensions[i]);
        
      // }



       Car cloneDimensions =(Car) d.clone();

    }
    
}
