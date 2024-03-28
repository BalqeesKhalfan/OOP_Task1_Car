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
        year = yr;
    }
}
