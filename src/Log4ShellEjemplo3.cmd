@ECHO OFF
REM *************************************
REM  Ejemplo con versiones vulnerables, con LookUps desactivados.
REM *************************************

REM CLASSPATH con las versiones vulnerables.
SET CLASSPATH=apache-log4j-2.14.1-bin\log4j-core-2.14.1.jar;apache-log4j-2.14.1-bin\log4j-api-2.14.1.jar

REM Ejecuto el ejemplo.
java -Dlog4j2.formatMsgNoLookups=true Log4ShellEjemplo1.java
PAUSE

