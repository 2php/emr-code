package pkuhit.org;

import xap.sv.annotation.Column;
import xap.sv.annotation.DictionaryTag;








 
 public static final String   OBJ_CD  = "ORGB02";

public static final   String  CODE = "ORGB02.AT01";
// 部门类型编码
public static final   String  TYPE_CODE = "ORGB02.AT02";


@Column(name="DEPT_CD") 
private  String code;

@Column(name="DEPT_TP_CD") 
private  String typeCode;
// 部门类型名称
@DictionaryTag(code = "typeCode")
private  String typeName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.typeCode;
 }

 {
  this.typeCode = typeCode;
 }

 {
     return this.typeName;
 }

 {
  this.typeName = typeName;
 }

