package TestCases;

import Routes.routes;
import Utils.configReader;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeClass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Baseclass {
    configReader configReader;
    RequestLoggingFilter requestLoggingFilter;
    ResponseLoggingFilter responseLoggingFilter;

    @BeforeClass
    public void setUp() throws FileNotFoundException
    {
        RestAssured.baseURI = routes.BASE_URL;
        configReader = new configReader();

        // Setup filters for logging

        System.out.println(System.getProperty("user.dir"));

        FileOutputStream fos = new FileOutputStream(".\\Logs\\test_logging.txt");
        PrintStream log = new PrintStream(fos, true);

        requestLoggingFilter = new RequestLoggingFilter(log);
        responseLoggingFilter = new ResponseLoggingFilter(log);

        RestAssured.filters(requestLoggingFilter, responseLoggingFilter);
    }

}


