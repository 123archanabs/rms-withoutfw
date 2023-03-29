package rmspac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class loginpom extends Baseclass {
	
	@FindBy (xpath="//*[@id='root']/div[2]/div[2]/form/input")
	public static WebElement  email;
	
	@FindBy (id="signPwd")
	public static WebElement password;
	
	@FindBy (xpath="//*[@id='root']/div[2]/div[2]/form/button")
	public static WebElement submit;
	
	@FindBy (xpath="//*[@id='root']/div[2]/div[2]/form/p")
	public static WebElement Resetpass;
	
	@FindBy (id="sendMail")
	public static WebElement submitemail;
	
	@FindBy (xpath="//li[@path='clients']")
	public static WebElement client;
	
	@FindBy(xpath="//table[@id='client']/tbody/tr/td[1]")
	public static WebElement clientcloumnlist;
	
	 @FindBy (xpath ="//table[@id='client']/tbody/tr[1]")
	public static WebElement Firstrowofclienttable;
	 
	 @FindBy (xpath="//table[@id='client']/tbody/tr[1]/td[1]")
	 public static WebElement firstrowfirstcolclientname;
	 
	 
	 
	 @FindBy (xpath="//*[@id='root']/div[2]/div/div[2]/div/div/div[1]/p/img")
	public static WebElement clientdetailbackbutton;
	 
	 @FindBy (xpath="//*[@id='error-part']/div")
	 public static WebElement addclienterrorvalidation;
	 
	 @FindBy (xpath="//*[@id='main-table-body']/tr/td/div/div/div[2]")
	 public static WebElement emptyclienttable;
	 
	 
	@FindBy (xpath="//button[@class='btn tableTopAdd px-4']")
	public static WebElement Add;
	
	@FindBy (xpath="//button[@type='submit']")
	public static WebElement clientaddsubmit;
	
	@FindBy (id="clientName")
	public static WebElement clientName;
	
	@FindBy (id="contactPersion")
	public static WebElement ContactpersonName;
	
	@FindBy (id="contactEmail")
	public static WebElement Contactpersonemail;
	
	
	@FindBy (id="contactPhone")
	public static WebElement Contactpersonphoneno;
	
	@FindBy (id="description")
	public static WebElement clientDescription;
	
	@FindBy(xpath="//input[@type='text']")
	public static WebElement Clientsearch;
	
	@FindBy(xpath="((//img[@class='tableActions' and @id='tableUIAction' ]/parent::div)/parent::td)[1]")
	public static WebElement Clientdeleteeditmenu;
	
	@FindBy (id="deletePopup")
	public static WebElement clientdeletpopup;
	
	@FindBy (xpath="//button[@class='btn tableTopAdd  px-4']")
	public static WebElement clientdeletpopupyes;
	
	@FindBy (xpath="html/body/div/div[2]/div/div[2]/div/main/section/div/div[2]/table/tbody/tr[1]/td[4]/div/div/div[2]/p")
	public static WebElement clientdeleteoption;
	
	@FindBy(xpath="//button[@class='btn addButton my-3 ms-auto']")
	public static WebElement clienteditupdate;
	
    @FindBy (xpath="//p[@class='position-absolute closeBoxBtn']")
	public static WebElement addclientclose;
	
	@FindBy(xpath="//div[@class='d-flex']")
	public static WebElement clientedit;
	
	@FindBy(className="d-flex")
	public static WebElement clientdelete;
	
	@FindBy(xpath="//*[@id='client']/thead/tr/th[1]/div/img")
	public static WebElement Clientsort;
	
	@FindBy (xpath="//li[@path='clusters']")
	public static WebElement clustersection;
	
	@FindBy (xpath="//input[@id='clusterName']")
	public static WebElement ClusterName;
	
	@FindBy (xpath="//textarea[@id='description']")
	public static WebElement clusterDescription;
	
	@FindBy (xpath="//div[@class='dropdown-heading-value']")
	public static WebElement clusterheadname;
	
	@FindBy (xpath="//button[@class='btn addButton my-3 ms-auto']")
	public static WebElement ClusterSave;
	
	@FindBy (xpath="//div[@id='tableUIAction']/parent::div/parent::td[1]")
	public static WebElement clustereditdelete;
	
	@FindBy (xpath="//input[@placeholder='Search']")
	public static WebElement clustersearch;
	
	@FindBy (xpath="//table[@id='cluster']/tbody/tr[1]/td[1]")
	public static WebElement clustertablefirstrowfirstcol;
	
	@FindBy (xpath="/html/body/div/div[2]/div/div[2]/div/main/section/div[1]/div[2]/table/tbody/tr[1]/td[8]/div/div/div[2]/p")
	public static WebElement clusterdeloption;
	
	
	@FindBy (xpath="//div[@class='empty-state__message']")
	public static WebElement emptyclustertable;
	
	@FindBy (xpath="//button[@class='btn btn-default px-4']")
	public static WebElement clusterdeleteoptionNo;
	
	@FindBy (xpath="//*[@id='cluster']/thead/tr/th[1]/div/img")
	public static WebElement clustersort;
	
	@FindBy (xpath="//*[@id='root']/div[2]/div/div[2]/header/h1[1]")
	public static WebElement clusterheader;
	
	@FindBy (xpath="//*[@id='root']/div[2]/div/div[2]/header/h1[1]")
	public static WebElement clusterReportheader;
	
	
	//@FindBy (xpath="//*[@id='root']/div[2]/div/div[2]/header/h1[1]")
	//public static WebElement clusterReportheader;
	
	@FindBy (xpath ="//*[@id='root']/div[2]/div/div[2]/div/main/section/div[2]/div[2]")
	public static WebElement ClusterReportGrpname;
	
	@FindBy (xpath ="//div[@class='chart-btn-group']")
	public static WebElement ClusterReportperiodname;
	
	@FindBy (xpath ="//canvas[@role='img']")
	public static WebElement clustergraph;
	
	@FindBy (xpath ="//li[@path='projects']")
	public static WebElement projectsection;
	
	@FindBy (xpath ="//button[@class='btn tableTopAdd px-4']")
	public static WebElement projectadd;
	
	@FindBy (xpath ="//input[@id='Name']")
	public static WebElement projectname;
	
	@FindBy (xpath ="//select[@id='projectType']")
	public static WebElement projecttype;
	
	@FindBy (xpath ="//input[@id='startDate']")
	public static WebElement projectstartdate;
	
	@FindBy (xpath ="//input[@id='endDate']")
	public static WebElement projectenddate;
	
	@FindBy (xpath ="//select[@id='clusterName']")
	public static WebElement projectclustername;
	
	@FindBy (xpath ="//select[@id='clientName']")
	public static WebElement projectclientname;
	
	@FindBy (xpath ="//textarea[@id='description']")
	public static WebElement projectdes;
	
	@FindBy (xpath ="//button[@class='btn ms-auto addButton master-save-btn']")
	public static WebElement projectnextbutton;
	
	@FindBy (xpath ="")
	public static WebElement projectnext;
	
	@FindBy (xpath ="//button[@class='btn d-block mb-4 add-more-button']")
	public static WebElement projectaddmore;
	
	@FindBy (xpath ="//select[@id='departmentSelect_0']")
	public static WebElement projectadddept;
	
	@FindBy (xpath ="//select[@id='designation_0']")
	public static WebElement projectadddegesnation;
	
	@FindBy (xpath ="//div[@class='dropdown-heading-value']")
	public static WebElement projectaddskill;
	
	@FindBy (xpath ="//input[@id='rBudget']")
	public static WebElement projectaddsbudget;
	

	@FindBy (xpath ="//input[@id='rHours']")
	public static WebElement projectaddshours;
	

	@FindBy (xpath ="//input[@id='month_0']")
	public static WebElement projectaddmonth;
	

	@FindBy (xpath ="//span[@class='text-center pt-2 my-2 d-block ms-auto me-5']")
	public static WebElement projectaddsectiondel;
	
	@FindBy (xpath ="//button[@class='btn d-block ms-auto mt-5 back-button']")
	public static WebElement projectaddbackbutton;
	
	@FindBy (xpath ="//button[@class='btn d-block  mt-5']")
	public static WebElement projectaddsavebutton;
	
	@FindBy (xpath ="//button[@class='btn addButton master-save-btn']")
	public static WebElement projectupdatebutton;

	
	@FindBy (xpath ="//p[@class='position-absolute closeBoxBtn']")
	public static WebElement projectaddcls;
	
	@FindBy(xpath="//div[@class='alert alert-warning alert-dismissible']")
	public static WebElement projectadderror;

	@FindBy (xpath ="//input[@class='px-4 pt-2']")
	public static WebElement projectsearch;
	
	

	@FindBy (xpath ="//button[@id='filterButton']")
	public static WebElement projectfliter;
	
	@FindBy (xpath ="//div[@id='accordion__heading-:r4:']")
	public static WebElement projectclientfliter;
	
	@FindBy (xpath ="//div[@id='accordion__heading-:r3:']")
	public static WebElement projectclusterfliter;
	
	

	@FindBy (xpath ="//button[@class='btn d-block my-2 them-button']")
	public static WebElement projectfilterapply;
	
	@FindBy (xpath ="//button[@class='btn btn-default d-block  my-2 default-button']")
	public static WebElement projectfliterReset;
	
	
	@FindBy (xpath="//div[@id='tableUIAction']")
	public static WebElement projecteditdelmenu;
	
	@FindBy (xpath="//p[@id='tableUIAction']")
	public static WebElement projecteditmenu;
	
	
	@FindBy (xpath="//*[@id='tableUIAction']/p")
	public static WebElement projectdelmenu;
	
	@FindBy (xpath="//table[@id='project']/tbody/tr[1]/td[5]")
	public static WebElement projectclustercolfirstname;
	
	@FindBy (xpath="//table[@id='project']/tbody/tr[1]/td[2]")
	public static WebElement projectclientcolfirstname;
	
	@FindBy (xpath="//table[@id='project']/tbody/tr[1]/td[1]")
	public static WebElement projectfirstcolrow;
	
	
	@FindBy(xpath="//*[@id='project']/thead/tr/th[1]/div/img")
	public static WebElement projectcolsort;
	
	
	@FindBy(xpath="//li[@path='master-data']")
	public static WebElement masterdataaddsection;

	@FindBy(xpath="//button[@class='btn tableTopAdd px-4']")
	public static WebElement masterdataaddbutton;
	
	@FindBy(xpath="//h2[@class='fs-2 fw-bold mt-0 mb-4']")
	public static WebElement masterdataadheader;
	
	@FindBy(xpath="//*[@id='type']")
	public static WebElement masterdataaddselecttype;

	@FindBy(xpath="//input[@type='text']")
	public static WebElement masterdataadddept;
	
	@FindBy(xpath="//select[@id='department']")
	public static WebElement masterdataaddselectdept;
	
	@FindBy(xpath="//input[@type='text']")
	public static WebElement masterdataadddesgin;
	
	@FindBy(xpath="//input[@type='text']")
	public static WebElement masterdataaddskill;
	
	@FindBy(xpath="//button[@class='button add add-button-part']")
	public static WebElement masterdataaddplus;
	
	
	@FindBy(xpath="//button[@class='btn ms-auto mt-3 addButton master-save-btn']")
	public static WebElement masterdataaddsave;
	

	@FindBy(xpath="//input[@name='departmentRadio']//parent::div")
	public static WebElement masterdataadddeptlist;
	
	@FindBy(xpath="//table[@id='designation-data']")
	public static WebElement masterdataadddesginlist;
	
	@FindBy(xpath="//table[@id='skills-data']")
	public static WebElement masterdataaddskilllist;
	
	
	@FindBy(xpath="//*[text()='Frontend']")
	public static WebElement masterdataadddeptfirstradio;

	@FindBy(xpath="")
	public static WebElement masterdataadddesginfirstradio;
	
	@FindBy(xpath="")
	public static WebElement masterdataadddskillfirstradio;
	
	
	
	@FindBy(xpath="")
	public static WebElement masterdataaddeditdelmenu;
	
	@FindBy(xpath="")
	public static WebElement masterdataadddeditmenu;
	
	@FindBy(xpath="")
	public static WebElement masterdataaddeledit;
	
	
	public loginpom(WebDriver driver)
{
		PageFactory.initElements(driver, this);
	}


	public String TitleP()
	{
		
		String Title=driver.getTitle();
		return Title;
	}

	public static WebElement getEmail() {
		return email;
	}



	public static WebElement getPassword() {
		return password;
	}



	public static WebElement getSubmit() {
		return submit;
	}



	public static WebElement getResetpass() {
		return Resetpass;
	}



	public static WebElement getSubmitemail() {
		return submitemail;
	}



	public static WebElement getClient() {
		return client;
	}



	public static WebElement getClientcloumnlist() {
		return clientcloumnlist;
	}



	public static WebElement getFirstrowofclienttable() {
		return Firstrowofclienttable;
	}



	public static WebElement getFirstrowfirstcolclientname() {
		return firstrowfirstcolclientname;
	}



	public static WebElement getClientdetailbackbutton() {
		return clientdetailbackbutton;
	}



	public static WebElement getAddclienterrorvalidation() {
		return addclienterrorvalidation;
	}



	public static WebElement getEmptyclienttable() {
		return emptyclienttable;
	}



	public static WebElement getAdd() {
		return Add;
	}



	public static WebElement getClientaddsubmit() {
		return clientaddsubmit;
	}



	public static WebElement getClientName() {
		return clientName;
	}



	public static WebElement getContactpersonName() {
		return ContactpersonName;
	}



	public static WebElement getContactpersonemail() {
		return Contactpersonemail;
	}



	public static WebElement getContactpersonphoneno() {
		return Contactpersonphoneno;
	}



	public static WebElement getClientDescription() {
		return clientDescription;
	}



	public static WebElement getClientsearch() {
		return Clientsearch;
	}



	public static WebElement getClientdeleteeditmenu() {
		return Clientdeleteeditmenu;
	}



	public static WebElement getClientdeletpopup() {
		return clientdeletpopup;
	}



	public static WebElement getClientdeletpopupyes() {
		return clientdeletpopupyes;
	}



	public static WebElement getClientdeleteoption() {
		return clientdeleteoption;
	}



	public static WebElement getClienteditupdate() {
		return clienteditupdate;
	}



	public static WebElement getAddclientclose() {
		return addclientclose;
	}



	public static WebElement getClientedit() {
		return clientedit;
	}



	public static WebElement getClientdelete() {
		return clientdelete;
	}



	public static WebElement getClientsort() {
		return Clientsort;
	}



	public static WebElement getClustersection() {
		return clustersection;
	}



	public static WebElement getClusterName() {
		return ClusterName;
	}



	public static WebElement getClusterDescription() {
		return clusterDescription;
	}



	public static WebElement getClusterheadname() {
		return clusterheadname;
	}



	public static WebElement getClusterSave() {
		return ClusterSave;
	}



	public static WebElement getClustereditdelete() {
		return clustereditdelete;
	}



	public static WebElement getClustersearch() {
		return clustersearch;
	}



	public static WebElement getClustertablefirstrowfirstcol() {
		return clustertablefirstrowfirstcol;
	}



	public static WebElement getClusterdeloption() {
		return clusterdeloption;
	}



	public static WebElement getEmptyclustertable() {
		return emptyclustertable;
	}



	public static WebElement getClusterdeleteoptionNo() {
		return clusterdeleteoptionNo;
	}



	public static WebElement getClustersort() {
		return clustersort;
	}



	public static WebElement getClusterheader() {
		return clusterheader;
	}



	public static WebElement getClusterReportheader() {
		return clusterReportheader;
	}



	public static WebElement getClusterReportGrpname() {
		return ClusterReportGrpname;
	}



	public static WebElement getClusterReportperiodname() {
		return ClusterReportperiodname;
	}



	public static WebElement getClustergraph() {
		return clustergraph;
	}

}
