/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_apache_hadoop_net_unix_DomainSocketWatcher */

#ifndef _Included_org_apache_hadoop_net_unix_DomainSocketWatcher
#define _Included_org_apache_hadoop_net_unix_DomainSocketWatcher
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     org_apache_hadoop_net_unix_DomainSocketWatcher
 * Method:    anchorNative
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_org_apache_hadoop_net_unix_DomainSocketWatcher_anchorNative
  (JNIEnv *, jclass);

/*
 * Class:     org_apache_hadoop_net_unix_DomainSocketWatcher
 * Method:    doPoll0
 * Signature: (ILorg/apache/hadoop/net/unix/DomainSocketWatcher/FdSet;)I
 */
JNIEXPORT jint JNICALL Java_org_apache_hadoop_net_unix_DomainSocketWatcher_doPoll0
  (JNIEnv *, jclass, jint, jobject);

#ifdef __cplusplus
}
#endif
#endif