package PeopleNtech.Automationtraining;
import java.io.File;
import io.restassured.response.ResponseBody;
import io.restassured.response.Response;
import junit.framework.Assert;
public class API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Response resp=get("https://reqres.in/api/users?page=2");
resp.prettyPrint();
int statusof= resp.statusCode();
System.out.println(statusof);
Assert.assertEquals(statusof, 200);
responseBody verifing=resp.getBody();
String converts=verifing.asString();
Assert.assertEquals(converts.contains("Funke"), true);
File it=new File(C:\Users\betat\git\repository\Automationtraining\Automation.json);
Response gt=given().contentType(ContentType.JSON).body(it).post("https://reqres.in/api/users");
gt.prettyPrint();
	}

}
