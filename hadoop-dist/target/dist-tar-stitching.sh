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

                      run tar cf hadoop-2.9.1.tar hadoop-2.9.1
                      run gzip -f hadoop-2.9.1.tar
                      echo
                      echo "Hadoop dist tar available at: /home/hadoop2/intelliji_workspace/hadoop-2.9.1-src/hadoop-dist/target/hadoop-2.9.1.tar.gz"
                      echo