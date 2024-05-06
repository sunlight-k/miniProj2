package com.sbs.exam.miniProj2.member.service;

import com.sbs.exam.miniProj2.member.repository.MemberRepository;
import com.sbs.exam.miniProj2.member.vo.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberRepository memberRepository;
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public int join(String loginId, String loginPw, String name, String nickname, String cellphoneNo, String email) {
        memberRepository.join(loginId, loginPw, name, nickname, cellphoneNo, email);
        return memberRepository.getLastInsertId();
    }

    public Member getMemberById(int id) {
        return memberRepository.getMemberById(id);
    }
}