package lect2_1.task1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Illya on 17.11.2016.
 */
@XmlRootElement(name = "trains")
public class Trains {
    @XmlElement(name = "train")
    private List<Train> trains = new ArrayList<>();

    public void add(Train train) {
        trains.add(train);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(trains.toArray());
    }

    public List<Train> getTrains() {
        return trains;
    }
}
