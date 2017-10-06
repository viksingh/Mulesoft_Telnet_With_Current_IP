# Mulesoft_Telnet_With_Current_IP
Show IP address of mule worker and do a telnet test to a server and port

Steps are :

- Create a muleflow

- Have a HTTP listener

- Put a Java component and use the code in the attached Java program.

- So flow is ( HTTP component)  -> ( Java component ) 

- As usual for deploying to cloud, change the property port to ${http.port} . For local testing, a local port ( 8083 ) can be used .
