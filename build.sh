#!/usr/bin/env bash
clear
cd Nodenet
printf "Compiling..."
javac -d bin src/me/darkdarcool/nodenet/*.java src/me/darkdarcool/nodenet/utils/types/*.java src/me/darkdarcool/nodenet/commands/*.java
if [ $? == 0 ] 
then
    clear
    java -cp bin me.darkdarcool.nodenet.Main test
else
    printf "\n\n\nError - Exit code $?"
    echo
fi
