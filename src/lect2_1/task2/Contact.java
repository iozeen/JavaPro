package lect2_1.task2;

import java.util.Arrays;

/**
 * Created by Illya on 17.11.2016.
 */
public class Contact {
    public String name;
    public String surname;
    public String[] phones;
    public String[] sites;
    public Address address;

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phones=" + Arrays.toString(phones) +
                ", sites=" + Arrays.toString(sites) +
                ", address=" + address +
                '}';
    }
}
