## Simple anagram checker for texts

This is a simple console app that checks if two given strings are anagram. 

The app uses simple command line interface. After launching the application, it asks you to enter two strings. 
Right after you submitted the second line by pressing **Enter** the app will check if the these strings are anagram. 
Once the check has ended the app will print *true* or *false* depending on your input.

The solution check if strings are anagrams only using latin characters. It ignores symbols and numeric literals.
Anagram example from unit test case:
`"William Shakespeare" and "I am a weakish speller"`

#### Launching the app
If you use Unix based operating system, you may need to fix gradlew file using this command  
```shell
sed -i.bak 's/\r$//' gradlew
```
The application can be launched using gradle command
```shell
./gradlew run
```
Otherwise, you can build jar file using command
```shell
./gradlew build
```
Then launch it using 
```shell
java -jar build/libs/JavaTest-1.0.0.jar 
``` 

#### Unit tests
The solution is covered by unit tests. To check the correctness of the solution you can launch
```shell
./gradlew test
```