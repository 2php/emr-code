package pkuhit.iih.mr.dao.auto.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.35.0" }, date = "2017-01-01T01:49:38.277+0800")
public final class _MrFrTpl extends org.seasar.doma.jdbc.entity.AbstractEntityType<pkuhit.iih.mr.dao.auto.entity.MrFrTpl> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.35.0");
    }

    private static final _MrFrTpl __singleton = new _MrFrTpl();

    /** the mrFrTplCd */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object> $mrFrTplCd = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "mrFrTplCd", "MR_FR_TPL_CD");

    /** the filePk */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object> $filePk = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "filePk", "FILE_PK", true, true);

    /** the nm */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object> $nm = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "nm", "NM", true, true);

    /** the status */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object> $status = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "status", "STATUS", true, true);

    /** the mrFrTplTpCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object> $mrFrTplTpCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "mrFrTplTpCd", "MR_FR_TPL_TP_CD", true, true);

    /** the memo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object> $memo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "memo", "MEMO", true, true);

    /** the sortNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object> $sortNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sortNo", "SORT_NO", true, true);

    /** the spellNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object> $spellNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "spellNo", "SPELL_NO", true, true);

    /** the wubiNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object> $wubiNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "wubiNo", "WUBI_NO", true, true);

    /** the updCnt */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.math.BigInteger, java.lang.Object> $updCnt = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.math.BigInteger, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.math.BigInteger.class, org.seasar.doma.wrapper.BigIntegerWrapper.class, null, null, "updCnt", "UPD_CNT", true, true);

    /** the crtTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.sql.Timestamp, java.lang.Object> $crtTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.sql.Timestamp, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "crtTime", "CRT_TIME", true, true);

    /** the crtUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object> $crtUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "crtUserId", "CRT_USER_ID", true, true);

    /** the crtDeptCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object> $crtDeptCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "crtDeptCd", "CRT_DEPT_CD", true, true);

    /** the lastUpdTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.sql.Timestamp, java.lang.Object> $lastUpdTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.sql.Timestamp, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "lastUpdTime", "LAST_UPD_TIME", true, true);

    /** the lastUpdDeptCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object> $lastUpdDeptCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "lastUpdDeptCd", "LAST_UPD_DEPT_CD", true, true);

    /** the lastUpdUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object> $lastUpdUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "lastUpdUserId", "LAST_UPD_USER_ID", true, true);

    /** the contentText */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object> $contentText = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.String, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "contentText", "CONTENT_TEXT", true, true);

    /** the delF */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.Short, java.lang.Object> $delF = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, java.lang.Short, java.lang.Object>(pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class, java.lang.Short.class, org.seasar.doma.wrapper.ShortWrapper.class, null, null, "delF", "DEL_F", true, true);

    private final pkuhit.iih.mr.dao.auto.entity.MrFrTplListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrFrTpl, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrFrTpl, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrFrTpl, ?>> __entityPropertyTypeMap;

    private _MrFrTpl() {
        __listener = new pkuhit.iih.mr.dao.auto.entity.MrFrTplListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "MrFrTpl";
        __catalogName = "";
        __schemaName = "";
        __tableName = "MR_FR_TPL";
        __qualifiedTableName = "MR_FR_TPL";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrFrTpl, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrFrTpl, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrFrTpl, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrFrTpl, ?>>(18);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrFrTpl, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrFrTpl, ?>>(18);
        __idList.add($mrFrTplCd);
        __list.add($mrFrTplCd);
        __map.put("mrFrTplCd", $mrFrTplCd);
        __list.add($filePk);
        __map.put("filePk", $filePk);
        __list.add($nm);
        __map.put("nm", $nm);
        __list.add($status);
        __map.put("status", $status);
        __list.add($mrFrTplTpCd);
        __map.put("mrFrTplTpCd", $mrFrTplTpCd);
        __list.add($memo);
        __map.put("memo", $memo);
        __list.add($sortNo);
        __map.put("sortNo", $sortNo);
        __list.add($spellNo);
        __map.put("spellNo", $spellNo);
        __list.add($wubiNo);
        __map.put("wubiNo", $wubiNo);
        __list.add($updCnt);
        __map.put("updCnt", $updCnt);
        __list.add($crtTime);
        __map.put("crtTime", $crtTime);
        __list.add($crtUserId);
        __map.put("crtUserId", $crtUserId);
        __list.add($crtDeptCd);
        __map.put("crtDeptCd", $crtDeptCd);
        __list.add($lastUpdTime);
        __map.put("lastUpdTime", $lastUpdTime);
        __list.add($lastUpdDeptCd);
        __map.put("lastUpdDeptCd", $lastUpdDeptCd);
        __list.add($lastUpdUserId);
        __map.put("lastUpdUserId", $lastUpdUserId);
        __list.add($contentText);
        __map.put("contentText", $contentText);
        __list.add($delF);
        __map.put("delF", $delF);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
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
    public String getTableName() {
        return __tableName;
    }

    @Override
    public String getQualifiedTableName() {
        return __qualifiedTableName;
    }

    @Override
    public void preInsert(pkuhit.iih.mr.dao.auto.entity.MrFrTpl entity, org.seasar.doma.jdbc.entity.PreInsertContext<pkuhit.iih.mr.dao.auto.entity.MrFrTpl> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(pkuhit.iih.mr.dao.auto.entity.MrFrTpl entity, org.seasar.doma.jdbc.entity.PreUpdateContext<pkuhit.iih.mr.dao.auto.entity.MrFrTpl> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(pkuhit.iih.mr.dao.auto.entity.MrFrTpl entity, org.seasar.doma.jdbc.entity.PreDeleteContext<pkuhit.iih.mr.dao.auto.entity.MrFrTpl> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(pkuhit.iih.mr.dao.auto.entity.MrFrTpl entity, org.seasar.doma.jdbc.entity.PostInsertContext<pkuhit.iih.mr.dao.auto.entity.MrFrTpl> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(pkuhit.iih.mr.dao.auto.entity.MrFrTpl entity, org.seasar.doma.jdbc.entity.PostUpdateContext<pkuhit.iih.mr.dao.auto.entity.MrFrTpl> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(pkuhit.iih.mr.dao.auto.entity.MrFrTpl entity, org.seasar.doma.jdbc.entity.PostDeleteContext<pkuhit.iih.mr.dao.auto.entity.MrFrTpl> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrFrTpl, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrFrTpl, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.iih.mr.dao.auto.entity.MrFrTpl, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, pkuhit.iih.mr.dao.auto.entity.MrFrTpl, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public pkuhit.iih.mr.dao.auto.entity.MrFrTpl newEntity() {
        return new pkuhit.iih.mr.dao.auto.entity.MrFrTpl();
    }

    @Override
    public pkuhit.iih.mr.dao.auto.entity.MrFrTpl newEntity(java.util.Map<String, Object> __args) {
        return new pkuhit.iih.mr.dao.auto.entity.MrFrTpl();
    }

    @Override
    public Class<pkuhit.iih.mr.dao.auto.entity.MrFrTpl> getEntityClass() {
        return pkuhit.iih.mr.dao.auto.entity.MrFrTpl.class;
    }

    @Override
    public pkuhit.iih.mr.dao.auto.entity.MrFrTpl getOriginalStates(pkuhit.iih.mr.dao.auto.entity.MrFrTpl __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(pkuhit.iih.mr.dao.auto.entity.MrFrTpl __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MrFrTpl getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MrFrTpl newInstance() {
        return new _MrFrTpl();
    }

}
