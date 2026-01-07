package com.example.bookmanager.domain.author;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.356+0900")
@org.seasar.doma.DomainTypeImplementation
public final class _AuthorId extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.String, com.example.bookmanager.domain.author.AuthorId> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final _AuthorId singleton = new _AuthorId();

    private _AuthorId() {
        super(org.seasar.doma.internal.wrapper.WrapperSuppliers.ofString());
    }

    @Override
    protected com.example.bookmanager.domain.author.AuthorId newDomain(java.lang.String value) {
        if (value == null) {
            return null;
        }
        return new com.example.bookmanager.domain.author.AuthorId(value);
    }

    @Override
    protected java.lang.String getBasicValue(com.example.bookmanager.domain.author.AuthorId domain) {
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
    public Class<com.example.bookmanager.domain.author.AuthorId> getDomainClass() {
        return com.example.bookmanager.domain.author.AuthorId.class;
    }

    /**
     * @return the singleton
     */
    public static _AuthorId getSingletonInternal() {
        return singleton;
    }

}
