# Nap-Hadoop-2.9.1

Network-Aware, modified, version of Hadoop 2.9.1 used for Nap (see more [@here](https://github.com/razo7/Nap)).

## Table of contents
* [Motivation](#Introduction)
* [Technologies](#technologies)
* [Modification & Compilation](#Launch)
* [Contact](#Contact)


## Motivation
Write the map and reduce __containers locations__ (the node for each container/task) to HDFS and LOG.

The modification is writing these locations in Hadoop LOG, and under "/mappersLocations" or "/reducersLocations" directory respectively, when the NameNode computer has to be "called" (has an hostname) _master_.
 
## Technologies
* Hadoop 2.9.1

## Modification & Compilation

### Writing Containers Location
The three changes in Hadoop source code has been done only in ```Nap-Hadoop-2.9.1/hadoop-mapreduce-project/hadoop-mapreduce-client/hadoop-mapreduce-client-app/src/main/java/org/apache/hadoop/mapreduce/v2/app/rm/RMContainerAllocator.java```, and they are:

+ Before the _constructor function_, add four imports for the use of HDFS, URI and a flag for starting or stoping the writing to HDFS
+ In _heartbeat() function_ check if all the mappers and reducers have been allocated, then find their locations by going over the requested _LinkedHashMap_, and write to HDFS in "/mappersLocations" or "/reducersLocations" directory.
In addition, write to LOG every heartbeat the status of the mappers and reducers location.
+ In _assignContainers(List<Container> allocatedContainers) function_ write to LOG the amount of mappers and reducers before the assignment of the task to nodes (slaves). After the assignment write to LOG the locations of the mappers and reducers.

All of the above changes can be easily found before **"OR_Change"** comment at each line.
### Compilation 
1. Download Hadoop source code from [@here](https://hadoop.apache.org/releases.html) or clone this project.
2. Make the changes in the desired java files, i.e., _RMContainerAllocator.java_.
3. Install cmake, Google protocol buffers (Proto buf 2.5), and Maven (for compiling).
4. Run one of the following codes under the hadoop-project directory (Nap-Hadoop-2.9.1/hadoop-project/):

```
mvn clean install -Pdist -Pnative -Dtar -DskipTests 
mvn package -Pdist,native -DskipTests -Dtar
```

## Contact
Created by Or Raz (razo7) as part of my master's thesis work and my [@article](IEEE.com) - feel free to contact me on Linkedin [@Or Raz](https://www.linkedin.com/in/or-raz/) or [@Email](razo@post.bgu.ac.il)!

Examples of use
Sources

