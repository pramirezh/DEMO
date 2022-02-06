@ECHO OFF
REM *************************************
REM  Ejemplo con versiones no vulnerables.
REM *************************************

REM CLASSPATH con las versiones no vulnerables.
SET CLASSPATH=apache-log4j-2.17.1-bin\log4j-core-2.17.1.jar;apache-log4j-2.17.1-bin\log4j-api-2.17.1.jar

REM Ejecuto el ejemplo.
java -Dlog4j2.formatMsgNoLookups=true Log4ShellEjemplo1.java
PAUSE

