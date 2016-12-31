package pkuhit.xap.me;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseMasterModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "MEB03.AT01";
// 数据对象编码
public static final   String  OBJECT_CODE = "MEB03.AT02";
// 外键数据对象编码
public static final   String  FK_OBJECT_CODE = "MEB03.AT03";
// 名称
public static final   String  NAME = "MEB03.AT04";
// 描述
public static final   String  DESCRIPTION = "MEB03.AT05";
// 英文简称
public static final   String  SHORT_ENGLISH_NAME_ = "MEB03.AT06";
// 英文名称
public static final   String  ENGLISH_NAME = "MEB03.AT07";
// 数据类型编码
public static final   String  DATA_TYPE_CODE = "MEB03.AT08";
// 单位编码
public static final   String  UNIT_CODE = "MEB03.AT09";
// 长度(byte)
public static final   String  LENGTH = "MEB03.AT10";
// 精度(10进制小数位数)
public static final   String  PRECISION = "MEB03.AT11";
// 最小值(默认单位)
public static final   String  MIN_VALUE = "MEB03.AT12";
// 最大值(默认单位)
public static final   String  MAX_VALUE = "MEB03.AT13";
// 默认值(默认单位)
public static final   String  DEFAULT_VALUE = "MEB03.AT14";
// 对齐方式编码
public static final   String  ALIGN_CODE = "MEB03.AT15";
// 名称从缓存中获取
public static final   String  NAME_FROM_CACHE_FLAG = "MEB03.AT16";
// 大写标志
public static final   String  UPPER_FLAG = "MEB03.AT17";
// 小写标志
public static final   String  LOWER_FLAG = "MEB03.AT18";
// 主键标志
public static final   String  PK_FLAG = "MEB03.AT19";
// 外键标志
public static final   String  FK_FLAG = "MEB03.AT20";
// 非空标志
public static final   String  NOT_NULL_FLAG = "MEB03.AT21";
// 唯一标志
public static final   String  UNIQUE_FLAG = "MEB03.AT22";
// 索引标志
public static final   String  INDEX_FLAG = "MEB03.AT23";
// 持久化标志
public static final   String  PERSISTENT_FLAG = "MEB03.AT24";
// 保密标志
public static final   String  SECRET_FLAG = "MEB03.AT25";
// 状态审计标志
public static final   String  STATUS_AUDIT_FLAG = "MEB03.AT26";
// 自定义校验规则
public static final   String  VERIFY_RULE = "MEB03.AT27";
// 显示格式
public static final   String  SHOW_FORMAT = "MEB03.AT28";
// 编辑框高度(px)
public static final   String  EDIT_HIGHT = "MEB03.AT29";
// 编辑框宽度(px)
public static final   String  EDIT_WIDTH = "MEB03.AT30";
// 表格列宽度(px)
public static final   String  GRID_COLUMN_WIDTH = "MEB03.AT31";
// 提示信息编码
public static final   String  TIP_MESSAGE_CODE = "MEB03.AT32";


@Column(name="OBJ_ATTR_CD") 
private  String code;

@Column(name="OBJ_CD") 
private  String objectCode;

@Column(name="FK_OBJ_CD") 
private  String fkObjectCode;

@Column(name="NM") 
private  String name;

@Column(name="DES") 
private  String description;

@Column(name="SHT_NM_EN") 
private  String shortEnglishName;

@Column(name="NM_EN") 
private  String englishName;

@Column(name="DT_TP_CD") 
private  String dataTypeCode;

@Column(name="UNIT_CD") 
private  String unitCode;

@Column(name="LEN") 
private  Integer length;

@Column(name="PREC") 
private  Integer precision;

@Column(name="MIN_VAL") 
private  String minValue;

@Column(name="MAX_VAL") 
private  String maxValue;

@Column(name="DFT_VAL") 
private  String defaultValue;

@Column(name="ALIGN_CD") 
private  String alignCode;

@Column(name="NM_CACHE_F") 
private  Integer nameFromCacheFlag;

@Column(name="UPPER_F") 
private  Integer upperFlag;

@Column(name="LOWER_F") 
private  Integer lowerFlag;

@Column(name="PK_F") 
private  Integer pkFlag;

@Column(name="FK_F") 
private  Integer fkFlag;

@Column(name="NN_F") 
private  Integer notNullFlag;

@Column(name="UN_F") 
private  Integer uniqueFlag;

