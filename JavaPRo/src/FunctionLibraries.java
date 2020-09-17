import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FunctionLibraries extends ObjectClass {
	public void drawLineByOffset(int offsetX, int offSetY) {
		Actions act = new Actions(new ChromeDriver());
		
		homePg.headerElemDrawLine.click();
		act.moveToElement(homePg.imgContainer);
		homePg.imgContainer.click();
		act.moveByOffset(offsetX, offSetY).click().build().perform();
	}

}
