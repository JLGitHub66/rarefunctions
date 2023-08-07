#!/bin/bash
cd linux-5.19.9

count=1

while read LINE
do
echo $count
let count++
eval $LINE
done < /RSFF/BugDetector/staticAnalyse-cmd.txt
