package ie.atu.oop.week1;

import java.util.ArrayList;
import java.util.List;

public class MembershipManager {
    private final List<Member> members = new ArrayList<>();

    public void addMember(Member member){
        // Note: members with negative or zero as age rejected by Member class
        if (member == null) throw new IllegalArgumentException("member cannot be null");
        if (members.contains(member)) throw new IllegalArgumentException("member already exists");
        if (findMemberByID(member.getMemberId()) != null) throw new IllegalArgumentException("member with this ID already exists");

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

    public boolean removeMemberByID(String memberId){
        Member m = getMemberByID(memberId, false);
        if  (m == null) return false;

        members.remove(m);
        return true;
    }
}

