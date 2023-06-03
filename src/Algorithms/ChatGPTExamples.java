package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ChatGPTExamples {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public int maxSubArraySum(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
                currentSum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }

    public void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int j = nums[i] - 1;
            if (nums[i] != nums[j]) {
                swap(nums, i, j);
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(nums, i + 1, current, subsets);
            current.remove(current.size() - 1);
        }
    }

    public List<Integer> findTopKElements(int[] nums, int k) {
        List<Integer> topKElements = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        while (!minHeap.isEmpty()) {
            topKElements.add(minHeap.poll());
        }
        Collections.reverse(topKElements);
        return topKElements;
    }

}
