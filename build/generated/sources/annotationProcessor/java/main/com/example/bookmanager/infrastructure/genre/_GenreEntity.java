package com.example.bookmanager.infrastructure.genre;

/** */
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.401+0900")
@org.seasar.doma.EntityTypeImplementation
public final class _GenreEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.example.bookmanager.infrastructure.genre.GenreEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final _GenreEntity __singleton = new _GenreEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_LOWER_CASE;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.example.bookmanager.infrastructure.genre.GenreEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __embeddedPropertyTypeMap;

    private _GenreEntity() {
        __listenerSupplier = org.seasar.doma.internal.jdbc.entity.NullEntityListenerSuppliers.of();
        __immutable = false;
        __name = "GenreEntity";
        __catalogName = "";
        __schemaName = "bookmanager";
        __tableName = "genres";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __list = new java.util.ArrayList<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __map = new java.util.LinkedHashMap<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __embeddedMap = new java.util.LinkedHashMap<>(2);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __embeddedMap) {
        __map.put("id", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.genre.GenreEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "id", "", __namingType, true, true, false));
        __map.put("name", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, java.lang.String, java.lang.String>(com.example.bookmanager.infrastructure.genre.GenreEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "name", "", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __idList) {
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __list) {
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
    public void preInsert(com.example.bookmanager.infrastructure.genre.GenreEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.example.bookmanager.infrastructure.genre.GenreEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.example.bookmanager.infrastructure.genre.GenreEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.example.bookmanager.infrastructure.genre.GenreEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.example.bookmanager.infrastructure.genre.GenreEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.example.bookmanager.infrastructure.genre.GenreEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.example.bookmanager.infrastructure.genre.GenreEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.example.bookmanager.infrastructure.genre.GenreEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.example.bookmanager.infrastructure.genre.GenreEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.example.bookmanager.infrastructure.genre.GenreEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.example.bookmanager.infrastructure.genre.GenreEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.example.bookmanager.infrastructure.genre.GenreEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.example.bookmanager.infrastructure.genre.GenreEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public com.example.bookmanager.infrastructure.genre.GenreEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.example.bookmanager.infrastructure.genre.GenreEntity, ?>> __args) {
        com.example.bookmanager.infrastructure.genre.GenreEntity entity = new com.example.bookmanager.infrastructure.genre.GenreEntity();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("name") != null) __args.get("name").save(entity);
        return entity;
    }

    @Override
    public Class<com.example.bookmanager.infrastructure.genre.GenreEntity> getEntityClass() {
        return com.example.bookmanager.infrastructure.genre.GenreEntity.class;
    }

    @Override
    public com.example.bookmanager.infrastructure.genre.GenreEntity getOriginalStates(com.example.bookmanager.infrastructure.genre.GenreEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.example.bookmanager.infrastructure.genre.GenreEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _GenreEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _GenreEntity newInstance() {
        return new _GenreEntity();
    }

}
