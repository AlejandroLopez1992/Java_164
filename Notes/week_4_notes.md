## Operating Systems

- You use them daily, most common OS in the world is Android
  - written in Java w/kotlin

- The control
  - Resources
  - Hardware interaction
  - Devices
  - Running applications, memory, ect,
  - Files
    - File Systems
      - Program that helps manage files and other programs
      - Directory structures
        - Relative
          - Based on current location
        - Absolute
          - Based on Root, the top of the hierarchy
      - Key "shortcuts"
        - . (yes dot) - current Directory- 
        - .. (directory above directory)
        - these dot shortcuts need to be followed by a / example: "../.."
      
      - Example of file structure:
      - Root -c:/ or /
        - File
        - Directory -A
          - File
        - Directory - B
          - File

### Java Compilation
  - Java files must be compiled before being used
    - "javac FileToCompile.jave

  - "Javac" is the Java Compiler tool that takes the code files and tuens them into executable ".class" files
    - IDE's like VSCode and IntelliJ handle the compilation for you.
    - Once compuled the main of a file can be executed by using the hava program itself
      - java ClassNameToRun
    - So if you had a main inside of a class called "CodeTester" then youre commands would look like
      - javac CodeTester.java
      - java CodeTester 
  
### Compressing files
  - ZIP files
    - A compressed file with instructions to uncompress
    - In most cases creating a zip is as easy as 1,2,3
      - Select the files you want to ZIP
      - Right Click and select "Compress to" (Windows) or Control + CLick and select "Compress" (MAC)
    - Make sure that when you are compressing files for the asignements that you tdo the follwing
      - Ensure te file and Class names are correct for the assignment
        - Dog.java and "public class Dog" vs dog.java and "public class dog"
        - Select the files not the FOLDER

    - PERSONAL ASSIGNMENT- Learn how to ZIP files with terminal commands
      - The syntax is 'zip -r <zip file name> <directory name>'. The '-r' option tells zip to include files/folders in sub-directories.
      -  For example: zip -r readyToUpload.zip "My Files for Copyright Registration"
         - Use quotes around the zip file or folder name if the name contains any spaces.
      - For archives bigger than 2gb
        - Command line (Linux or Mac)
          - If you are comfortable using the Linux or Mac command line, the zip program just requires one small change to the command above:
          zip -r -s 2g <zip file> <directory name>

          - The "-s 2g" option tells zip to split the archive into chunks of 2GiB size;
          e.g. zip -r -s 2g readyToUpload.zip “My Files for Copyright Registration”

          - If you want to test the result, unzipping split archives, takes a little more effort, as 2 commands are needed; one to unsplit and one to unzip:
          e.g. zip -s 0 split.zip --out unsplit.zip; unzip unsplit.zip.



