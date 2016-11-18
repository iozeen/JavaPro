package lect2_1.task1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 * Created by Illya on 17.11.2016.
 */
public class Train {
    private static int idd = 2;
    private int id = 0;
    private String from;
    private String to;
    private String date;
    private String departure;

    public Train() {
    }

    public Train(String from, String to, String date, String departure) {
        idd++;
        id = idd;
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
    }

    @Override
    public String toString() {
        return "Train" + id + "{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date='" + date + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    @XmlElement
    public void setTo(String to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    @XmlElement
    public void setDate(String date) {
        this.date = date;
    }

    public String getDeparture() {
        return departure;
    }

    @XmlElement
    public void setDeparture(String departure) {
        this.departure = departure;
    }
}
