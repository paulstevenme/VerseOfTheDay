package com.github.filipebezerra.bible.verseoftheday.votd;

/**
 * .
 *
 * @author Fbs
 * @version #, 02/11/2015
 * @since #
 */
public class VotdResponse {
    public Votd votd;
    public Error error;

    public static class Error {
        public String code;
        public String message;
    }
}
