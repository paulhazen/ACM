#!/bin/bash 

# Constants
BASH_RC="$HOME/.bashrc"
BASH_PROFILE="$HOME/.bash_profile"

# The following (commented) code gets the current directory of
# this script, wherever it is in the system.
problems_root="$(dirname "$PWD")"

# HELPER_DIR is the relative path to the directory that stores
# the helper jar files for practice problems.
helper_dir="${problems_root}/ACM/Helper/src";

file_to_edit="";
new_file_needed=true

# Check to see which of the profile files should be changed
if [ -a ${BASH_PROFILE} ]; then 
	file_to_edit=$BASH_PROFILE
	new_file_needed=false
else
	if [ -a ${BASH_RC} ]; then
		file_to_edit=${BASH_RCi}
		new_file_needed=false
	else
		file_to_edit=${BASH_PROFILE}
	fi 
fi

# If neither of the preference files have been created, then
# create a new file
if $new_file_needed ; then
	touch "$file_to_edit"
fi

# This is the line that will be added to the end of either
# of the preference files
new_path="export PATH=$PATH:${helper_dir}"
new_class_path="export CLASSPATH=$CLASSPATH:${helper_dir}"

append_path="$(echo ${new_path} >> ${file_to_edit})"
append_class="$(echo ${new_class_path} >> ${file_to_edit})"

$append_class
$append_path
