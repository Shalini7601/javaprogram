class duplicateExample{
public static void main(String args[]){
int [] a = {1,2,2,5,7,5,8,4,8};
System.out.println("Duplicate number:");
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i] == a[j])
System.out.println(a[j]);
}
}
}
}
