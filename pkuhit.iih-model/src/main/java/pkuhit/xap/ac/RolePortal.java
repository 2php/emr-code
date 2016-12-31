package pkuhit.xap.ac;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseRelationModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "XAPM18.AT01";
// 角色编码
public static final   String  ROLE_CODE = "XAPM18.AT02";
// 门户编码
public static final   String  PORTAL_CODE = "XAPM18.AT03";


@Column(name="ROLE_PO_CD") 
private  String code;

@Column(name="ROLE_CD") 
private  String roleCode;

@Column(name="PORTAL_CD") 
private  String portalCode;
// 角色名称
private  String roleName;
// 门户名称
private  String portalName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.roleCode;
 }

 {
  this.roleCode = roleCode;
 }

 {
     return this.portalCode;
 }

 {
  this.portalCode = portalCode;
 }

 {
     return this.roleName;
 }

 {
  this.roleName = roleName;
 }

 {
     return this.portalName;
 }

 {
  this.portalName = portalName;
 }

