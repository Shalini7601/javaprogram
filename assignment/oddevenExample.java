class oddevenExample{
public static void main(String args[]){
int [] num = {1,2,5,3,12,13,24,8,88,33};
System.out.println("ODD numbers:");
for(int i=0; i<num.length;i++){
if(num[i]%2!=0){
System.out.println(+num[i]);
}
}
System.out.println("EVEN numbers:");
for(int j=0; j<num.length;j++){
if(num[j]%2==0){
System.out.println(+num[j]);
}
}
}
}

