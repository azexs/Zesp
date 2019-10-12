# DefaultApi

All URIs are relative to *http://localhost:7000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGet**](DefaultApi.md#addGet) | **GET** /add | 

<a name="addGet"></a>
# **addGet**
> String addGet(a, b)



returns sum of two numbers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | **Float**| first number |
 **b** | **Float**| second number |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

