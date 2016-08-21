package com.incedo.awsservices.webDtoMapper;

import com.incedo.awsservices.coremodel.KeyPairModel;
import com.incedo.awsservices.webdto.KeyPairDto;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class KeyPairDtoMapper {

    public static KeyPairDto map(KeyPairModel keyPairModel) {
        return new KeyPairDto() {
            {
                keyName = keyPairModel.getKeyName();
                keyFingerprint = keyPairModel.getKeyFingerprint();
                keyMaterial = keyPairModel.getKeyMaterial();
            }
        };
    }
}
