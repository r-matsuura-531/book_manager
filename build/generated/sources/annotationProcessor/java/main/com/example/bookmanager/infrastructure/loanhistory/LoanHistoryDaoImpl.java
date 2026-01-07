package com.example.bookmanager.infrastructure.loanhistory;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.461+0900")
@org.seasar.doma.DaoImplementation
public class LoanHistoryDaoImpl implements com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDao, org.seasar.doma.jdbc.ConfigProvider {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDao.class, "selectById", com.example.bookmanager.domain.loanHistory.LoanHistoryId.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDao.class, "insert", com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDao.class, "selectByUserId", com.example.bookmanager.domain.user.UserId.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDao.class, "update", com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDao.class, "selectByBookId", com.example.bookmanager.domain.book.BookId.class);

    private final org.seasar.doma.internal.jdbc.dao.DaoImplSupport __support;

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public LoanHistoryDaoImpl(org.seasar.doma.jdbc.Config config) {
        __support = new org.seasar.doma.internal.jdbc.dao.DaoImplSupport(config);
    }

    @Override
    public org.seasar.doma.jdbc.Config getConfig() {
        return __support.getConfig();
    }

    @Override
    public java.util.Optional<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity> selectById(com.example.bookmanager.domain.loanHistory.LoanHistoryId loanHistoryId) {
        __support.entering("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "selectById", loanHistoryId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/bookmanager/infrastructure/loanhistory/LoanHistoryDao/selectById.sql");
            __query.setEntityType(com.example.bookmanager.infrastructure.loanhistory._LoanHistoryEntity.getSingletonInternal());
            __query.addParameter("loanHistoryId", com.example.bookmanager.domain.loanHistory.LoanHistoryId.class, loanHistoryId);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity>> __command = __support.getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity>(com.example.bookmanager.infrastructure.loanhistory._LoanHistoryEntity.getSingletonInternal()));
            java.util.Optional<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity> __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity loanHistoryEntity) {
        __support.entering("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "insert", loanHistoryEntity);
        try {
            if (loanHistoryEntity == null) {
                throw new org.seasar.doma.DomaNullPointerException("loanHistoryEntity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity> __query = __support.getQueryImplementors().createAutoInsertQuery(__method1, com.example.bookmanager.infrastructure.loanhistory._LoanHistoryEntity.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(__support.getConfig());
            __query.setEntity(loanHistoryEntity);
            __query.setDuplicateKeyType(org.seasar.doma.jdbc.query.DuplicateKeyType.EXCEPTION);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(true);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setDuplicateKeyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = __support.getCommandImplementors().createInsertCommand(__method1, __query);
            int __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.example.bookmanager.infrastructure.loanhistory.join.UserLoanBookEntity> selectByUserId(com.example.bookmanager.domain.user.UserId userId) {
        __support.entering("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "selectByUserId", userId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/bookmanager/infrastructure/loanhistory/LoanHistoryDao/selectByUserId.sql");
            __query.setEntityType(com.example.bookmanager.infrastructure.loanhistory.join._UserLoanBookEntity.getSingletonInternal());
            __query.addParameter("userId", com.example.bookmanager.domain.user.UserId.class, userId);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl");
            __query.setCallerMethodName("selectByUserId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.example.bookmanager.infrastructure.loanhistory.join.UserLoanBookEntity>> __command = __support.getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.example.bookmanager.infrastructure.loanhistory.join.UserLoanBookEntity>(com.example.bookmanager.infrastructure.loanhistory.join._UserLoanBookEntity.getSingletonInternal()));
            java.util.List<com.example.bookmanager.infrastructure.loanhistory.join.UserLoanBookEntity> __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "selectByUserId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "selectByUserId", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity loanHistoryEntity) {
        __support.entering("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "update", loanHistoryEntity);
        try {
            if (loanHistoryEntity == null) {
                throw new org.seasar.doma.DomaNullPointerException("loanHistoryEntity");
            }
            org.seasar.doma.jdbc.query.AutoUpdateQuery<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity> __query = __support.getQueryImplementors().createAutoUpdateQuery(__method3, com.example.bookmanager.infrastructure.loanhistory._LoanHistoryEntity.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(__support.getConfig());
            __query.setEntity(loanHistoryEntity);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl");
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
            org.seasar.doma.jdbc.command.UpdateCommand __command = __support.getCommandImplementors().createUpdateCommand(__method3, __query);
            int __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity> selectByBookId(com.example.bookmanager.domain.book.BookId bookId) {
        __support.entering("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "selectByBookId", bookId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method4);
            __query.setMethod(__method4);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/bookmanager/infrastructure/loanhistory/LoanHistoryDao/selectByBookId.sql");
            __query.setEntityType(com.example.bookmanager.infrastructure.loanhistory._LoanHistoryEntity.getSingletonInternal());
            __query.addParameter("bookId", com.example.bookmanager.domain.book.BookId.class, bookId);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl");
            __query.setCallerMethodName("selectByBookId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity>> __command = __support.getCommandImplementors().createSelectCommand(__method4, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity>(com.example.bookmanager.infrastructure.loanhistory._LoanHistoryEntity.getSingletonInternal()));
            java.util.List<com.example.bookmanager.infrastructure.loanhistory.LoanHistoryEntity> __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "selectByBookId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.loanhistory.LoanHistoryDaoImpl", "selectByBookId", __e);
            throw __e;
        }
    }

}
