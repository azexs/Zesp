import io.swagger.client.*;
import io.swagger.client.auth.*;

import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {

        DefaultApi apiInstance = new DefaultApi();
        Float a = 3.4F; // Float | first number
        Float b = 3.4F; // Float | second number
        try {
            String result = apiInstance.addGet(a, b);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#addGet");
            e.printStackTrace();
        }
    }
}