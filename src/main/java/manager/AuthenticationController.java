package manager;

import dto.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.BaseAPI;

import static io.restassured.RestAssured.given;
import static utils.PropertiesReader.*;

public class AuthenticationController implements BaseAPI {

    public Response requestRegLogin(User user, String url) {
        return given()
                .baseUri(getProperty("login.properties", "baseUri"))
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)      // Content-type : App/json
                .body(user)
                .when()
                .post(url)
                .thenReturn()
                ;
    }


}
