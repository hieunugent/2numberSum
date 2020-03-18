JAVAC	=javac
JAVA =java
JFLAGS	=-g

default: clean complier run
complier:
		$(JAVAC)	$(JFLAGS) *.java
clean:
		rm -f *.class
run:
	$(JAVA)	TestRunner
