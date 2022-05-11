import java.io.FileWriter;
import java.io.FileReader;

public class FileWriterEx {

public static void main(String args[]) {
try{
//FileWriter fw = new FileWriter("D://sample.txt");
//fw.write("welcome to anudip foundation skill developement center");

FileReader fr = new FileReader("D://sample.txt");
int i;
while((i=fr.read())!=-1) {
System.out.println((char)i);
}
fr.close();

System.out.println("done");
}catch(Exception e){
System.out.println(e);
}
}
} 