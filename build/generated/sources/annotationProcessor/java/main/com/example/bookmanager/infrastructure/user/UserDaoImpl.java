package com.example.bookmanager.infrastructure.user;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.455+0900")
@org.seasar.doma.DaoImplementation
public class UserDaoImpl implements com.example.bookmanager.infrastructure.user.UserDao, org.seasar.doma.jdbc.ConfigProvider {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.user.UserDao.class, "selectById", java.lang.String.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.user.UserDao.class, "selectByEmail", java.lang.String.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.user.UserDao.class, "insert", com.example.bookmanager.infrastructure.user.UserEntity.class);

    private final org.seasar.doma.internal.jdbc.dao.DaoImplSupport __support;

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public UserDaoImpl(org.seasar.doma.jdbc.Config config) {
        __support = new org.seasar.doma.internal.jdbc.dao.DaoImplSupport(config);
    }

    @Override
    public org.seasar.doma.jdbc.Config getConfig() {
        return __support.getConfig();
    }

    @Override
    public java.util.Optional<com.example.bookmanager.infrastructure.user.UserEntity> selectById(java.lang.String id) {
        __support.entering("com.example.bookmanager.infrastructure.user.UserDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/bookmanager/infrastructure/user/UserDao/selectById.sql");
            __query.setEntityType(com.example.bookmanager.infrastructure.user._UserEntity.getSingletonInternal());
            __query.addParameter("id", java.lang.String.class, id);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.user.UserDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.example.bookmanager.infrastructure.user.UserEntity>> __command = __support.getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.example.bookmanager.infrastructure.user.UserEntity>(com.example.bookmanager.infrastructure.user._UserEntity.getSingletonInternal()));
            java.util.Optional<com.example.bookmanager.infrastructure.user.UserEntity> __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.user.UserDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.user.UserDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.Optional<com.example.bookmanager.infrastructure.user.UserEntity> selectByEmail(java.lang.String email) {
        __support.entering("com.example.bookmanager.infrastructure.user.UserDaoImpl", "selectByEmail", email);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/bookmanager/infrastructure/user/UserDao/selectByEmail.sql");
            __query.setEntityType(com.example.bookmanager.infrastructure.user._UserEntity.getSingletonInternal());
            __query.addParameter("email", java.lang.String.class, email);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.user.UserDaoImpl");
            __query.setCallerMethodName("selectByEmail");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.example.bookmanager.infrastructure.user.UserEntity>> __command = __support.getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.example.bookmanager.infrastructure.user.UserEntity>(com.example.bookmanager.infrastructure.user._UserEntity.getSingletonInternal()));
            java.util.Optional<com.example.bookmanager.infrastructure.user.UserEntity> __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.user.UserDaoImpl", "selectByEmail", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.user.UserDaoImpl", "selectByEmail", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.example.bookmanager.infrastructure.user.UserEntity entity) {
        __support.entering("com.example.bookmanager.infrastructure.user.UserDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.example.bookmanager.infrastructure.user.UserEntity> __query = __support.getQueryImplementors().createAutoInsertQuery(__method2, com.example.bookmanager.infrastructure.user._UserEntity.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(__support.getConfig());
            __query.setEntity(entity);
            __query.setDuplicateKeyType(org.seasar.doma.jdbc.query.DuplicateKeyType.EXCEPTION);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.user.UserDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setDuplicateKeyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = __support.getCommandImplementors().createInsertCommand(__method2, __query);
            int __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.user.UserDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.user.UserDaoImpl", "insert", __e);
            throw __e;
        }
    }

}
