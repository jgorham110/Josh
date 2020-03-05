package models;

import interfaces.IStringEncryptable;

public class VowelReplacer implements IStringEncryptable {
    public String eNewString = "";
    public String dNewString = "";

    @Override
    public String encrypt(String phraseToEncrypt) {
        char[] eV = phraseToEncrypt.toCharArray();
        for(int i = 0; i < eV.length; i++){
            if(eV[i] == 'a'){
                eV[i] = 'e';
            }
            else if(eV[i] == 'e'){
                eV[i] = 'i';
            }
            else if(eV[i] == 'i'){
                eV[i] = 'o';
            }
            else if(eV[i] == 'o'){
                eV[i] = 'u';
            }
            else if(eV[i] == 'u'){
                eV[i] = 'a';
            }
            else {}
            eNewString = eNewString + eV[i];
        }
        return eNewString;
    }

    @Override
    public String decrypt(String phraseToDecrypt) {
        char[] dV = phraseToDecrypt.toCharArray();
        for(int i = 0; i < dV.length; i++){
            if(dV[i] == 'e'){
                dV[i] = 'a';
            }
            else if(dV[i] == 'i'){
                dV[i] = 'e';
            }
            else if(dV[i] == 'o'){
                dV[i] = 'i';
            }
            else if(dV[i] == 'u'){
                dV[i] = 'o';
            }
            else if(dV[i] == 'a'){
                dV[i] = 'u';
            }
            else {}
            dNewString = dNewString + dV[i];
        }
        return dNewString;
    }
}
