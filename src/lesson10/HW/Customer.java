package lesson10.HW;

/**
 * Created by SERGIO on 21.04.2017.
 */
public class Customer {
    private String name;
    private String city;
    private String gender;

    public Customer(String name, String city, String gender) {
        this.name = name;
        this.city = city;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }
}
