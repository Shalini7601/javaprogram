class elementExample{
public static void main(String args[]){
int [] a ={33,53,74,94,22,87,13,63};
int large=a[0],small=a[0];
for(int i=1;i<a.length;i++)
{
if(a[i]>large)
large=a[i];
else if(a[i]<small)
small=a[i];
}
System.out.println("Small number:" +large);
System.out.println("Large number:" +small);
}
}




