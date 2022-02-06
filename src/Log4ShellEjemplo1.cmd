@ECHO OFF
REM *************************************
REM  Ejemplo con versiones vulnerables.
REM *************************************

REM CLASSPATH con las versiones vulnerables.
SET CLASSPATH=apache-log4j-2.14.1-bin\log4j-core-2.14.1.jar;apache-log4j-2.14.1-bin\log4j-api-2.14.1.jar

REM Ejecuto el ejemplo.
java Log4ShellEjemplo1.java
PAUSE

