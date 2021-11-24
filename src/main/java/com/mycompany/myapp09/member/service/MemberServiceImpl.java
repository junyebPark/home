package com.mycompany.myapp09.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp09.member.dao.MemberDao;
import com.mycompany.myapp09.member.vo.Member;


@Service("memberService")
public class MemberServiceImpl implements MemberService{
   @Autowired
   private MemberDao memberDao;
   
   @Override
   public int idCheck(String id) {
      int result=0;
      try {
         result = memberDao.idCheck(id);
         System.out.println(result);
      } catch (Exception e) {
         e.printStackTrace();
      }
      return result;
      
   }
}
