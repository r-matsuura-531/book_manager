package com.example.bookmanager.domain.genre;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.361+0900")
@org.seasar.doma.DomainTypeImplementation
public final class _GenreId extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.String, com.example.bookmanager.domain.genre.GenreId> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final _GenreId singleton = new _GenreId();

    private _GenreId() {
        super(org.seasar.doma.internal.wrapper.WrapperSuppliers.ofString());
    }

    @Override
    protected com.example.bookmanager.domain.genre.GenreId newDomain(java.lang.String value) {
        if (value == null) {
            return null;
        }
        return new com.example.bookmanager.domain.genre.GenreId(value);
    }

    @Override
    protected java.lang.String getBasicValue(com.example.bookmanager.domain.genre.GenreId domain) {
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
    public Class<com.example.bookmanager.domain.genre.GenreId> getDomainClass() {
        return com.example.bookmanager.domain.genre.GenreId.class;
    }

    /**
     * @return the singleton
     */
    public static _GenreId getSingletonInternal() {
        return singleton;
    }

}
