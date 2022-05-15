import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

class Book {

String bookName;
int bookPrice;
String authorName;
int year;

public Book(String bookName,int bookPrice,String authorName,int year) {

super();
this.bookName = bookName;
this.bookPrice = bookPrice;
this.authorName = authorName;
this.year = year;
}
public String toString(){
return"Book[bookNmae="+bookName+",bookPrice ="+bookPrice+",authorName ="+authorName+",Year="+year+"]";
}
public String getbookName() {
return bookName;
}
public int getbookPrice() {
return bookPrice;
}
public String getauthorName() {
return authorName;
}
public int getYear() {
return year;
}
}

class BookEg {
public static void main(String args[]) {

List<Book> l = new ArrayList<>();

l.add(new Book("Tamil",1000,"abc",1786));
l.add(new Book("English",700,"def",1888));
l.add(new Book("Maths",800,"kgf",1864));
Book book = new Book("Science",400,"ngk",1978);
l.add(book);
Book book1 = new Book("S.Science",400,"xyz",1987);
l.add(book1);


System.out.println(l);
System.out.println(l.get(0));
Book data = l.get(0);

Iterator<Book> itr = l.iterator();
while(itr.hasNext()){
Book b = itr.next();
System.out.println(b.getbookName()+" "+b.getbookPrice()+" "+b.getauthorName()+" "+b.getYear());
}
System.out.println(" ");
l.remove(book);
System.out.println("After remove element:");
Iterator<Book> itrr = l.iterator();
while(itrr.hasNext()){
Book b = itrr.next();
System.out.println(b.getbookName()+" "+b.getbookPrice()+" "+b.getauthorName()+" "+b.getYear());
}
}
}