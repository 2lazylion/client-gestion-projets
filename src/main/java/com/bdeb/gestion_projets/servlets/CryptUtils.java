/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdeb.gestion_projets.servlets;

import at.favre.lib.crypto.bcrypt.BCrypt;

/**
 *
 * @author Edward Cadet
 */
public class CryptUtils {
    protected static String encrypt(String motDePasse) {
        return BCrypt.withDefaults().hashToString(12, motDePasse.toCharArray());
    }
}
