package lect2_1.task3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

/**
 * Created by Illya on 18.11.2016.
 */
@XmlRootElement(name = "results")
public class Results {
    @XmlElement
    private Rate[] rate;

    @Override
    public String toString() {
        return "Results{" +
                "rate=" + Arrays.toString(rate) +
                '}';
    }
}
