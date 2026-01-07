package com.example.bookmanager.domain.book;

import com.example.bookmanager.exception.InvalidValueObjectException;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * ISBN
 */
@Getter
@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Isbn {

    private static final int LENGTH = 13;

    private final String value;

    public static Isbn of(final String value) throws InvalidValueObjectException {

        if (value.length() != LENGTH) {
            throw new InvalidValueObjectException("ISBNは13桁の数値である必要があります", "isbn");
        }

        return new Isbn(value);
    }

    public static Isbn restore(final String value) {
        return new Isbn(value);
    }
}