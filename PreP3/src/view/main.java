package view;

import controller.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class main {
    public static void main(String[] args) {
    		metodos m = new metodos();
        try {
            String url = "https://wikimedia.org/api/rest_v1/metrics/pageviews/per-article/en.wikipedia/all-access/all-agents/Tiger_King/daily/20210901/20210930";

            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            String filePath = "C:\\TEMP\\wiki.json";
            File file = new File(filePath);

            file.getParentFile().mkdirs();

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(response.toString());
            writer.close();

            System.out.println("Dados gravados em: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        	m.lerMostrarJSON();
    }
}
