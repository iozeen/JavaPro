package lect2_1.task3;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Illya on 18.11.2016.
 */
@XmlRootElement
public class Rate {
    @XmlAttribute(name = "id")
    private String id;
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "Rate")
    private double rate;
    @XmlElement(name = "Date")
    private String date;
    @XmlElement(name = "Time")
    private String time;
    @XmlElement(name = "Ask")
    private double ask;
    @XmlElement(name = "Bid")
    private double bid;

    @Override
    public String toString() {
        return "Rate{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", ask=" + ask +
                ", bid=" + bid +
                '}';
    }
}
