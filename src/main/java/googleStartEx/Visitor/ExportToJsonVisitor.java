package googleStartEx.Visitor;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class ExportToJsonVisitor implements Visitor {
    private static int i = 1; // filename

    @Override
    public void exportToJson(Object o) {
        Gson gson = new Gson();
        String json = gson.toJson(o);
        System.out.println(json);
        createJsonFile(String.valueOf(i), json);
        i++;
    }

    private void createJsonFile(String fileName, String json) {
        String path = "src/main/resources/";
        FileWriter file = null;
        try {
            file = new FileWriter(path + fileName);
        } catch (IOException e) {
            throw new RuntimeException("Failed to create a new FileWriter");
        }
        try {
            file.write(json);
        } catch (IOException e) {
            throw new RuntimeException("Filed to write to file " + file);
        }
        try {
            file.close();
        } catch (IOException e) {
            throw new RuntimeException("Failed to close file after writing " + file);
        }

    }

//    @Override
//    public void exportToJson(Asset asset) {
//        Gson gson = new Gson();
//        String json = gson.toJson(asset);
//        System.out.println(json);
//        createJsonFile(String.valueOf(i),json);
//    }
//    @Override
//    public void exportToJson(Group group) {
//
//    }
//    @Override
//    public void exportToJson(User user) {
//
//    }
}
