package com.example.bookmanager.infrastructure.loanhistory;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.409+0900")
@org.seasar.doma.EntityTypeImplementation
public final class _LoanHistoryEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final _LoanHistoryEntity __singleton = new _LoanHistoryEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_LOWER_CASE;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __embeddedPropertyTypeMap;

    private _LoanHistoryEntity() {
        __listenerSupplier = org.seasar.doma.internal.jdbc.entity.NullEntityListenerSuppliers.of();
        __immutable = false;
        __name = "LoanHistoryEntity";
        __catalogName = "";
        __schemaName = "bookmanager";
        __tableName = "loan_histories";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __list = new java.util.ArrayList<>(11);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __map = new java.util.LinkedHashMap<>(11);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __embeddedMap = new java.util.LinkedHashMap<>(11);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __embeddedMap) {
        __map.put("id", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "id", "", __namingType, false));
        __map.put("bookId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "bookId", "", __namingType, true, true, false));
        __map.put("userId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "userId", "", __namingType, true, true, false));
        __map.put("loanedAt", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, java.time.LocalDateTime, java.time.LocalDateTime>(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLocalDateTime(), "loanedAt", "", __namingType, true, true, false));
        __map.put("returnDueOn", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, java.time.LocalDate, java.time.LocalDate>(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLocalDate(), "returnDueOn", "", __namingType, true, true, false));
        __map.put("returnedAt", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, java.time.LocalDateTime, java.time.LocalDateTime>(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLocalDateTime(), "returnedAt", "", __namingType, true, true, false));
        __map.put("createdAt", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, java.time.LocalDateTime, java.time.LocalDateTime>(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLocalDateTime(), "createdAt", "", __namingType, true, true, false));
        __map.put("createdBy", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "createdBy", "", __namingType, true, true, false));
        __map.put("updatedAt", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, java.time.LocalDateTime, java.time.LocalDateTime>(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLocalDateTime(), "updatedAt", "", __namingType, true, true, false));
        __map.put("updatedBy", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "updatedBy", "", __namingType, true, true, false));
        __map.put("deleted", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, java.lang.Integer, java.lang.Integer>(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofPrimitiveInt(), "deleted", "", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __idList) {
        __idList.add(__map.get("id"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __list) {
        __list.addAll(__map.values());
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity, ?>> __args) {
        com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity entity = new com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("bookId") != null) __args.get("bookId").save(entity);
        if (__args.get("userId") != null) __args.get("userId").save(entity);
        if (__args.get("loanedAt") != null) __args.get("loanedAt").save(entity);
        if (__args.get("returnDueOn") != null) __args.get("returnDueOn").save(entity);
        if (__args.get("returnedAt") != null) __args.get("returnedAt").save(entity);
        if (__args.get("createdAt") != null) __args.get("createdAt").save(entity);
        if (__args.get("createdBy") != null) __args.get("createdBy").save(entity);
        if (__args.get("updatedAt") != null) __args.get("updatedAt").save(entity);
        if (__args.get("updatedBy") != null) __args.get("updatedBy").save(entity);
        if (__args.get("deleted") != null) __args.get("deleted").save(entity);
        return entity;
    }

    @Override
    public Class<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity> getEntityClass() {
        return com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity.class;
    }

    @Override
    public com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity getOriginalStates(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _LoanHistoryEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _LoanHistoryEntity newInstance() {
        return new _LoanHistoryEntity();
    }

}
