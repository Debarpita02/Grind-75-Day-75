class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode head = new ListNode(0);
        ListNode temp = head;
        List<Integer> resultList = new ArrayList<>();

        for (ListNode list : lists) {
            while (list != null) {
                resultList.add(list.val);
                list = list.next;
            }
        }

        Collections.sort(resultList);

        for (int val : resultList) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        return head.next;
    }
}