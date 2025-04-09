import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 
HelloWorld {
public static void main(String[] args) throws IOException 
{
    System.out.println("Як вас звати?");
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
String userName = input.readLine();
System.out.println("Hello, " + userName + "!");
}
}