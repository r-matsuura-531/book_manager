package com.example.bookmanager.infrastructure.genre;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.processing.Generated(value = { "Doma", "3.4.0" }, date = "2026-01-08T01:49:38.458+0900")
@org.seasar.doma.DaoImplementation
public class GenreDaoImpl implements com.example.bookmanager.infrastructure.genre.GenreDao, org.seasar.doma.jdbc.ConfigProvider {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("3.4.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.example.bookmanager.infrastructure.genre.GenreDao.class, "selectById", com.example.bookmanager.domain.genre.GenreId.class);

    private final org.seasar.doma.internal.jdbc.dao.DaoImplSupport __support;

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public GenreDaoImpl(org.seasar.doma.jdbc.Config config) {
        __support = new org.seasar.doma.internal.jdbc.dao.DaoImplSupport(config);
    }

    @Override
    public org.seasar.doma.jdbc.Config getConfig() {
        return __support.getConfig();
    }

    @Override
    public java.util.Optional<com.example.bookmanager.infrastructure.genre.GenreEntity> selectById(com.example.bookmanager.domain.genre.GenreId id) {
        __support.entering("com.example.bookmanager.infrastructure.genre.GenreDaoImpl", "selectById", id);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/example/bookmanager/infrastructure/genre/GenreDao/selectById.sql");
            __query.setEntityType(com.example.bookmanager.infrastructure.genre._GenreEntity.getSingletonInternal());
            __query.addParameter("id", com.example.bookmanager.domain.genre.GenreId.class, id);
            __query.setCallerClassName("com.example.bookmanager.infrastructure.genre.GenreDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.Optional<com.example.bookmanager.infrastructure.genre.GenreEntity>> __command = __support.getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.OptionalEntitySingleResultHandler<com.example.bookmanager.infrastructure.genre.GenreEntity>(com.example.bookmanager.infrastructure.genre._GenreEntity.getSingletonInternal()));
            java.util.Optional<com.example.bookmanager.infrastructure.genre.GenreEntity> __result = __command.execute();
            __query.complete();
            __support.exiting("com.example.bookmanager.infrastructure.genre.GenreDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.example.bookmanager.infrastructure.genre.GenreDaoImpl", "selectById", __e);
            throw __e;
        }
    }

}
