import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import file.payload;

public class DealsAutomation {

	SessionFilter session = new SessionFilter();

	@Test
	public void GuardarDeal() {
		String token = Authentication.ObtenerToken();
		String jsonDeal = payload.Deal();
		RestAssured.baseURI = "https://abi-conbees-orquestadordeals-tst.dev.abinbev-las.com";

		String response = given().header("Content-Type", "application/json").headers("Accept", "*/*")
				.headers("Accept-Encoding", "gzip, deflate, br").headers("Connection", "keep-alive")
				.headers("Authorization", "Bearer " + token).body(payload.Deal()).when().post("api/v1/deal/test/save")
				.then().statusCode(200).extract().response().asString();

		//System.out.println(jsonDeal);
		JsonPath js=new JsonPath(jsonDeal); //for parsing Json
		String dealId =js.getString("dealId");
		System.out.println(dealId);

	}

	@Test
	public void ProcesarDealsAZURE() {
		String token = Authentication.ObtenerToken();
		RestAssured.baseURI = "https://abi-conbees-orquestadordeals-tst.dev.abinbev-las.com";

		String response = given().queryParam("country", "AR").queryParam("entidadOrigen", "PDA")
				.header("Content-Type", "application/json").headers("Accept", "*/*")
				.headers("Accept-Encoding", "gzip, deflate, br").headers("Connection", "keep-alive")
				.headers("Authorization", "Bearer " + token).body("1").when().post("api/v1/deal/process").then()
				.statusCode(200).extract().response().asString();

		// System.out.println(response);
		// JsonPath js=new JsonPath(response); //for parsing Json
		// String placeId=js.getString("place_id");
		// System.out.println(placeId);

	}


	@Test
	public void asaaawr() {

	}

	@Test
	public void asaaar() {

	}

}