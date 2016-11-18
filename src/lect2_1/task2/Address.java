package lect2_1.task2;

/**
 * Created by Illya on 16.11.2016.
 */
public class Address {
    public String country;
    public String city;
    public String street;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
