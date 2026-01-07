package com.example.bookmanager.domain.book;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.377+0900")
@org.seasar.doma.DomainTypeImplementation
public final class _OverDueDays extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.Integer, com.example.bookmanager.domain.book.OverDueDays> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final _OverDueDays singleton = new _OverDueDays();

    private _OverDueDays() {
        super(org.seasar.doma.internal.wrapper.WrapperSuppliers.ofInteger());
    }

    @Override
    protected com.example.bookmanager.domain.book.OverDueDays newDomain(java.lang.Integer value) {
        if (value == null) {
            return null;
        }
        return new com.example.bookmanager.domain.book.OverDueDays(value);
    }

    @Override
    protected java.lang.Integer getBasicValue(com.example.bookmanager.domain.book.OverDueDays domain) {
        if (domain == null) {
            return null;
        }
        return domain.getValue();
    }

    @Override
    public Class<?> getBasicClass() {
        return java.lang.Integer.class;
    }

    @Override
    public Class<com.example.bookmanager.domain.book.OverDueDays> getDomainClass() {
        return com.example.bookmanager.domain.book.OverDueDays.class;
    }

    /**
     * @return the singleton
     */
    public static _OverDueDays getSingletonInternal() {
        return singleton;
    }

}
