package com.iu3.tasks.structure;

// Отдельный класс для узла связанного списка
public class ListNode {
    public int val;
    public ListNode next;

    // Конструктор с одним аргументом
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    // Конструктор с двумя аргументами
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // Необязательно, но удобно для отладки — переопределим toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(" → ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}