classs Producer extends Thread{
Data d;
public Producer(Data d) {
this.d = d;
}
public void run() {
for(int j=1;j<=5;j++) {
d.produce(j);
}
}
}

public class ThreadCommExample {
public static void main(String args[]) {
Data d = new Dta();
Producer p = new Producer(d);
Consumer c = new Consumer(c);
p.start();
c.start();
}
}