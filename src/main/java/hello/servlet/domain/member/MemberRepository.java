package hello.servlet.domain.member;

import java.util.HashMap;
import java.util.Map;
//동시성 문제가 고려되지 않기 때문에, 실무에서는 ConcurrentHashMap/AtomicLong 사용 고려
public class MemberRepository {
    private Map<Long, Member> store = new HashMap<>();
}
