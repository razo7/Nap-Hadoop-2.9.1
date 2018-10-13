run() {
                        echo "\$ ${@}"
                        "${@}"
                        res=$?
                        if [ $res != 0 ]; then
                          echo
                          echo "Failed!"
                          echo
                          exit $res
                        fi
                      }

                      ROOT=`cd ../..;pwd`
                      echo
                      echo "Current directory `pwd`"
                      echo
                      run rm -rf hadoop-2.9.1
                      run mkdir hadoop-2.9.1
                      run cd hadoop-2.9.1
                      run cp $ROOT/LICENSE.txt .
                      run cp $ROOT/NOTICE.txt .
                      run cp $ROOT/README.txt .
                      run cp -r $ROOT/hadoop-common-project/hadoop-common/target/hadoop-common-2.9.1/* .
                      run cp -r $ROOT/hadoop-common-project/hadoop-nfs/target/hadoop-nfs-2.9.1/* .
                      run cp -r $ROOT/hadoop-hdfs-project/hadoop-hdfs/target/hadoop-hdfs-2.9.1/* .
                      run cp -r $ROOT/hadoop-hdfs-project/hadoop-hdfs-httpfs/target/hadoop-hdfs-httpfs-2.9.1/* .
                      run cp -r $ROOT/hadoop-common-project/hadoop-kms/target/hadoop-kms-2.9.1/* .
                      run cp -r $ROOT/hadoop-hdfs-project/hadoop-hdfs-nfs/target/hadoop-hdfs-nfs-2.9.1/* .
                      run cp -r $ROOT/hadoop-hdfs-project/hadoop-hdfs-client/target/hadoop-hdfs-client-2.9.1/* .
                      run cp -r $ROOT/hadoop-hdfs-project/hadoop-hdfs-native-client/target/hadoop-hdfs-native-client-2.9.1/* .
                      run cp -r $ROOT/hadoop-hdfs-project/hadoop-hdfs-rbf/target/hadoop-hdfs-rbf-2.9.1/* .
                      run cp -r $ROOT/hadoop-yarn-project/target/hadoop-yarn-project-2.9.1/* .
                      run cp -r $ROOT/hadoop-mapreduce-project/target/hadoop-mapreduce-2.9.1/* .
                      run cp -r $ROOT/hadoop-tools/hadoop-tools-dist/target/hadoop-tools-dist-2.9.1/* .
                      echo
                      echo "Hadoop dist layout available at: /home/hadoop2/intelliji_workspace/hadoop-2.9.1-src/hadoop-dist/target/hadoop-2.9.1"
                      echo