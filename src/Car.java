/**Create a Java class named Car with attributes like make, model, and year. Instantiate an object
 *  of this class and set values using a constructor.*/
public class Car {
    private String make;
    private String model;
    private Integer year;

    public Car() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String mk) {
        make = mk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String mo) {
        model = mo;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer yr) {
        if(yr>=1990 && yr<=2090){
        year = yr;
        }else{
            System.out.println("Invalid year. Please enter a year between 1990 and 2090.");
        }
    }
}
