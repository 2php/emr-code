package pkuhit.iih.qa.dao.auto;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "1.35.0" }, date = "2017-01-01T01:49:38.645+0800")
public class QaFltDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements pkuhit.iih.qa.dao.auto.QaFltDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.35.0");
    }

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.iih.qa.dao.auto.QaFltDao.class, "insert", pkuhit.iih.qa.dao.auto.entity.QaFlt.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.iih.qa.dao.auto.QaFltDao.class, "insertExludeNull", pkuhit.iih.qa.dao.auto.entity.QaFlt.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.iih.qa.dao.auto.QaFltDao.class, "update", pkuhit.iih.qa.dao.auto.entity.QaFlt.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.iih.qa.dao.auto.QaFltDao.class, "updateExcludeNull", pkuhit.iih.qa.dao.auto.entity.QaFlt.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.iih.qa.dao.auto.QaFltDao.class, "markDelete", pkuhit.iih.qa.dao.auto.entity.QaFlt.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.iih.qa.dao.auto.QaFltDao.class, "delete", pkuhit.iih.qa.dao.auto.entity.QaFlt.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.iih.qa.dao.auto.QaFltDao.class, "batchInsert", java.util.List.class);

    private static final java.lang.reflect.Method __method8 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.iih.qa.dao.auto.QaFltDao.class, "batchUpdate", java.util.List.class);

    private static final java.lang.reflect.Method __method9 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(pkuhit.iih.qa.dao.auto.QaFltDao.class, "batchDelete", java.util.List.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public QaFltDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public pkuhit.iih.qa.dao.auto.entity.QaFlt selectById(java.lang.String qaFltPk) {
        entering("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "selectById", qaFltPk);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/pkuhit/iih/qa/dao/auto/QaFltDao/selectById.sql");
            __query.addParameter("qaFltPk", java.lang.String.class, qaFltPk);
            __query.setCallerClassName("pkuhit.iih.qa.dao.auto.QaFltDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<pkuhit.iih.qa.dao.auto.entity.QaFlt> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<pkuhit.iih.qa.dao.auto.entity.QaFlt>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<pkuhit.iih.qa.dao.auto.entity.QaFlt>(pkuhit.iih.qa.dao.auto.entity._QaFlt.getSingletonInternal()));
            pkuhit.iih.qa.dao.auto.entity.QaFlt __result = __command.execute();
            __query.complete();
            exiting("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int insert(pkuhit.iih.qa.dao.auto.entity.QaFlt entity) {
        entering("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt>(pkuhit.iih.qa.dao.auto.entity._QaFlt.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("pkuhit.iih.qa.dao.auto.QaFltDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int insertExludeNull(pkuhit.iih.qa.dao.auto.entity.QaFlt entity) {
        entering("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "insertExludeNull", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt>(pkuhit.iih.qa.dao.auto.entity._QaFlt.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("pkuhit.iih.qa.dao.auto.QaFltDaoImpl");
            __query.setCallerMethodName("insertExludeNull");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "insertExludeNull", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "insertExludeNull", __e);
            throw __e;
        }
    }

    @Override
    public int update(pkuhit.iih.qa.dao.auto.entity.QaFlt entity) {
        entering("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt>(pkuhit.iih.qa.dao.auto.entity._QaFlt.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("pkuhit.iih.qa.dao.auto.QaFltDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int updateExcludeNull(pkuhit.iih.qa.dao.auto.entity.QaFlt entity) {
        entering("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "updateExcludeNull", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt>(pkuhit.iih.qa.dao.auto.entity._QaFlt.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("pkuhit.iih.qa.dao.auto.QaFltDaoImpl");
            __query.setCallerMethodName("updateExcludeNull");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "updateExcludeNull", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "updateExcludeNull", __e);
            throw __e;
        }
    }

    @Override
    public int markDelete(pkuhit.iih.qa.dao.auto.entity.QaFlt entity) {
        entering("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "markDelete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt>(pkuhit.iih.qa.dao.auto.entity._QaFlt.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("pkuhit.iih.qa.dao.auto.QaFltDaoImpl");
            __query.setCallerMethodName("markDelete");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(true);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "markDelete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "markDelete", __e);
            throw __e;
        }
    }

    @Override
    public int delete(pkuhit.iih.qa.dao.auto.entity.QaFlt entity) {
        entering("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt>(pkuhit.iih.qa.dao.auto.entity._QaFlt.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("pkuhit.iih.qa.dao.auto.QaFltDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int[] batchInsert(java.util.List<pkuhit.iih.qa.dao.auto.entity.QaFlt> entities) {
        entering("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "batchInsert", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.internal.jdbc.query.AutoBatchInsertQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt> __query = new org.seasar.doma.internal.jdbc.query.AutoBatchInsertQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt>(pkuhit.iih.qa.dao.auto.entity._QaFlt.getSingletonInternal());
            __query.setMethod(__method7);
            __query.setConfig(config);
            __query.setEntities(entities);
            __query.setCallerClassName("pkuhit.iih.qa.dao.auto.QaFltDaoImpl");
            __query.setCallerMethodName("batchInsert");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.BatchInsertCommand __command = new org.seasar.doma.internal.jdbc.command.BatchInsertCommand(__query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "batchInsert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "batchInsert", __e);
            throw __e;
        }
    }

    @Override
    public int[] batchUpdate(java.util.List<pkuhit.iih.qa.dao.auto.entity.QaFlt> entities) {
        entering("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "batchUpdate", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.internal.jdbc.query.AutoBatchUpdateQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt> __query = new org.seasar.doma.internal.jdbc.query.AutoBatchUpdateQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt>(pkuhit.iih.qa.dao.auto.entity._QaFlt.getSingletonInternal());
            __query.setMethod(__method8);
            __query.setConfig(config);
            __query.setEntities(entities);
            __query.setCallerClassName("pkuhit.iih.qa.dao.auto.QaFltDaoImpl");
            __query.setCallerMethodName("batchUpdate");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.BatchUpdateCommand __command = new org.seasar.doma.internal.jdbc.command.BatchUpdateCommand(__query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "batchUpdate", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "batchUpdate", __e);
            throw __e;
        }
    }

    @Override
    public int[] batchDelete(java.util.List<pkuhit.iih.qa.dao.auto.entity.QaFlt> entities) {
        entering("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "batchDelete", entities);
        try {
            if (entities == null) {
                throw new org.seasar.doma.DomaNullPointerException("entities");
            }
            org.seasar.doma.internal.jdbc.query.AutoBatchDeleteQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt> __query = new org.seasar.doma.internal.jdbc.query.AutoBatchDeleteQuery<pkuhit.iih.qa.dao.auto.entity.QaFlt>(pkuhit.iih.qa.dao.auto.entity._QaFlt.getSingletonInternal());
            __query.setMethod(__method9);
            __query.setConfig(config);
            __query.setEntities(entities);
            __query.setCallerClassName("pkuhit.iih.qa.dao.auto.QaFltDaoImpl");
            __query.setCallerMethodName("batchDelete");
            __query.setQueryTimeout(-1);
            __query.setBatchSize(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.BatchDeleteCommand __command = new org.seasar.doma.internal.jdbc.command.BatchDeleteCommand(__query);
            int[] __result = __command.execute();
            __query.complete();
            exiting("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "batchDelete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "batchDelete", __e);
            throw __e;
        }
    }

    @Override
    public java.sql.Clob createClob() {
        entering("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "createClob");
        try {
            org.seasar.doma.internal.jdbc.query.ClobCreateQuery __query = new org.seasar.doma.internal.jdbc.query.ClobCreateQuery();
            __query.setConfig(config);
            __query.setCallerClassName("pkuhit.iih.qa.dao.auto.QaFltDaoImpl");
            __query.setCallerMethodName("createClob");
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.CreateCommand<java.sql.Clob> __command = new org.seasar.doma.internal.jdbc.command.CreateCommand<java.sql.Clob>(__query);
            java.sql.Clob __result = __command.execute();
            __query.complete();
            exiting("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "createClob", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("pkuhit.iih.qa.dao.auto.QaFltDaoImpl", "createClob", __e);
            throw __e;
        }
    }

}
