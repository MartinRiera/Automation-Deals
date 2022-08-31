import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;



public class Authentication {

	// LOGIN

	public static String ObtenerToken() {
		RestAssured.baseURI = "https://login.microsoftonline.com";

		String respuestaLogin = RestAssured.given().with().headers("Cookie",
				"fpc=AtqSCVehDsxPuEZu98aYmZaGIV0qAQAAAHjDedoOAAAA; stsservicecookie=estsfd; x-ms-gateway-slice=estsfd")
				.headers("Accept", "*/*").headers("Accept-Encoding", "gzip, deflate, br")
				.headers("Connection", "keep-alive").contentType("application/x-www-form-urlencoded")
				.formParam("grant_type", "client_credentials")
				.formParam("client_id", "31f34f3c-0273-44be-992a-f73e40d53ea2")
				.formParam("client_secret", "RCd7Q~DatGja2oV~kWFxA01yyMeYFuprg_9Zy")
				.formParam("scope", "api://7e467100-fb19-4d21-908a-80ca3096b546/.default")
				.post("/cef04b19-7776-4a94-b89b-375c77a8f936/oauth2/v2.0/token").then().assertThat().statusCode(200)
				.extract().asString();

		JsonPath js = new JsonPath(respuestaLogin); // for parsing Json
		String token = js.getString("access_token");
		// System.out.println(token);
		return token;
	}
}
