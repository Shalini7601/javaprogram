import java.util.ArrayList;
import java.util.Iterator;

class Book {

String bookName;
String authorName;
int bookPrice;

public Book(String bookName,String authorName,int bookPrice){

super();
this.bookName = bookName;
this.authorName = authorName;
this.bookPrice = bookPrice;
}
public String toString(){
return"Book[bookNmae="+bookName+",authorName ="+authorName+",bookPrice ="+bookPrice+"]";
}
public String getbookName() {
return bookName;
}
public String getauthorName() {
return authorName;
}
public int getbookPrice() {
return bookPrice;
}
}


public class ArrayListex {

public static void main(String args[]) {
ArrayList<Book> al = new ArrayList<Book>();

Book b = new Book("JAVA", "GamesJosling", 2300);
Book b1 = new Book("PHP", "Games", 8000);
Book b2 = new Book("PYTHON", "XYZ", 7300);
Book b3 = new Book("DOTnet", "ABC", 5000);

ArrayList<Book> a = new ArrayList<Book>();
a.add(b);
a.add(b1);
a.add(b3);
a.add(b2);



Iterator itr = a.iterator();
while(itr.hasNext()) {
Book obj = (Book) itr.next();
System.out.println(obj.bookName+" "+" "+obj.authorName+" "+obj.bookPrice);

System.out.println("Intex of Elemeent:");
Book bb = a.indexOf(b1);
System.out.println(bb);

//check list empty or not
if(a.isEmpty()) {
System.out.println("ArrayList is empty");
} else {
System.out.println("ArrayList is notempty");
}
//remove third element
a.remove(b2);

Iterator itr1 = a.iterator();
while(itr1.hasNext()) {
Book o = (Book) itr1.next();
System.out.println(o.bookName+" "+ o.authorName+" "+o.bookPrice);
}

//traverse using Iterator
System.out.println("Iterator value");
Iterator itrr = a.iterator();
Book oo = (Book) itrr.next();
while(itrr.hasNext()) {
System.out.println(itrr.next() + " ");
}
}
}
}