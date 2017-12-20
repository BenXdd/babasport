package cn.itcast.core.dao;

import org.springframework.stereotype.Repository;

import cn.itcast.core.bean.TestTb;

/**
 * 测试
 * @author lx
 *
 */
@Repository
public interface TestTbDao {

	
	//保存
	public void insertTestTb(TestTb testTb);
	
}
