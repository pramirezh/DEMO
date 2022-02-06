@ECHO OFF
REM *************************************
REM  Ejemplo con versiones vulnerables con log en archivo.
REM *************************************

REM CLASSPATH con las versiones vulnerables.
SET CLASSPATH=apache-log4j-2.14.1-bin\log4j-core-2.14.1.jar;apache-log4j-2.14.1-bin\log4j-api-2.14.1.jar

REM Ejecuto el ejemplo.
java -Dlog4j.configurationFile=Log4ShellEjemplo2.properties Log4ShellEjemplo1.java
PAUSE

