#include<stdio.h>
typedef struct ListNode
{
	int data;
	struct ListNode* link;
}ListNode;
typedef struct
{
	ListNode* head;
}LinkedListType;
void init(LinkedListType* L)
{
	L->head = NULL;
}
void insert_first(LinkedListType* L, int item)
{
	ListNode* node = (ListNode*)malloc(sizeof(ListNode));
	node->data = item;
	node->link = L->head;
	L->head = node;
}
void insert(LinkedListType* L, int pos, int item)
{
	ListNode* node = (ListNode*)malloc(sizeof(ListNode));
	ListNode* before = L->head;
	for (int i = 0; i < pos - 1; i++)
		before = before->link;
	node->data = item;
	node->link = before->link;
	before->link = node;
}
ListNode* delete_first(LinkedListType* L)
{
	ListNode* node = (ListNode*)malloc(sizeof(ListNode));
	ListNode* before = L->head;
	for (int i = 0; node->link != NULL; i++)
		before->link = before;
	node->link = L->head;
	L->head = node;
}
ListNode* delete(LinkedListType* L, int pos)
{
	ListNode* node = (ListNode*)malloc(sizeof(ListNode));
	ListNode* before = L->head;
	for (int i = 0; i < pos - 1; i++)
		before->link = before;
	node->link = L->head;
	L->head = node;
}
void print_list(LinkedListType* L)
{
	for (ListNode* p = L->head; p != NULL; p = p->link)
		printf("[%d] => ", p->data);
	printf("NULL\n");
}
int main(void)
{
	LinkedListType list;
	init(&list);
	insert_first(&list, 10); print_list(&list);
	insert_first(&list, 20); print_list(&list);
	insert_first(&list, 30); print_list(&list);
	getchar();
	insert(&list, 1, 40); print_list(&list);
	insert(&list, 2, 50); print_list(&list);
	insert(&list, 3, 60); print_list(&list);
	getchar();
	list.head = delete_first(&list); print_list(&list);
	list.head = delete(&list, 1); print_list(&list);
	return 0;
}