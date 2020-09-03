package hello.SpringBasic;

import hello.SpringBasic.repository.MemberRepository;
import hello.SpringBasic.repository.MemoryMemberRepository;
import hello.SpringBasic.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
