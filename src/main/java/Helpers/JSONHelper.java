package Helpers;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;


public class JSONHelper {

    public JSONObject readJson(String fileName) {
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader fileReader = new FileReader("src/test/resources/" + fileName.trim());
            Object obj = jsonParser.parse(fileReader);
            return (JSONObject) obj;
        } catch (IOException | ParseException e) {
            throw new RuntimeException("Failed to read JSON file: " + fileName, e);
        }
    }
}
