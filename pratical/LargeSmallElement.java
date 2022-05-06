class DuplicateElement{
Public void  display(0
{
int Arr[]={1,2,4,2,6,8,4};
for(int i=0; i<Arr.length; i++)
{
for(int j=i+1; j<Arr.length; j++)
{
if(Arr[i]==Arr[j])
System.out.println("Duplicate element is:" +Arr[j]);
}
}
}
public static void main(String args[])
{
DuplicateElement e=new DuplicateElement();
e.display();
}
}