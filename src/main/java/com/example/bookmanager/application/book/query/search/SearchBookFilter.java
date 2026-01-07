package com.example.bookmanager.application.book.query.search;

import ch.qos.logback.core.util.StringUtil;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SearchBookFilter {

    private final String isbn;

    private final String title;

    private final String authorName;

    private final String publisherId;

    private final String genreId;

    public boolean hasIsbn() {
        return !StringUtil.isNullOrEmpty(isbn);
    }

    public boolean hasTitle() {
        return !StringUtil.isNullOrEmpty(title);
    }

    public boolean hasAuthorName() {
        return !StringUtil.isNullOrEmpty(authorName);
    }

    public boolean hasPublisherId() {
        return !StringUtil.isNullOrEmpty(publisherId);
    }

    public boolean hasGenreId() {
        return !StringUtil.isNullOrEmpty(genreId);
    }
}