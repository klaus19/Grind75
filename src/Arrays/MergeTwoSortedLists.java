package Arrays;


//You are given the heads of two sorted linked lists list1 and list2.

//Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

//Return the head of the merged linked list.

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
          ListNode temp;
          if (list1==null)return list2;
          if (list2==null)return list1;

          if (list1.val>list2.val){
              temp=list2;
              temp.next = mergeTwoLists(list1,list2.next);
          }else {
              temp=list1;
              temp.next = mergeTwoLists(list1.next,list2);
          }
         return temp;
    }
}
