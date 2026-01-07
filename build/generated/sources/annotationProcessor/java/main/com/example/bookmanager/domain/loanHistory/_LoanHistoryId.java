package com.example.bookmanager.domain.loanHistory;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.371+0900")
@org.seasar.doma.DomainTypeImplementation
public final class _LoanHistoryId extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.String, com.example.bookmanager.domain.loanHistory.LoanHistoryId> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final _LoanHistoryId singleton = new _LoanHistoryId();

    private _LoanHistoryId() {
        super(org.seasar.doma.internal.wrapper.WrapperSuppliers.ofString());
    }

    @Override
    protected com.example.bookmanager.domain.loanHistory.LoanHistoryId newDomain(java.lang.String value) {
        if (value == null) {
            return null;
        }
        return new com.example.bookmanager.domain.loanHistory.LoanHistoryId(value);
    }

    @Override
    protected java.lang.String getBasicValue(com.example.bookmanager.domain.loanHistory.LoanHistoryId domain) {
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
    public Class<com.example.bookmanager.domain.loanHistory.LoanHistoryId> getDomainClass() {
        return com.example.bookmanager.domain.loanHistory.LoanHistoryId.class;
    }

    /**
     * @return the singleton
     */
    public static _LoanHistoryId getSingletonInternal() {
        return singleton;
    }

}
