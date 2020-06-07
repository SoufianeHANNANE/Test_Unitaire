package fr.wildcodeschool.unittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();

    @Test
    public void testVowels() {
        // Step 1: test d'une chaine avec la première lettre voyelle
        assertEquals("uio", stringUtils.vowels("union"));
        // Step 2: test d'une chaine avec uniquement des chiffres et symboles
        assertEquals("", stringUtils.vowels("137.49#04?0"));
        // Step 3: test d'une chaine constituée d'une seule lettre voyelle
        assertEquals("a", stringUtils.vowels("a"));
        // Step 4: test d'une chaine constituée d'une seule lettre consonne
        assertEquals("", stringUtils.vowels("t"));
        // Step 5: test du cas nominal
        assertEquals("ae", stringUtils.vowels("France"));
    }


    @Test
    public void testVowelsNull() {
        // Step 1: test avec un paramète null
        assertEquals("", stringUtils.vowels(null));
    }


    @Test
    public void testUniqueVowels() {
        // Step 1: test d'une chaine avec la première et dernière lettre la même voyelle
        assertEquals("a", stringUtils.uniqueVowels("aya"));

        // Step 2: test d'une chaine avec doublons de plusieus voyelles
        assertEquals("aioue", stringUtils.uniqueVowels("anticonstitutionnellement"));

        // Step 3: test d'une chaine constituée d'une seule voyelle
        assertEquals("u", stringUtils.uniqueVowels("uuuuuuuuuu"));

        // Step 4: test d'une chaine constituée de consonnes
        assertEquals("", stringUtils.uniqueVowels("FDJ"));

    }

    @Test
    public void testUniqueVowelsEmptyString() {
        // Step 1: test d'une chaine vide
        assertEquals("", stringUtils.uniqueVowels(""));
    }

    @Test
    public void testUniqueVowelsNull() {
        // Step 1: test avec un paramètre null
        assertEquals("", stringUtils.uniqueVowels(null));
    }

}