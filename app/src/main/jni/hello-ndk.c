#include <jni.h>


JNIEXPORT jstring JNICALL Java_com_example_suyouxiong_awesomendk_MainActivity_getStringNative(JNIEnv *env,
        jobject instance) {

    return (*env)->NewStringUTF(env, "Hello from JNI !");
}