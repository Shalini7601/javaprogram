public class SequentialExample{
public void run(){
for(int i=1;i<=5;i++){
try{
Thread.sleep(50);
}
catch(InterruptedException e){
System.out.println(e);
}
System.out.println(i);
}
}
public static void main(String[]args){
SequentialExample t1=new SequentialExample();
SequentialExample t2=new SequentialExample();
SequentialExample t3=new SequentialExample();
t1.run();
t2.run();
t3.run();
}
}