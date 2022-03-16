package hash;

import java.util.*;

class Solution_hash {
	public String solution(String[] participant, String[] completion) {
		// participant 참여 // completion 완료
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		ArrayList<String> hm = new ArrayList<>();
		
		for (int i = 0; i < participant.length; i++) {
			hm.add(participant[i]);
		}
		
		for (int i = 0; i < completion.length; i++) {
			if (completion[i] == participant[i]) {
				hm.remove(participant[i]);
			}
		}
		
		for (String string : hm) {
			System.out.println(">>>" + hm);
		}
		
//		int i;
//		for (i = 0; i < completion.length; i++) {
//			if (!participant[i].equals(completion[i])) {
//				return participant[i];
//			}
//		}
//		
//		return participant[i];
	}
	
	public static void main(String[] args) {
		Solution_hash s = new Solution_hash();
		
		String[] a = {"leo", "kiki", "eden"};
		String[] b = {"eden", "kiki"};
		
		System.out.println(s.solution(a, b));
		
		String[] c = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] d = {"josipa", "filipa", "marina", "nikola"};
		
		System.out.println(s.solution(c, d));
		
		String[] e = {"mislav", "stanko", "mislav", "ana"};
		String[] f = {"stanko", "ana", "mislav"};
		
		System.out.println(s.solution(e, f));
		
	}
}