@Column(name="IN_F") 
private  Integer indexFlag;

@Column(name="PERS_F") 
private  Integer persistentFlag;

@Column(name="SECU_F") 
private  Integer secretFlag;

@Column(name="STA_AU_F") 
private  Integer statusAuditFlag;

@Column(name="VALI_RULE") 
private  String verifyRule;

@Column(name="SHW_FMT") 
private  String showFormat;

@Column(name="EDIT_HIGHT") 
private  Integer editHight;

@Column(name="EDIT_WIDTH") 
private  Integer editWidth;

@Column(name="GRID_COL_WIDTH") 
private  Integer gridColumnWidth;

@Column(name="TIP_MSG_CD") 
private  String tipMessageCode;
// 数据对象名称
private  String objectName;
// 数据类型名称
@DictionaryTag(code = "dataTypeCode")
private  String dataTypeName;
// 单位名称
@DictionaryTag(code = "unitCode")
private  String unitName;
// 对齐方式名称
@DictionaryTag(code = "alignCode")
private  String alignName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.objectCode;
 }

 {
  this.objectCode = objectCode;
 }

 {
     return this.fkObjectCode;
 }

 {
  this.fkObjectCode = fkObjectCode;
 }

 {
     return this.name;
 }

 {
  this.name = name;
 }

 {
     return this.description;
 }

 {
  this.description = description;
 }

 {
     return this.shortEnglishName;
 }

 {
  this.shortEnglishName = shortEnglishName;
 }

 {
     return this.englishName;
 }

 {
  this.englishName = englishName;
 }

 {
     return this.dataTypeCode;
 }

 {
  this.dataTypeCode = dataTypeCode;
 }

 {
     return this.unitCode;
 }

 {
  this.unitCode = unitCode;
 }

 {
     return this.length;
 }

 {
  this.length = length;
 }

 {
     return this.precision;
 }

 {
  this.precision = precision;
 }

 {
     return this.minValue;
 }

 {
  this.minValue = minValue;
 }

 {
     return this.maxValue;
 }

 {
  this.maxValue = maxValue;
 }

 {
     return this.defaultValue;
 }

 {
  this.defaultValue = defaultValue;
 }

 {
     return this.alignCode;
 }

 {
  this.alignCode = alignCode;
 }

 {
     return this.nameFromCacheFlag;
 }

 {
  this.nameFromCacheFlag = nameFromCacheFlag;
 }

 {
     return this.upperFlag;
 }

 {
  this.upperFlag = upperFlag;
 }

 {
     return this.lowerFlag;
 }

 {
  this.lowerFlag = lowerFlag;
 }

 {
     return this.pkFlag;
 }

 {
  this.pkFlag = pkFlag;
 }

 {
     return this.fkFlag;
 }

 {
  this.fkFlag = fkFlag;
 }

 {
     return this.notNullFlag;
 }

 {
  this.notNullFlag = notNullFlag;
 }

 {
     return this.uniqueFlag;
 }

 {
  this.uniqueFlag = uniqueFlag;
 }

 {
     return this.indexFlag;
 }

 {
  this.indexFlag = indexFlag;
 }

 {
     return this.persistentFlag;
 }

 {
  this.persistentFlag = persistentFlag;
 }

 {
     return this.secretFlag;
 }

 {
  this.secretFlag = secretFlag;
 }

 {
     return this.statusAuditFlag;
 }

 {
  this.statusAuditFlag = statusAuditFlag;
 }

 {
     return this.verifyRule;
 }

 {
  this.verifyRule = verifyRule;
 }

 {
     return this.showFormat;
 }

 {
  this.showFormat = showFormat;
 }

 {
     return this.editHight;
 }

 {
  this.editHight = editHight;
 }

 {
     return this.editWidth;
 }

 {
  this.editWidth = editWidth;
 }

 {
     return this.gridColumnWidth;
 }

 {
  this.gridColumnWidth = gridColumnWidth;
 }

 {
     return this.tipMessageCode;
 }

 {
  this.tipMessageCode = tipMessageCode;
 }

 {
     return this.objectName;
 }

 {
  this.objectName = objectName;
 }

 {
     return this.dataTypeName;
 }

 {
  this.dataTypeName = dataTypeName;
 }

 {
     return this.unitName;
 }

 {
  this.unitName = unitName;
 }

 {
     return this.alignName;
 }

 {
  this.alignName = alignName;
 }

