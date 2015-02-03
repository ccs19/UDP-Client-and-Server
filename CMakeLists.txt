cmake_minimum_required(VERSION 2.8.4)
project(sysnet2p2)

add_subdirectory(./UDPclient)
add_subdirectory(./UDPserver)

set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wall")

set(SOURCE_FILES SampleUDPserver.c)
add_executable(SampleUDPserver ${SOURCE_FILES})