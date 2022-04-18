class multiarraymultipleExample{
public void display(){
int arr[] [] = {{1,2,3},{4,5,6},{7,8,9}};
int arr1[] []= {{2,4,6},{3,5,7},{1,5,3}};
int result[] []=new int[3][3];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
result[i][j] = 0;

for(int k=0;k<3;k++){
result[i][j] = arr[i][k] * arr1[k][j];
}
System.out.print(result[i][j] +" ");
}
System.out.println();
}
}
public static void main(String args[]){
multiarraymultipleExample obj = new multiarraymultipleExample();
obj.display();
}
}
