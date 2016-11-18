package lect2_1.task3;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Created by Illya on 18.11.2016.
 */

@XmlRootElement(name = "query")
public class Query {
    @XmlAttribute(name = "count")
    private String count;
    @XmlAttribute(name = "created")
    private String created;
    @XmlAttribute(name = "lang")
    private String lang;
    @XmlElement(name = "results")
    private Results results;

    @Override
    public String toString() {
        return "Query{" +
                "count='" + count + '\'' +
                ", created='" + created + '\'' +
                ", lang='" + lang + '\'' +
                ", results=" + results +
                '}';
    }
}
