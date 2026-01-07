package com.example.bookmanager.domain.book;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.374+0900")
@org.seasar.doma.DomainTypeImplementation
public final class _LoanStatus extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.Integer, com.example.bookmanager.domain.book.LoanStatus> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final _LoanStatus singleton = new _LoanStatus();

    private _LoanStatus() {
        super(org.seasar.doma.internal.wrapper.WrapperSuppliers.ofInteger());
    }

    @Override
    protected com.example.bookmanager.domain.book.LoanStatus newDomain(java.lang.Integer value) {
        if (value == null) {
            return null;
        }
        return com.example.bookmanager.domain.book.LoanStatus.of(value);
    }

    @Override
    protected java.lang.Integer getBasicValue(com.example.bookmanager.domain.book.LoanStatus domain) {
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
    public Class<com.example.bookmanager.domain.book.LoanStatus> getDomainClass() {
        return com.example.bookmanager.domain.book.LoanStatus.class;
    }

    /**
     * @return the singleton
     */
    public static _LoanStatus getSingletonInternal() {
        return singleton;
    }

}
