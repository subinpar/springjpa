package jpabook.jpashop;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member){
        em.persist(member);
        return member.getId(); //아이디로 조회하는 용도
    }

    public Member find(Long id){
        return em.find(Member.class, id);
    }
}
