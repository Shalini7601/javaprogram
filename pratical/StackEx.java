import java.util.EmptyStackException;
import java.util.Stack;

class  StackEx {

public static void main(String args[]) {
Stack<Integer> st = new Stack<Integer>();

boolean b = st.empty();
System.out.println(b);

try{
st.pop();
}
catch(EmptyStackException e) {
System.out.println("Empty stack" +e);
}

st.push(90);
st.push(45);
st.push(20);
st.push(88);

System.out.println(st);

st.push(78);
st.push(14);

System.out.println(st);

Integer i = st.peek();
System.out.println("Top element: " +i);

st.pop();
System.out.println(st);

int j = st.search(88);
System.out.println("position is:" +j);
}
}

