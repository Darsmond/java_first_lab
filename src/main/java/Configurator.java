import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Configurator {

    static Properties prop = new Properties();
    static OutputStream output = null;

    public String getPropValues() throws IOException {

        try {
            output = new FileOutputStream("config.properties");
            prop.setProperty("Name","Ars");
            prop.store(output,null);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

       String Name = prop.getProperty("Name");

       return Name;
    }
}