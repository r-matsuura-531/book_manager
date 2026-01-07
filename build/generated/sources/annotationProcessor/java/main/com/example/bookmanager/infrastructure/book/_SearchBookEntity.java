package com.example.bookmanager.infrastructure.book;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.414+0900")
@org.seasar.doma.EntityTypeImplementation
public final class _SearchBookEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.example.bookmanager.infrastructure.book.SearchBookEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final _SearchBookEntity __singleton = new _SearchBookEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_LOWER_CASE;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.example.bookmanager.infrastructure.book.SearchBookEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __embeddedPropertyTypeMap;

    private _SearchBookEntity() {
        __listenerSupplier = org.seasar.doma.internal.jdbc.entity.NullEntityListenerSuppliers.of();
        __immutable = false;
        __name = "SearchBookEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __list = new java.util.ArrayList<>(16);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __map = new java.util.LinkedHashMap<>(16);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __embeddedMap = new java.util.LinkedHashMap<>(16);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __embeddedMap) {
        __map.put("id", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "id", "", __namingType, false));
        __map.put("isbn", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "isbn", "", __namingType, true, true, false));
        __map.put("title", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "title", "", __namingType, true, true, false));
        __map.put("authorId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "authorId", "", __namingType, true, true, false));
        __map.put("publisherId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "publisherId", "", __namingType, true, true, false));
        __map.put("genreId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "genreId", "", __namingType, true, true, false));
        __map.put("stock", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.lang.Integer, java.lang.Integer>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofPrimitiveInt(), "stock", "", __namingType, true, true, false));
        __map.put("publicationDate", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.time.LocalDate, java.time.LocalDate>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLocalDate(), "publicationDate", "", __namingType, true, true, false));
        __map.put("createdAt", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.time.LocalDateTime, java.time.LocalDateTime>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLocalDateTime(), "createdAt", "", __namingType, true, true, false));
        __map.put("createdBy", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "createdBy", "", __namingType, true, true, false));
        __map.put("updatedAt", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.time.LocalDateTime, java.time.LocalDateTime>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofLocalDateTime(), "updatedAt", "", __namingType, true, true, false));
        __map.put("updatedBy", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "updatedBy", "", __namingType, true, true, false));
        __map.put("deleted", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.lang.Integer, java.lang.Integer>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofPrimitiveInt(), "deleted", "", __namingType, true, true, false));
        __map.put("authorName", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "authorName", "", __namingType, true, true, false));
        __map.put("publisherName", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "publisherName", "", __namingType, true, true, false));
        __map.put("genreName", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.book.SearchBookEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "genreName", "", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __idList) {
        __idList.add(__map.get("id"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __list) {
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
    public void preInsert(com.example.bookmanager.infrastructure.book.SearchBookEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.example.bookmanager.infrastructure.book.SearchBookEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.example.bookmanager.infrastructure.book.SearchBookEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.example.bookmanager.infrastructure.book.SearchBookEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.example.bookmanager.infrastructure.book.SearchBookEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.example.bookmanager.infrastructure.book.SearchBookEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.example.bookmanager.infrastructure.book.SearchBookEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.example.bookmanager.infrastructure.book.SearchBookEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.example.bookmanager.infrastructure.book.SearchBookEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.example.bookmanager.infrastructure.book.SearchBookEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.example.bookmanager.infrastructure.book.SearchBookEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.example.bookmanager.infrastructure.book.SearchBookEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public com.example.bookmanager.infrastructure.book.SearchBookEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.example.bookmanager.infrastructure.book.SearchBookEntity, ?>> __args) {
        com.example.bookmanager.infrastructure.book.SearchBookEntity entity = new com.example.bookmanager.infrastructure.book.SearchBookEntity();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("isbn") != null) __args.get("isbn").save(entity);
        if (__args.get("title") != null) __args.get("title").save(entity);
        if (__args.get("authorId") != null) __args.get("authorId").save(entity);
        if (__args.get("publisherId") != null) __args.get("publisherId").save(entity);
        if (__args.get("genreId") != null) __args.get("genreId").save(entity);
        if (__args.get("stock") != null) __args.get("stock").save(entity);
        if (__args.get("publicationDate") != null) __args.get("publicationDate").save(entity);
        if (__args.get("createdAt") != null) __args.get("createdAt").save(entity);
        if (__args.get("createdBy") != null) __args.get("createdBy").save(entity);
        if (__args.get("updatedAt") != null) __args.get("updatedAt").save(entity);
        if (__args.get("updatedBy") != null) __args.get("updatedBy").save(entity);
        if (__args.get("deleted") != null) __args.get("deleted").save(entity);
        if (__args.get("authorName") != null) __args.get("authorName").save(entity);
        if (__args.get("publisherName") != null) __args.get("publisherName").save(entity);
        if (__args.get("genreName") != null) __args.get("genreName").save(entity);
        return entity;
    }

    @Override
    public Class<com.example.bookmanager.infrastructure.book.SearchBookEntity> getEntityClass() {
        return com.example.bookmanager.infrastructure.book.SearchBookEntity.class;
    }

    @Override
    public com.example.bookmanager.infrastructure.book.SearchBookEntity getOriginalStates(com.example.bookmanager.infrastructure.book.SearchBookEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.example.bookmanager.infrastructure.book.SearchBookEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _SearchBookEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _SearchBookEntity newInstance() {
        return new _SearchBookEntity();
    }

}
