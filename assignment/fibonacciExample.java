class fibonacciExample{
public static void main(String args[]){
int n=8, a=0, b=1;
System.out.println("Fibonacci terms:");
for(int i=1;i<=n;i++){
System.out.println(a);
int c=a+b;
a=b;
b=c;
}
}
}