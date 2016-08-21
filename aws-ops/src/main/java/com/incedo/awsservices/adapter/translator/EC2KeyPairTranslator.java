package com.incedo.awsservices.adapter.translator;

import com.amazonaws.services.ec2.model.KeyPair;
import com.incedo.awsservices.coremodel.KeyPairModel;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class EC2KeyPairTranslator {

    public static KeyPairModel transform(KeyPair keyPair) {
        return new KeyPairModel() {
            {
                setKeyName(keyPair.getKeyName());
                setKeyFingerprint(keyPair.getKeyFingerprint());
                setKeyMaterial(keyPair.getKeyMaterial());
            }
        };
    }
}
