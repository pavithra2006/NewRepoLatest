import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Driver{
	@FindBy(xpath = "//input[@title='Draw a line']")
	public WebElement headerElemDrawLine;
	
	@FindBy(xpath = "//canvas[@id= 'imageView']")
	public WebElement imgContainer;
	
}
