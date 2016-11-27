# A simple Makefile for the GCD program                                         
GCD: GCD.o
	gcc -o GCD.c

GCD.o: GCD.c
	gcc -o GCD GCD.c
clean:
	rm -f GCD.o GCD

submit: Makefile GCD.c
	submit cmps012a-pt.w16 lab8 Makefile GCD.c
