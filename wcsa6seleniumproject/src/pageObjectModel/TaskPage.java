package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskPage {
	//it is use to store all webElements of task page
	
	@FindBy(partialLinkText = "Projects & Customers") private WebElement Projects_Customers_Module;
    @FindBy(xpath = "//input[@value='Create New Customer']") private WebElement Create_New_Customer_Button;
    @FindBy(xpath = "//input[@value='Create New Project']") private WebElement Create_New_Project_Button;
    @FindBy(name = "name") private WebElement Customer_Name_TB;
    @FindBy(name = "createCustomerSubmit") private WebElement Create_Customer_Button;
    @FindBy(name = "customerId") private WebElement Customer_DropDown;
    @FindBy(xpath = "//input[@name='name']") private WebElement Project_Name;
    @FindBy(name = "createProjectSubmit") private WebElement Create_Project_Button;
    
    //initialization
    
    public TaskPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

    //Utilization
    
	public WebElement getProjects_Customers_Module() {
		return Projects_Customers_Module;
	}

	public WebElement getCreate_New_Customer_Module() {
		return Create_New_Customer_Button;
	}

	public WebElement getCreate_New_Project_Module() {
		return Create_New_Project_Button;
	}

	public WebElement getCustomer_Name_TB() {
		return Customer_Name_TB;
	}

	public WebElement getCreate_Customer_Button() {
		return Create_Customer_Button;
	}

	public WebElement getCustomer_DropDown() {
		return Customer_DropDown;
	}

	public WebElement getProject_Name() {
		return Project_Name;
	}

	public WebElement getCreate_Project_Button() {
		return Create_Project_Button;
	}
    
//Operational Methods
	
    public void create_New_Customer_Method(String customerName)
    {
    	Projects_Customers_Module.click();
    	Create_New_Customer_Button.click();
    	Customer_Name_TB.sendKeys(customerName);
    	Create_Customer_Button.click();
    	
    }
    
    public void create_New_Project_Method(String customerName , String  projectName)
    {
    	Projects_Customers_Module.click();
    	Create_New_Project_Button.click();
    	Select select = new Select(Customer_DropDown);
    	select.selectByVisibleText(customerName);
    	Project_Name.sendKeys(projectName);
    	Create_Project_Button.click();
    }
    
}
