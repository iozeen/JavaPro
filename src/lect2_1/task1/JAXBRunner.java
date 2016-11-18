package lect2_1.task1;

import lect2_1.jaxb.Catalog;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Illya on 17.11.2016.
 */
public class JAXBRunner {
    public static void main(String[] args) throws IOException {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        String currDate = df.format(new Date());
        Trains trains = new Trains();
        try {
            File file = new File("src\\lect2_1\\task1\\train.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Trains.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            trains = (Trains) unmarshaller.unmarshal(file);
            trains.add(new Train("Dnipro", "Kyiv", "17.11.2016", "19:05"));
            trains.add(new Train("Odessa", "Lviv", "17.11.2016", "18:55"));

            marshaller.marshal(trains, file);
            marshaller.marshal(trains, System.out);
            System.out.println("Trains that arrive from 15:00 to 19:00 tonight:");
            for (Train tr : trains.getTrains()) {
                int min = Integer.parseInt(tr.getDeparture().split(":")[0]) * 60 + Integer.parseInt(tr.getDeparture().split(":")[1]);
                if (min >= 15 * 60 && min <= 19 * 60 && currDate.equals(tr.getDate())) {
                    System.out.println(tr);
                }
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
