#!/bin/bash

export MAIN="src/main/java"
export TEST="src/test/java"
export GRAMMAR="src/main/antlr4"
gradle build installApp --rerun-tasks
phi
