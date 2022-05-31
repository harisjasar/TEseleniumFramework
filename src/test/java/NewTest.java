import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  
  @Test
  public void f() {
	  System.out.println("Hello World");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This will run before f method");
  }
}
