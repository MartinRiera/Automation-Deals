package file;

public class payload {

public static String Deal()
	
	{
		return "{\r\n"
				+ "    \"eventType\": \"POST\",\r\n"
				+ "    \"policyId\": 445,\r\n"
				+ "    \"dealId\": \"Automatico001\",\r\n"
				+ "    \"priority\": \"10285\",\r\n"
				+ "    \"budget\": 10,\r\n"
				+ "    \"subregionBudgetId\": 188,\r\n"
				+ "    \"areaId\": 2282,\r\n"
				+ "    \"subregionId\": 146,\r\n"
				+ "    \"businessUnitId\": 1,\r\n"
				+ "    \"urlBeesImage\":\"image.jpg\",\r\n"
				+ "	\"country\":\"ARG\",\r\n"
				+ "    \"subregionBudgetPeriod\": {\r\n"
				+ "        \"startDate\": \"2022-02-01\",\r\n"
				+ "        \"endDate\": \"2022-05-31\"\r\n"
				+ "    },\r\n"
				+ "    \"politics\": {\r\n"
				+ "        \"title\": \"Caso 1 JSON\",\r\n"
				+ "        \"description\": \"Caso 1 - Un producto escala simple\",\r\n"
				+ "        \"satelliteSystem\": {\r\n"
				+ "            \"beesPrice\": true,\r\n"
				+ "            \"priceEngine\": true,\r\n"
				+ "            \"qfijo\": true,\r\n"
				+ "            \"bees\": {\r\n"
				+ "                \"title\": \"¡Aprovechá el [desc]% off!\",\r\n"
				+ "                \"description\": \"Obtené un [desc]% de descuento llevando a partir de X bultos\"\r\n"
				+ "            },\r\n"
				+ "            \"actionLimits\": {\r\n"
				+ "                \"limitPerAction\": 10,\r\n"
				+ "                \"limitPerClient\": {\r\n"
				+ "                    \"limit\": 10,\r\n"
				+ "                    \"unlimited\": false\r\n"
				+ "                },\r\n"
				+ "                \"ordersPerClient\": {\r\n"
				+ "                    \"orders\": 999999,\r\n"
				+ "                    \"unlimited\": true\r\n"
				+ "                }\r\n"
				+ "            }\r\n"
				+ "        },\r\n"
				+ "        \"period\": {\r\n"
				+ "            \"startDate\": \"2022-04-20\",\r\n"
				+ "            \"endDate\": \"2022-04-29\"\r\n"
				+ "        },\r\n"
				+ "        \"policyType\": \"E\",\r\n"
				+ "        \"tipify\": 10\r\n"
				+ "    },\r\n"
				+ "    \"products\": {\r\n"
				+ "        \"fictitiousCode\": \"50003\",\r\n"
				+ "        \"discountAccumulation\": \"S\",\r\n"
				+ "        \"bonifications\": {},\r\n"
				+ "        \"listOfProducts\": [\r\n"
				+ "            {\r\n"
				+ "                \"lumpsAmount\": 0,\r\n"
				+ "                \"businessUnit\": 1,\r\n"
				+ "				\"product\": [\r\n"
				+ "                    {\r\n"
				+ "                        \"idSku\": 7026\r\n"
				+ "                    }\r\n"
				+ "]\r\n"
				+ "\r\n"
				+ "            }\r\n"
				+ "        ],\r\n"
				+ "        \"listOfDiscounts\": [\r\n"
				+ "            {\r\n"
				+ "                \"comboMin\": 1,\r\n"
				+ "                \"comboMax\": 999999,\r\n"
				+ "                \"unlimited\": true,\r\n"
				+ "                \"discount\": \"15.0\"\r\n"
				+ "            }\r\n"
				+ "        ],\r\n"
				+ "        \"amountTypeProduct\": \"CM\",\r\n"
				+ "        \"minQuantity\": 1,\r\n"
				+ "        \"productsCombo\": true\r\n"
				+ "    },\r\n"
				+ "        \"customers\": [\r\n"
				+ "	312594,\r\n"
				+ "	365299,\r\n"
				+ "	377427,\r\n"
				+ "	391319,\r\n"
				+ "	404828,\r\n"
				+ "	404848,\r\n"
				+ "	404859,\r\n"
				+ "	404860,\r\n"
				+ "	404862,\r\n"
				+ "	405874,\r\n"
				+ "	412655,\r\n"
				+ "	413530,\r\n"
				+ "	413534,\r\n"
				+ "	413586,\r\n"
				+ "	413773,\r\n"
				+ "	413867,\r\n"
				+ "	424707,\r\n"
				+ "	434481,\r\n"
				+ "	435530,\r\n"
				+ "	438199,\r\n"
				+ "	446802,\r\n"
				+ "	449653,\r\n"
				+ "	449782,\r\n"
				+ "	455995,\r\n"
				+ "	881764\r\n"
				+ "    ],\r\n"
				+ "    \"creationDate\": \"2022-05-05\",\r\n"
				+ "    \"executeESBDate\": \"2020-05-06T10:30:00.910Z\"\r\n"
				+ "}";
		
		
	}
public static String crearresincroAR()
{
	return "{\r\n"
			+ "    \"country\": \"AR\",\r\n"
			+ "    \"customers\": [1,2,3,567]\r\n"
			+ "}";
}
public static String crearresincroUY()
{
	return "{\r\n"
			+ "    \"country\": \"UY\",\r\n"
			+ "    \"customers\": [11,12,13,1567]\r\n"
			+ "}";
}
public static String crearresincroPY()
{
	return "{\r\n"
			+ "    \"country\": \"PY\",\r\n"
			+ "    \"customers\": [21,22,23,2567]\r\n"
			+ "}";
}
public static String crearresincrosinclientes()
{
	return "{\r\n"
			+ "    \"country\": \"AR\",\r\n"
			+ "    \"customers\": []\r\n"
			+ "}";
}
public static String crearresincrosinpaís()
{
	return "{\r\n"
			+ "    \"country\": \"\",\r\n"
			+ "    \"customers\": [1,2,3,567]\r\n"
			+ "}";
}
}