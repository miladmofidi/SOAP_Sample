# SOAP Sample In Java
Sample for implementing two SOAP web services with two methods:  
1-Calculator Webservice  
2-BLZ Webservice

## Endpoints:
### For Calculator web service:  
Request:
```
curl http://localhost:8080/blz/invoke?code=46062817
````
Response:
````
StatusCode        : 200
StatusDescription :
Content           : {"bezeichnung":"Volksbank Schmallenberg","bic":"GENODEM1SMA","ort":"Schmallenberg","plz":"57377"}
RawContent        : HTTP/1.1 200
                    Transfer-Encoding: chunked
                    Keep-Alive: timeout=60
                    Connection: keep-alive
                    Content-Type: application/json
                    Date: Thu, 20 Jul 2023 13:31:23 GMT

                    {"bezeichnung":"Volksbank Schmallenber...
Forms             : {}
Headers           : {[Transfer-Encoding, chunked], [Keep-Alive, timeout=60], [Connection, keep-alive], [Content-Type,
                    application/json]...}
Images            : {}
InputFields       : {}
Links             : {}
ParsedHtml        : mshtml.HTMLDocumentClass
RawContentLength  : 97
````

### For BLZ web service:  
Request:
````
curl -X POST -H "Content-Type: application/json" -d '{"intA":1,"intB":3}' http://localhost:8080/invoke
````
Response:
````
StatusCode        : 200
StatusDescription :
Content           : {"addResult":4}
RawContent        : HTTP/1.1 200
                    Transfer-Encoding: chunked
                    Keep-Alive: timeout=60
                    Connection: keep-alive
                    Content-Type: application/json
                    Date: Thu, 20 Jul 2023 13:42:45 GMT

                    {"addResult":4}
Forms             : {}
Headers           : {[Transfer-Encoding, chunked], [Keep-Alive, timeout=60], [Connection, keep-alive], [Content-Type, application/json]...}
Images            : {}
InputFields       : {}
Links             : {}
ParsedHtml        : mshtml.HTMLDocumentClass
RawContentLength  : 15
````
