echo off
set @arg1=%1
ECHO %@arg1%
set @javafile=%@arg1%.java
ECHO %@javafile%
javac -d C:/Users/yaweiw/java/build ./mypack/*.java %@javafile%