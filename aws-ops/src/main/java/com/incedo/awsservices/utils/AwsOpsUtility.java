package com.incedo.awsservices.utils;

import com.amazonaws.services.ec2.model.KeyPair;

import java.io.*;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class AwsOpsUtility {

    public static void storePEMFile(KeyPair keyPair) throws IOException {
        String fileName="f:/"+keyPair.getKeyName()+ ".pem";
        File distFile = new File(fileName);
        BufferedReader bufferedReader = new BufferedReader(new StringReader(keyPair.getKeyMaterial()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(distFile));
        char buf[] = new char[1024];
        int len;
        while ((len = bufferedReader.read(buf)) != -1) {
            bufferedWriter.write(buf, 0, len);
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
