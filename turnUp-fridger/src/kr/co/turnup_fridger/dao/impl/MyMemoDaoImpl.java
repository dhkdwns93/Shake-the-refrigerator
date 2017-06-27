package kr.co.turnup_fridger.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.turnup_fridger.dao.MyMemoDao;
import kr.co.turnup_fridger.vo.MyMemo;

public class MyMemoDaoImpl implements MyMemoDao{

	private String sql="kr.co.turnUp_fridger.config.mybatis.mapper.myMemoMapper.";
	@Override
	public int insertMemo(SqlSession session, MyMemo memo) {
		return session.insert(sql+"insertMemo", memo);
	}

	@Override
	public int updateMemo(SqlSession session, MyMemo memo) {
		return session.update(sql+"updateMemo", memo);
	}

	@Override
	public int deleteMemo(SqlSession session, int memoId) {
		return session.delete(sql+"deleteMemo", memoId);
	}

	@Override
	public List<MyMemo> selectMemoList(SqlSession session, String memberId) {
		return session.selectList(sql+"selectMemoList", memberId);
	}

	@Override
	public MyMemo selectOneMemo(SqlSession session, int memoId) {
		return session.selectOne(sql+"selectOneMemo", memoId);
	}

	@Override
	public int selectMemoCount(SqlSession session, String memberId) {
		return session.selectOne(sql+"selectMemoCount", memberId);
	}

	
}
