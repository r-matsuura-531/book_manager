package com.example.bookmanager.domain.book;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.375+0900")
@org.seasar.doma.DomainTypeImplementation
public final class _BookId extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.String, com.example.bookmanager.domain.book.BookId> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final _BookId singleton = new _BookId();

    private _BookId() {
        super(org.seasar.doma.internal.wrapper.WrapperSuppliers.ofString());
    }

    @Override
    protected com.example.bookmanager.domain.book.BookId newDomain(java.lang.String value) {
        if (value == null) {
            return null;
        }
        return new com.example.bookmanager.domain.book.BookId(value);
    }

    @Override
    protected java.lang.String getBasicValue(com.example.bookmanager.domain.book.BookId domain) {
        if (domain == null) {
            return null;
        }
        return domain.getValue();
    }

    @Override
    public Class<?> getBasicClass() {
        return java.lang.String.class;
    }

    @Override
    public Class<com.example.bookmanager.domain.book.BookId> getDomainClass() {
        return com.example.bookmanager.domain.book.BookId.class;
    }

    /**
     * @return the singleton
     */
    public static _BookId getSingletonInternal() {
        return singleton;
    }

}
