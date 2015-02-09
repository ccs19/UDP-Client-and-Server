CC = gcc
CFLAGS = -g -Wall
SERVEROBJECTS = UDPserver.c
CLIENTOBJECTS = UDPclient.c UDPmain.c
SERVERNAME = UDPserver
CLIENTNAME = UDPclient
TODELETE = $(SERVERNAME) $(CLIENTNAME) *.o
LIBS = -lpthread

all: $(SERVERNAME) $(CLIENTNAME)

$(SERVERNAME): $(SERVEROBJECTS)
	$(CC) $(CFLAGS) $(SERVEROBJECTS) -o $(SERVERNAME) $(LIBS)

$(CLIENTNAME): $(CLIENTOBJECTS)
	$(CC) $(CFLAGS) $(CLIENTOBJECTS) -o $(CLIENTNAME)

.PHONY: clean
clean:
	rm -f $(TODELETE)