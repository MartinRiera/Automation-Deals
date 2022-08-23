import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import file.payload;
import io.restassured.RestAssured;

public class Resincronizacion {

	@Test
	public void CrearResincronizacionAR() {
		String token = Authentication.ObtenerToken();
		RestAssured.baseURI = "https://abi-conbees-orquestadordeals-tst.dev.abinbev-las.com";

		String response = given()

				.header("Content-Type", "application/json").headers("Accept", "*/*")
				.headers("Accept-Encoding", "gzip, deflate, br").headers("Connection", "keep-alive")
				.headers("Authorization", "Bearer " + token).body(payload.crearresincroAR()).when()
				.post("/api/v1/deal/resincronizar/").then().statusCode(201).extract().response().asString();

		// System.out.println(response);
	}

	@Test
	public void CrearResincronizacionUY() {
		String token = Authentication.ObtenerToken();
		RestAssured.baseURI = "https://abi-conbees-orquestadordeals-tst.dev.abinbev-las.com";

		String response = given()

				.header("Content-Type", "application/json").headers("Accept", "*/*")
				.headers("Accept-Encoding", "gzip, deflate, br").headers("Connection", "keep-alive")
				.headers("Authorization", "Bearer " + token).body(payload.crearresincroUY()).when()
				.post("/api/v1/deal/resincronizar/").then().statusCode(201).extract().response().asString();

		// System.out.println(response);
	}

	@Test
	public void CrearResincronizacionPY() {
		String token = Authentication.ObtenerToken();
		RestAssured.baseURI = "https://abi-conbees-orquestadordeals-tst.dev.abinbev-las.com";

		String response = given()

				.header("Content-Type", "application/json").headers("Accept", "*/*")
				.headers("Accept-Encoding", "gzip, deflate, br").headers("Connection", "keep-alive")
				.headers("Authorization", "Bearer " + token).body(payload.crearresincroPY()).when()
				.post("/api/v1/deal/resincronizar/").then().statusCode(201).extract().response().asString();

		// System.out.println(response);
	}

	@Test
	public void EjecutarresincroAR() {
		String token = Authentication.ObtenerToken();
		RestAssured.baseURI = "https://abi-conbees-orquestadordeals-tst.dev.abinbev-las.com";

		given().queryParam("country", "AR").header("Content-Type", "application/json").headers("Accept", "*/*")
				.headers("Accept-Encoding", "gzip, deflate, br").headers("Connection", "keep-alive")
				.headers("Authorization", "Bearer " + token).body("1").when()
				.post("/api/v1/deal/resincronizar/ejecutar").then().statusCode(200).extract().response().asString();

	}

	@Test
	public void EjecutarresincroUY() {
		String token = Authentication.ObtenerToken();
		RestAssured.baseURI = "https://abi-conbees-orquestadordeals-tst.dev.abinbev-las.com";

		given().queryParam("country", "UY").header("Content-Type", "application/json").headers("Accept", "*/*")
				.headers("Accept-Encoding", "gzip, deflate, br").headers("Connection", "keep-alive")
				.headers("Authorization", "Bearer " + token).body("1").when()
				.post("/api/v1/deal/resincronizar/ejecutar").then().statusCode(200).extract().response().asString();

	}

	@Test
	public void EjecutarresincroPY() {
		String token = Authentication.ObtenerToken();
		RestAssured.baseURI = "https://abi-conbees-orquestadordeals-tst.dev.abinbev-las.com";

		given().queryParam("country", "PY").header("Content-Type", "application/json").headers("Accept", "*/*")
				.headers("Accept-Encoding", "gzip, deflate, br").headers("Connection", "keep-alive")
				.headers("Authorization", "Bearer " + token).body("1").when()
				.post("/api/v1/deal/resincronizar/ejecutar").then().statusCode(200).extract().response().asString();

	}

	@Test
	public void CrearResincosinPais() {
		String token = Authentication.ObtenerToken();
		RestAssured.baseURI = "https://abi-conbees-orquestadordeals-tst.dev.abinbev-las.com";
		String response = given()

				.header("Content-Type", "application/json").headers("Accept", "*/*")
				.headers("Accept-Encoding", "gzip, deflate, br").headers("Connection", "keep-alive")
				.headers("Authorization", "Bearer " + token).body(payload.crearresincrosinpaís()).when()
				.post("/api/v1/deal/resincronizar/").then().statusCode(400).extract().response().asString();
	}

	@Test
	public void CrearResincosinClientes() {
		String token = Authentication.ObtenerToken();
		RestAssured.baseURI = "https://abi-conbees-orquestadordeals-tst.dev.abinbev-las.com";
		String response = given()

				.header("Content-Type", "application/json").headers("Accept", "*/*")
				.headers("Accept-Encoding", "gzip, deflate, br").headers("Connection", "keep-alive")
				.headers("Authorization", "Bearer " + token).body(payload.crearresincrosinclientes()).when()
				.post("/api/v1/deal/resincronizar/").then().statusCode(400).extract().response().asString();
	}

}
