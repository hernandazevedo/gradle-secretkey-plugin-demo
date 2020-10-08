#include <jni.h>
#include <string>
#include "include/native-lib-config.h"

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_hernand_plugindemousage_NativeUtilsImpl_getPrivateKeyNative(JNIEnv *env, jobject
thiz) {
    return env->NewStringUTF(PRIVATE_KEY);
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_hernand_plugindemousage_NativeUtilsImpl_getPrivateKey2Native(JNIEnv *env, jobject
thiz) {
    return env->NewStringUTF(PRIVATE_KEY2);
}