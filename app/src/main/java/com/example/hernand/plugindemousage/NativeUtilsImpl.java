package com.example.hernand.plugindemousage;

public class NativeUtilsImpl {

    static {
        System.loadLibrary("native-lib");
    }

    public native String getPrivateKeyNative();

    public native String getPrivateKey2Native();

}
