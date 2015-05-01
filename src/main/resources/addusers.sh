#!/usr/bin/env bash
# Author: Marcelo Velloso

# Arguments.
USERNAME=$1
PASSWD=$2
FILE=$3

# Read records from file
declare -a hosts

readarray -t hosts < ${FILE}

# Iterating through hosts.txt
let i=0

while (( ${#hosts[@]} > i )); do

	echo "Processing host ${hosts[i]}"
	ssh "root@${hosts[i++]}"

done
