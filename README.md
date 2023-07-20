# SOAP_Sample
Sample for implementing two SOAP web services:  
1-Calculator Webservice  
2-BLZ Webservice

## Endpoints:
For Calculator web service:  
````
POST: http://localhost:8080/invoke
Request body:  
{
      "intA" : "1",
      "intB" : "1"
}
````

For BLZ web service:  
````
GET: http://localhost:8080/blz/invoke?code=46062817
````
