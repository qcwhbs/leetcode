public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode l3 = new ListNode(-1);
		ListNode current = l3;
		int a = 0;
		int b = 0;
		int carry = 0, sum =0;
		while(l1 != null || l2 != null){
			a = l1 == null ? 0 : l1.val;
			b = l2 == null ? 0 : l2.val;
			sum = a + b + carry;
			carry = sum >= 10 ? 1 : 0;
			current.next = new ListNode(sum % 10);
			current = current.next;
			if(l1 != null)		l1 = l1.next;
			if(l2 != null)		l2 = l2.next;
		}
		if(carry == 1)
			current.next = new ListNode(1);
		return l3.next;
	}
  
  
  /*class Solution{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode c1 = l1;
		ListNode c2 = l2;
		ListNode l3 = new ListNode(0);
		ListNode current = l3;
		int sum = 0;
		while(c1 != null || c2 != null){
			sum /= 10;
			if(c1 != null){
				sum += c1.val;
				c1 = c1.next;
			}
			if(c2 != null){
				sum += c2.val;
				c2 = c2.next;
			}
			current.next = new ListNode(sum % 10);
			current = current.next;
		}
		if(sum / 10 == 1)
			current.next = new ListNode(1);
		return l3.next;
		
	}
}*/
