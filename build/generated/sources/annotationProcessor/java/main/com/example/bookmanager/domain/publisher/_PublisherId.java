package com.example.bookmanager.domain.publisher;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.352+0900")
@org.seasar.doma.DomainTypeImplementation
public final class _PublisherId extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.lang.String, com.example.bookmanager.domain.publisher.PublisherId> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final _PublisherId singleton = new _PublisherId();

    private _PublisherId() {
        super(org.seasar.doma.internal.wrapper.WrapperSuppliers.ofString());
    }

    @Override
    protected com.example.bookmanager.domain.publisher.PublisherId newDomain(java.lang.String value) {
        if (value == null) {
            return null;
        }
        return new com.example.bookmanager.domain.publisher.PublisherId(value);
    }

    @Override
    protected java.lang.String getBasicValue(com.example.bookmanager.domain.publisher.PublisherId domain) {
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
    public Class<com.example.bookmanager.domain.publisher.PublisherId> getDomainClass() {
        return com.example.bookmanager.domain.publisher.PublisherId.class;
    }

    /**
     * @return the singleton
     */
    public static _PublisherId getSingletonInternal() {
        return singleton;
    }

}
