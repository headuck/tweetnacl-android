LOCAL_PATH := $(call my-dir)

# tweetnacl

include $(CLEAR_VARS)

LOCAL_MODULE    := tweetnacl
LOCAL_SRC_FILES := src/main/cpp/tweetnacl-jni.c src/main/cpp/tweetnacl.c src/main/cpp/devurandom.c
LOCAL_LDLIBS    := -llog 

include $(BUILD_SHARED_LIBRARY)

# tweetnacl/z

#include $(CLEAR_VARS)

#LOCAL_MODULE    := tweetnaclz
#LOCAL_SRC_FILES := src/main/cpp/tweetnaclz-jni.c src/main/cpp/tweetnacl.c src/main/cpp/devurandom.c
#LOCAL_LDLIBS    := -llog

#include $(BUILD_SHARED_LIBRARY)
