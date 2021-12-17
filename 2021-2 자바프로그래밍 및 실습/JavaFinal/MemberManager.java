import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MemberManager {

    HashMap<Integer, Member> map = new HashMap<Integer, Member>();

    public void generateData() {
        map.put(1001,new Member(1001,"Hong","010-1234-5678","hong@email.com"));
        map.put(1002,new Member(1002,"Kim","010-8888-1234","kim@email.com"));
        map.put(1003,new Member(1003,"Lee","010-7777-7654","lee@email.com"));
    }

    public void printtAll() {
        System.out.println("학번     이름     전화번호         이메일         ");
        Set<Integer> keys = map.keySet();
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            Member value = map.get(key);
            System.out.println(value.getNo() + "	" + value.getName() + "	   " + value.getTel() + "	" + value.getEmail());
        }
    }

    public Member search(int nextInt) {
        Member student = map.get(nextInt);
        return student;
    }
}
