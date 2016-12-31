select
  QA_PK,
  EN_PK,
  QA_TY_CD,
  PLAN_TIME,
  EXEC_BEGIN_TIME,
  EXEC_END_TIME,
  EXEC_USER_ID,
  EXEC_DEPT_CD,
  CMPL_F,
  HAVE_FLT_F,
  NEED_RFM_FLT_F,
  RFM_DEADLINE,
  DEADLINE,
  REVISION_CD,
  MEMO,
  SORT_NO,
  SPELL_NO,
  WUBI_NO,
  UPD_CNT,
  CRT_TIME,
  CRT_USER_ID,
  CRT_DEPT_CD,
  LAST_UPD_TIME,
  LAST_UPD_DEPT_CD,
  LAST_UPD_USER_ID,
  DEL_F,
  QA_WORK_CD
from
  QA
where
  QA_PK = /* qaPk */'a'
and del_f = 0