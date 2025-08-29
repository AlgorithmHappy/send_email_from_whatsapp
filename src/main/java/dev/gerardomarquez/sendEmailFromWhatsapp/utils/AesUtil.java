package dev.gerardomarquez.sendEmailFromWhatsapp.utils;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/*
 * Clase para encriptar y desencriptar un texto
 */
public class AesUtil {

    /*
     * Metodo para encriptar String
     * @param plainText String en claro.
     * @param key Clave de encriptacion.
     * @return Devuelve el texto encriptado.
     */
    public static String encrypt(String plainText, byte[] key) throws Exception {
        Cipher cipher = Cipher.getInstance(Constants.ENCRYPT_ALGORITHM);
        SecretKeySpec keySpec = new SecretKeySpec(key, Constants.ENCRYPT_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] encrypted = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    /*
     * Metodo para desencriptar el String
     * @param encryptedText Texto encriptado
     * @param key Clave de desencriptacion
     * @return Texto en claro
     */
    public static String decrypt(String encryptedText, byte[] key) throws Exception {
        Cipher cipher = Cipher.getInstance(Constants.ENCRYPT_ALGORITHM);
        SecretKeySpec keySpec = new SecretKeySpec(key, Constants.ENCRYPT_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        byte[] decoded = Base64.getDecoder().decode(encryptedText);
        byte[] decrypted = cipher.doFinal(decoded);
        return new String(decrypted);
    }
}
