package runner_script;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import generic_script1.generic_for_O_C;
public class Data_provider  extends generic_for_O_C
{
	@Test(dataProvider = "testdata")
	public void open(String f,String h) throws InterruptedException 
	{
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9062054%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIvpT41Nbw_wIVG399Ch1qigx9EAAYASAAEgKAP_D_BwE");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(f);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(h);
		
	}
	@DataProvider(name="testdata")
	public Object[][] punter() {
		Object[][]arr=new Object[2][2];
		arr[0][0]="sanjay";
		arr[0][1]="monitha";
		
		arr[1][0]="sanjay";
		arr[1][1]="monitha";
		return arr;
	}

}
