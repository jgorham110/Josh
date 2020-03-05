package models;

import interfaces.IStringEncryptable;

public class Cutter implements IStringEncryptable {
    public String eNewString = "";
    public String s1 = "";
    public String s2 = "";
    public String dNewString = "";

    @Override
    public String encrypt(String phraseToEncrypt) {
        char[] eC = phraseToEncrypt.toCharArray();
        for (int i = 0; i < eC.length; i++) {
            if (i >= (eC.length / 2)) {
                s2 = s2 + eC[i];
            } else {
                s1 = s1 + eC[i];
            }
        }
        eNewString = s2 + s1;
        return eNewString;
    }

    @Override
    public String decrypt(String phraseToDecrypt) {
        char[] dC = phraseToDecrypt.toCharArray();
        for (int i = 0; i < dC.length; i++) {
            if (i >= (dC.length / 2)) {
                s1 = s1 + dC[i];
            } else {
                s2 = s2 + dC[i];
            }
        }
        dNewString = s1 + s2;
        return dNewString;
    }

}