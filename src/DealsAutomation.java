import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import file.payload;




public class DealsAutomation {


	@Test
	public  void GuardarDeal() {
		String token = Authentication.ObtenerToken();
		RestAssured.baseURI = "https://abi-conbees-orquestadordeals-tst.dev.abinbev-las.com";

		String response = given().header("Content-Type", "application/json")
				.headers("Accept", "*/*")
				.headers("Accept-Encoding", "gzip, deflate, br")
				.headers("Connection", "keep-alive")
				.headers("Authorization", "Bearer " + token)
				.body(payload.Deal()).when().post("api/v1/deal/test/save").then().statusCode(200).extract().response()
				.asString();

		System.out.println(response);
		// JsonPath js=new JsonPath(response); //for parsing Json
		// String placeId=js.getString("place_id");
		// System.out.println(placeId);

	}
	
	
	@Test
	public  void ProcesarDealsAZURE() {
		String token = Authentication.ObtenerToken();
		RestAssured.baseURI = "https://abi-conbees-orquestadordeals-tst.dev.abinbev-las.com";

		String response = given()
				.queryParam("country", "AR").queryParam("entidadOrigen", "PDA")
				.header("Content-Type", "application/json")
				.headers("Accept", "*/*")
				.headers("Accept-Encoding", "gzip, deflate, br")
				.headers("Connection", "keep-alive")
				.headers("Authorization", "Bearer " + token)
				.body(payload.Deal()).when().post("api/v1/deal/process").then().statusCode(200).extract().response()
				.asString();

		System.out.println(response);
		// JsonPath js=new JsonPath(response); //for parsing Json
		// String placeId=js.getString("place_id");
		// System.out.println(placeId);

	}
}
