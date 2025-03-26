import java.io.FileWriter;
import java.io.ObjectOutputStream;

public interface XStream {
    ObjectOutputStream createObjectOutputStream(FileWriter fileWriter);
}
