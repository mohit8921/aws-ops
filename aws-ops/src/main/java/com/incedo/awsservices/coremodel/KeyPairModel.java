package com.incedo.awsservices.coremodel;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class KeyPairModel {

    private String keyName;
    private String keyFingerprint;
    private String keyMaterial;

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getKeyFingerprint() {
        return keyFingerprint;
    }

    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }

    public String getKeyMaterial() {
        return keyMaterial;
    }

    public void setKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
    }
}
