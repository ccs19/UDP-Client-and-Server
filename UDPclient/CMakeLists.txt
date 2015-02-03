cmake_minimum_required(VERSION 2.8.4)


set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wall")

set(SOURCE_FILES UDPclient.c)
add_executable(UDPclient ${SOURCE_FILES})