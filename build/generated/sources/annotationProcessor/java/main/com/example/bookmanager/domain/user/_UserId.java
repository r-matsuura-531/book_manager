package com.example.bookmanager.domain.user;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.359+0900")
@org.seasar.doma.DomainTypeImplementation
public final class _UserId extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.String, com.example.bookmanager.domain.user.UserId> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final _UserId singleton = new _UserId();

    private _UserId() {
        super(org.seasar.doma.internal.wrapper.WrapperSuppliers.ofString());
    }

    @Override
    protected com.example.bookmanager.domain.user.UserId newDomain(java.lang.String value) {
        if (value == null) {
            return null;
        }
        return new com.example.bookmanager.domain.user.UserId(value);
    }

    @Override
    protected java.lang.String getBasicValue(com.example.bookmanager.domain.user.UserId domain) {
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
    public Class<com.example.bookmanager.domain.user.UserId> getDomainClass() {
        return com.example.bookmanager.domain.user.UserId.class;
    }

    /**
     * @return the singleton
     */
    public static _UserId getSingletonInternal() {
        return singleton;
    }

}
