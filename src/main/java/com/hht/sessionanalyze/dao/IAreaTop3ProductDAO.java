package com.hht.sessionanalyze.dao;

		import com.hht.sessionanalyze.domain.AreaTop3Product;

		import java.util.List;

/**
 * 各区域top3热门商品DAO接口
 * @author Administrator
 *
 */
public interface IAreaTop3ProductDAO {

	void insertBatch(List<AreaTop3Product> areaTopsProducts);

}
