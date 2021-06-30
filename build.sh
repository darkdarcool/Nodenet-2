clear
cd Nodenet
printf "Compiling..."
javac -d bin src/me/darkdarcool/nodenet/*.java src/me/darkdarcool/nodenet/utils/types/*.java
if [ $? == 0 ] 
then
    clear
    java -cp bin me.darkdarcool.nodenet.Main how
else
    printf "\n\n\nError - Exit code $?"
    echo
fi