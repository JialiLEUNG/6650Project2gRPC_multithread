# 6650Project2gRPC_multithread
There are two ways to run the project:

The first way is to run the bash:
(1) run the run_server.sh to start the server
You should be see the following:
Server started at 9090

(2) run the client shell scripts:
There are four test run files to choose from:

a. To run the test with all PUT, GET, DELETE operations,
run the run_client_clientRequest.sh

b. To run the test with PUT only, 
run the run_client_ClientRequestPutOnly.sh

c. To run the test with GET only,
run the run_client_ClientRequestGetOnly.sh

c. To run the test with DELETE only,
run the run_client_ClientRequestDeleteOnly.sh


The second way is to run the main methods:
(1) start by running the KeyValStoreServer.java
(2) then run the KeyValStoreThreadPool with argument of the path directory of the test files
The test files can be seen in the src/main/java folder




