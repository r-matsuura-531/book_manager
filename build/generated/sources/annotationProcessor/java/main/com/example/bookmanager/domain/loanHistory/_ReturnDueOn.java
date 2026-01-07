package com.example.bookmanager.domain.loanHistory;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.370+0900")
@org.seasar.doma.DomainTypeImplementation
public final class _ReturnDueOn extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.time.LocalDate, com.example.bookmanager.domain.loanHistory.ReturnDueOn> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final _ReturnDueOn singleton = new _ReturnDueOn();

    private _ReturnDueOn() {
        super(org.seasar.doma.internal.wrapper.WrapperSuppliers.ofLocalDate());
    }

    @Override
    protected com.example.bookmanager.domain.loanHistory.ReturnDueOn newDomain(java.time.LocalDate value) {
        if (value == null) {
            return null;
        }
        return new com.example.bookmanager.domain.loanHistory.ReturnDueOn(value);
    }

    @Override
    protected java.time.LocalDate getBasicValue(com.example.bookmanager.domain.loanHistory.ReturnDueOn domain) {
        if (domain == null) {
            return null;
        }
        return domain.getValue();
    }

    @Override
    public Class<?> getBasicClass() {
        return java.time.LocalDate.class;
    }

    @Override
    public Class<com.example.bookmanager.domain.loanHistory.ReturnDueOn> getDomainClass() {
        return com.example.bookmanager.domain.loanHistory.ReturnDueOn.class;
    }

    /**
     * @return the singleton
     */
    public static _ReturnDueOn getSingletonInternal() {
        return singleton;
    }

}
