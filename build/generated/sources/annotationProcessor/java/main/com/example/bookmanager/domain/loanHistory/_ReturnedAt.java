package com.example.bookmanager.domain.loanHistory;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.368+0900")
@org.seasar.doma.DomainTypeImplementation
public final class _ReturnedAt extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.time.LocalDateTime, com.example.bookmanager.domain.loanHistory.ReturnedAt> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final _ReturnedAt singleton = new _ReturnedAt();

    private _ReturnedAt() {
        super(org.seasar.doma.internal.wrapper.WrapperSuppliers.ofLocalDateTime());
    }

    @Override
    protected com.example.bookmanager.domain.loanHistory.ReturnedAt newDomain(java.time.LocalDateTime value) {
        if (value == null) {
            return null;
        }
        return new com.example.bookmanager.domain.loanHistory.ReturnedAt(value);
    }

    @Override
    protected java.time.LocalDateTime getBasicValue(com.example.bookmanager.domain.loanHistory.ReturnedAt domain) {
        if (domain == null) {
            return null;
        }
        return domain.getValue();
    }

    @Override
    public Class<?> getBasicClass() {
        return java.time.LocalDateTime.class;
    }

    @Override
    public Class<com.example.bookmanager.domain.loanHistory.ReturnedAt> getDomainClass() {
        return com.example.bookmanager.domain.loanHistory.ReturnedAt.class;
    }

    /**
     * @return the singleton
     */
    public static _ReturnedAt getSingletonInternal() {
        return singleton;
    }

}
