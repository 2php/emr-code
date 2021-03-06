package szlh.iih.di.dao;


import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.jdbc.SelectOptions;

import szlh.iih.di.po.DiagnosisPo;
import xap.sv.dao.annotation.RepositoryConfig;

/**
 * @author guo_zhongbao
 * 诊断数据访问 接口
 */
@Dao
@RepositoryConfig
public interface DiDao {
	//诊断列表
	@Select
	List<DiagnosisPo> getDisListByEnSn(String enPk, String isMainF,String onlyNotStop ,SelectOptions options);
	//诊断详情
	@Select
	DiagnosisPo getDibDiDetail(String diPk);
	
}
