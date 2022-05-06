package thread;
public class ThreadJoinExample extends Thread{
public void run(){
	for(int i=1;i<=5;i++){
		try{
			Thread.sleep(800);
		}catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println(i);
	}
}
public static void main(String[] args){
ThreadJoinExample t = new ThreadJoinExample();
ThreadJoinExample t1 = new ThreadJoinExample();
ThreadJoinExample t2 = new ThreadJoinExample();

t.start();
t1.Start();
try{
t.join();
}catch(InterruptedException e){
System.out.println(e);
}
t2.start();
}
}