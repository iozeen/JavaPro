package lect2_1.task3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {
        Query q = new Query();
        String request = "http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20yahoo.finance." +
                "xchange%20where%20pair%20in%20(%22USDEUR%22,%20%22USDUAH%22)&env=store://datatables.org/alltableswithkeys";
        String result = performRequest(request);
        File file = new File("src\\lect2_1\\task3\\out.xml");
        BufferedWriter f = new BufferedWriter(new FileWriter(file));
        try {
            f.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            f.close();
        }
        JAXBContext jaxbContext = JAXBContext.newInstance(Query.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        // читаем из файла
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        q = (Query) unmarshaller.unmarshal(file);
        System.out.println(q);

        // читабельное форматирование
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //пишем в файл
        marshaller.marshal(q, file);
        marshaller.marshal(q, System.out);
    }

    private static String performRequest(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        StringBuilder sb = new StringBuilder();

        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
            char[] buf = new char[1000000];

            int r = 0;
            do {
                if ((r = br.read(buf)) > 0)
                    sb.append(new String(buf, 0, r));
            } while (r > 0);
        } finally {
            http.disconnect();
        }

        return sb.toString();
    }
}