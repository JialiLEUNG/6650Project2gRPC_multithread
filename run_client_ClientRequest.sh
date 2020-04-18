#!/usr/bin/env bash

cur_path=`pwd`
echo ${cur_path}
java -jar \
${cur_path}/out/artifacts/Client_jar/project2Jelly.jar ${cur_path}/src/main/java/ClientRequest.txt