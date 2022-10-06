package APILeve2;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FirstAPI {
    private static final String BASE_URL = "https://api-2.atlassian.net";

    // In this test, we are going to test a GET API and validate the Response
    @Test
    public void sendAPostRequestCreateIssue() {
        given()
                .header("Authorization", "Basic dHJpbmguZG9AbG9naWdlYXIuY29tOmhPWHg1eUJFY0pURUl2NnBkUERjNjY1NQ==")
                .accept("application/json")
                .contentType("application/json")
                .body("{\n" +
                        "    \"fields\": {\n" +
                        "        \"project\": {\n" +
                        "            \"id\": \"10000\"\n" +
                        "        },\n" +
                        "        \"issuetype\": {\n" +
                        "            \"id\": \"10001\"\n" +
                        "        },\n" +
                        "        \"summary\": \"issue manual\",\n" +
                        "        \"labels\": [],\n" +
                        "        \"reporter\": {\n" +
                        "            \"id\": \"626556f6a32183006f22a163\"\n" +
                        "        },\n" +
                        "        \"customfield_10021\": []\n" +
                        "    },\n" +
                        "    \"update\": {}\n" +
                        "}")
                .post(BASE_URL + "/rest/api/2/issue")
                .then()
                .statusCode(201); // It verify the actual response code with the given code
    }
}
