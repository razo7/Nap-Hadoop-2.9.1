/**
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
#ifndef CONFIG_H
#define CONFIG_H

/* custom configs */

#define HADOOP_CONF_DIR "../etc/hadoop"

/* #undef HADOOP_CONF_DIR_IS_ABS */

/* specific functions */

#define HAVE_CANONICALIZE_FILE_NAME 1
#define HAVE_FCHMODAT 1
#define HAVE_FCLOSEALL 1
#define HAVE_FDOPENDIR 1
#define HAVE_FSTATAT 1
#define HAVE_OPENAT 1
#define HAVE_SYSCTL 1
#define HAVE_UNLINKAT 1


/* specific headers */

#define HAVE_SYS_SYSCTL_H 1

#endif
