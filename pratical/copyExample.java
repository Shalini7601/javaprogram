import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyExample {
public static void main(String args[]) {
try{
FileInputStream fin = new FileInputStream("D:\\test.txt");
FileOutputStream fout = new FileOutputStream("C:\\test1.txt");
byte [] arr = new byte[1024];
int L;
while((L = fin.read(arr)) > 0) {
fout.write(arr);
}

fin.close();
fout.close();
System.out.println("done");
}
catch(Exception e){
System.out.println(e);
}
}
}