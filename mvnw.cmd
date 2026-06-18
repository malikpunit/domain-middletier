@echo off
set MAVEN_WRAPPER_VERSION=0.5.6
setlocal
set SCRIPT_DIR=%~dp0
set WRAPPER_DIR=%SCRIPT_DIR%\.mvn\wrapper
set JAR=%WRAPPER_DIR%\maven-wrapper.jar
set DIST_URL=https://archive.apache.org/dist/maven/maven-3/3.9.16/binaries/apache-maven-3.9.16-bin.zip
set DIST_ZIP=%WRAPPER_DIR%\apache-maven-3.9.16-bin.zip
set DIST_DIR=%WRAPPER_DIR%\apache-maven-3.9.16
set MVN_BIN=%DIST_DIR%\bin\mvn.cmd

if not exist "%MVN_BIN%" (
  echo Bootstrapping Apache Maven 3.9.16...
  if not exist "%DIST_ZIP%" (
    powershell -Command "(New-Object System.Net.WebClient).DownloadFile('%DIST_URL%','%DIST_ZIP%')"
  )
  powershell -Command "Add-Type -AssemblyName System.IO.Compression.FileSystem; [IO.Compression.ZipFile]::ExtractToDirectory('%DIST_ZIP%','%WRAPPER_DIR%')"
)

"%MVN_BIN%" %*
