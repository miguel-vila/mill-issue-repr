#!/usr/bin/env sh
version=$1

./mill --mill-version $version __.clean
./mill --mill-version $version show foo.testTask > "out-$version.txt"
