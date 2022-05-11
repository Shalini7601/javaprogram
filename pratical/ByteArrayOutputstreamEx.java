import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputstreamEx {
public static void main(String args[]) throws IOException {
FileOutputStream f1 = new FileOutputStream("D:\\sample.txt");
FileOutputStream f2 = new FileOutputStream("C:\\sample1.txt");

ByteArrayOutputStream bout = new ByteArrayOutputStream();
bout.write(65);

bout.writeTo(f1);
bout.writeTo(f2);
}
} 