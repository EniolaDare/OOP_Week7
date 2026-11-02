package ie.atu.oop.week1;

import java.util.ArrayList;
import java.util.List;

public class MembershipManager {
    private final List<Member> members = new ArrayList<>();

    public void addMember(Member member){
        if (member == null) throw new IllegalArgumentException("member cannot be null");
        members.add(member);
    }
    public void displayMembers(){
        if (members.isEmpty()){
            System.out.println("[-] There are no members in the system");
            return;
        }

        for (Member member : members){
            member.displayDetails();
            System.out.println();
        }
    }

    private Member findMemberByID(String memberId){
        for (Member member : members) if (member.getMemberId().equals(memberId)) return member;
        return null;
    }
    public Member getMemberByID(String memberId, boolean display){
        Member m = findMemberByID(memberId);

        if (m == null) System.out.println("[-] Member with ID " + memberId + " not found");
        else if (display) m.displayDetails();

        return m;
    }
}

