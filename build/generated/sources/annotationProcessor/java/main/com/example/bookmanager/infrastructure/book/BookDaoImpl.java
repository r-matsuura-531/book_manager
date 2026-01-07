package com.example.bookmanager.infrastructure.book;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.474+0900")
@org.seasar.doma.DaoImplementation
public class BookDaoImpl implements com.example.bookmanager.infrastructure.book.BookDao, org.seasar.doma.jdbc.ConfigProvider {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.book.BookDao.class, "selectByBookId", com.example.bookmanager.domain.book.BookId.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.book.BookDao.class, "selectQueryModelByBookId", com.example.bookmanager.domain.book.BookId.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.book.BookDao.class, "selectByIsbn", java.lang.String.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.book.BookDao.class, "selectQueryModelByConditions", com.example.bookmanager.application.book.query.search.SearchBookFilter.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.book.BookDao.class, "insert", com.example.bookmanager.infrastructure.book.BookEntity.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.book.BookDao.class, "update", com.example.bookmanager.infrastructure.book.BookEntity.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.book.BookDao.class, "deleteById", com.example.bookmanager.domain.book.BookId.class, com.example.bookmanager.domain.user.UserId.class, java.time.LocalDateTime.class);

    private final org.seasar.doma.internal.jdbc.dao.DaoImplSupport __support;

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public BookDaoImpl(org.seasar.doma.jdbc.Config config) {
        __support = new org.seasar.doma.internal.jdbc.dao.DaoImplSupport(config);
    }

    @Override
    public org.seasar.doma.jdbc.Config getConfig() {
        return __support.getConfig();
    }

    @Override
    public java.util.Optional<com.example.bookmanager.infrastructure.book.BookEntity> selectByBookId(com.example.bookmanager.domain.book.BookId id) {
        __support.entering("com.example.bookmanager.infrastructure.book.BookDaoImpl", "selectByBookId", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/bookmanager/infrastructure/book/BookDao/selectByBookId.sql");
            __query.setEntityType(com.example.bookmanager.infrastructure.book._BookEntity.getSingletonInternal());
            __query.addParameter("id", com.example.bookmanager.domain.book.BookId.class, id);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.book.BookDaoImpl");
            __query.setCallerMethodName("selectByBookId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.example.bookmanager.infrastructure.book.BookEntity>> __command = __support.getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.example.bookmanager.infrastructure.book.BookEntity>(com.example.bookmanager.infrastructure.book._BookEntity.getSingletonInternal()));
            java.util.Optional<com.example.bookmanager.infrastructure.book.BookEntity> __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.book.BookDaoImpl", "selectByBookId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.book.BookDaoImpl", "selectByBookId", __e);
            throw __e;
        }
    }

    @Override
    public java.util.Optional<com.example.bookmanager.infrastructure.book.SearchBookEntity> selectQueryModelByBookId(com.example.bookmanager.domain.book.BookId id) {
        __support.entering("com.example.bookmanager.infrastructure.book.BookDaoImpl", "selectQueryModelByBookId", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/bookmanager/infrastructure/book/BookDao/selectQueryModelByBookId.sql");
            __query.setEntityType(com.example.bookmanager.infrastructure.book._SearchBookEntity.getSingletonInternal());
            __query.addParameter("id", com.example.bookmanager.domain.book.BookId.class, id);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.book.BookDaoImpl");
            __query.setCallerMethodName("selectQueryModelByBookId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.example.bookmanager.infrastructure.book.SearchBookEntity>> __command = __support.getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.example.bookmanager.infrastructure.book.SearchBookEntity>(com.example.bookmanager.infrastructure.book._SearchBookEntity.getSingletonInternal()));
            java.util.Optional<com.example.bookmanager.infrastructure.book.SearchBookEntity> __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.book.BookDaoImpl", "selectQueryModelByBookId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.book.BookDaoImpl", "selectQueryModelByBookId", __e);
            throw __e;
        }
    }

    @Override
    public java.util.Optional<com.example.bookmanager.infrastructure.book.BookEntity> selectByIsbn(java.lang.String isbn) {
        __support.entering("com.example.bookmanager.infrastructure.book.BookDaoImpl", "selectByIsbn", isbn);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/bookmanager/infrastructure/book/BookDao/selectByIsbn.sql");
            __query.setEntityType(com.example.bookmanager.infrastructure.book._BookEntity.getSingletonInternal());
            __query.addParameter("isbn", java.lang.String.class, isbn);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.book.BookDaoImpl");
            __query.setCallerMethodName("selectByIsbn");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.example.bookmanager.infrastructure.book.BookEntity>> __command = __support.getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.example.bookmanager.infrastructure.book.BookEntity>(com.example.bookmanager.infrastructure.book._BookEntity.getSingletonInternal()));
            java.util.Optional<com.example.bookmanager.infrastructure.book.BookEntity> __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.book.BookDaoImpl", "selectByIsbn", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.book.BookDaoImpl", "selectByIsbn", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.example.bookmanager.infrastructure.book.SearchBookEntity> selectQueryModelByConditions(com.example.bookmanager.application.book.query.search.SearchBookFilter filter) {
        __support.entering("com.example.bookmanager.infrastructure.book.BookDaoImpl", "selectQueryModelByConditions", filter);
        try {
            if (filter == null) {
                throw new org.seasar.doma.DomaNullPointerException("filter");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method3);
            __query.setMethod(__method3);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/bookmanager/infrastructure/book/BookDao/selectQueryModelByConditions.sql");
            __query.setEntityType(com.example.bookmanager.infrastructure.book._SearchBookEntity.getSingletonInternal());
            __query.addParameter("filter", com.example.bookmanager.application.book.query.search.SearchBookFilter.class, filter);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.book.BookDaoImpl");
            __query.setCallerMethodName("selectQueryModelByConditions");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.example.bookmanager.infrastructure.book.SearchBookEntity>> __command = __support.getCommandImplementors().createSelectCommand(__method3, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.example.bookmanager.infrastructure.book.SearchBookEntity>(com.example.bookmanager.infrastructure.book._SearchBookEntity.getSingletonInternal()));
            java.util.List<com.example.bookmanager.infrastructure.book.SearchBookEntity> __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.book.BookDaoImpl", "selectQueryModelByConditions", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.book.BookDaoImpl", "selectQueryModelByConditions", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.example.bookmanager.infrastructure.book.BookEntity entity) {
        __support.entering("com.example.bookmanager.infrastructure.book.BookDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.example.bookmanager.infrastructure.book.BookEntity> __query = __support.getQueryImplementors().createAutoInsertQuery(__method4, com.example.bookmanager.infrastructure.book._BookEntity.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(__support.getConfig());
            __query.setEntity(entity);
            __query.setDuplicateKeyType(org.seasar.doma.jdbc.query.DuplicateKeyType.EXCEPTION);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.book.BookDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(true);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setDuplicateKeyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = __support.getCommandImplementors().createInsertCommand(__method4, __query);
            int __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.book.BookDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.book.BookDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.example.bookmanager.infrastructure.book.BookEntity entity) {
        __support.entering("com.example.bookmanager.infrastructure.book.BookDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.example.bookmanager.infrastructure.book.BookEntity> __query = __support.getQueryImplementors().createAutoUpdateQuery(__method5, com.example.bookmanager.infrastructure.book._BookEntity.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(__support.getConfig());
            __query.setEntity(entity);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.book.BookDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(true);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = __support.getCommandImplementors().createUpdateCommand(__method5, __query);
            int __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.book.BookDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.book.BookDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int deleteById(com.example.bookmanager.domain.book.BookId id, com.example.bookmanager.domain.user.UserId userId, java.time.LocalDateTime now) {
        __support.entering("com.example.bookmanager.infrastructure.book.BookDaoImpl", "deleteById", id, userId, now);
        try {
            org.seasar.doma.jdbc.query.SqlFileUpdateQuery __query = __support.getQueryImplementors().createSqlFileUpdateQuery(__method6);
            __query.setMethod(__method6);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/bookmanager/infrastructure/book/BookDao/deleteById.sql");
            __query.addParameter("id", com.example.bookmanager.domain.book.BookId.class, id);
            __query.addParameter("userId", com.example.bookmanager.domain.user.UserId.class, userId);
            __query.addParameter("now", java.time.LocalDateTime.class, now);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.book.BookDaoImpl");
            __query.setCallerMethodName("deleteById");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.UpdateCommand __command = __support.getCommandImplementors().createUpdateCommand(__method6, __query);
            int __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.book.BookDaoImpl", "deleteById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.book.BookDaoImpl", "deleteById", __e);
            throw __e;
        }
    }

}
