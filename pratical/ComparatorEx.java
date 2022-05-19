
import java.util.Compator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;


class Book {
String bookName;
String authorName;
int bookPrice;

public Book(String bookName,int bookPrice,String authorName){
super();
this.bookName = bookName;
this.bookPrice = bookPrice;
this.authorName = authorName;
}

public String getBookName() {
return bookName;
}
public String getBookPrice() {
return bookPrice;
}
public String getAuthorName() {
return authorName;
}
}


public class BookPriceCompare implements Comparator{

public int compare(Object o1,Object o2){
Book b1 = (Book) o1;
Book b2 = (Book) o2;

if(b1.bookPrice == b2.bookPrice)
return 0;

else if (b1.bookPrice > b2.bookPrice)
return 1;

else
return -1;
}
}

public BookNameCompare implements Comparator {
public int compare(Object o1,Object o2){
Book b1 = (Book) o1;
Book b2 = (Book) o2;

return b1.bookName.compareTo(b2.bookName);
}
}

public class ComparatorEx {

public static void main(String args[]){

ArrayList<Book> al = new Array<Book>();
al.add(new Book("JAVA", "Games Josling", 2300));
al.add(new Book("PHP", "Games", 8000));
al.add(new Book("PYTHON", "XYZ", 7300));
al.add(new Book("DOTnet", "ABC", 5000));
al.add(new Book("HTML", "DEF", 4000));

System.out.println("Sorting by BookPrice");
Collections.sort(al,new BookPriceCompare());
Iterator itr = al.iterator();
while (itr.hasNext()){
Book b = (Book) itr.hasNext();
System.out.println(b.bookNmae+" "+b.authorName+" "+n.bookPrice);
}

System.out.println("------------------------");
System.out.println("Sorting by BookName");
Collections.sort(al,new BookNameCompare());
Iterator itr1 = al.iterator();
while (itr1.hasNext()){
Book b = (Book) itr1.hasNext();
System.out.println(b.bookNmae+" "+b.authorName+" "+n.bookPrice);
}

//Another method is using 

//Comparator<Book> c = Comparator.Comparing(Book::getBookName);
//Collections.sort(al,c);
//System.out.println("sorting by BookName);
//for(Book b : al){
//System.out.println(n.bookName+" "+b.authorName+" "+b.bookPrice);
//}

//Comparator<Book> c1 = Comparator.Comparing(Book::getBookPrice);
//Collections.sort(al,c1);
//System.out.println("sorting by BookPrice);
//for(Book b : al){
//System.out.println(n.bookName+" "+b.authorName+" "+b.bookPrice);
//}

}
}