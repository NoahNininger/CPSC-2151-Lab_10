default: cpsc2150/listDec/*.java
	javac cpsc2150/listDec/*.java

run: cpsc2150/listDec/*.java
	java cpsc2150/listDec/ShuffleApp

clean:
	rm -f cpsc2150/listDec/*.class