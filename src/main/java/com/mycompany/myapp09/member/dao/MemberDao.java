package com.mycompany.myapp09.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp09.member.vo.Member;
@Repository
public class MemberDao {
	 @Autowired
	 private SqlSession sqlSession;
	
	 public int idCheck(String id) {
	     return sqlSession.selectOne("Member.idCheck", id);
	  }
}
