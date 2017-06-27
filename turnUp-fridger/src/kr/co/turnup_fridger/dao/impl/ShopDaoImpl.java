package kr.co.turnup_fridger.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.turnup_fridger.dao.ShopDao;
import kr.co.turnup_fridger.vo.Shop;

public class ShopDaoImpl implements ShopDao{

	private String sql = "kr.co.turnUp_fridger.config.mybatis.mapper.shopMapper.";
	
	@Override
	public int insertShop(SqlSession session, Shop shop) {
		return session.insert(sql+"insertShop", shop);
	}

	@Override
	public int deleteShop(SqlSession session, int shopId) {
		return session.delete(sql+"deleteShop", shopId);
	}

	@Override
	public List<Shop> selectShopList(SqlSession session) {
		return session.selectList(sql+"selectShopList");
	}

	@Override
	public int selectShopCount(SqlSession session) {
		return session.selectOne(sql+"selectShopCount");
	}

	
}
