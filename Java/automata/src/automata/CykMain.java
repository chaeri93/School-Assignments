import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class CykMain {
private static int ruleCnt = 0;
private static HashMap<String, ArrayList<String>> ruleMap = new HashMap<String, ArrayList<String>>();
private static String w;
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("��Ģ�� ������ �Է��ϼ���=>");
ruleCnt = sc.nextInt();
sc.nextLine();
System.out.println(ruleCnt + "���� ��Ģ�� �Է��ϼ���");
for(int i = 0; i<ruleCnt; i++){
String lnstr = sc.nextLine();
String[] str = lnstr.split(">");
if(str.length == 2){
String key = str[1];
ArrayList<String> lst = ruleMap.get(key.trim());
if(lst == null){
lst = new ArrayList<String>();
lst.add(str[0].trim()); //�ش� �꿡 ������ �߰�
ruleMap.put(key, lst);
}
else
lst.add(str[0].trim()); //�ش� �꿡 ������ �߰�
}
else{ //error handle
}
}
HashMap<Integer, ArrayList<String>> parseVarMap = new HashMap<Integer, ArrayList<String>>();
System.out.println("\n��� Ȯ���� �ʿ��� ���ڿ��� �Է��ϼ���.");
w = sc.nextLine().trim();
int wlen = w.length();
for(int len=1; len<=wlen; len++){ //���̸� �ϳ��� ����
for(int i=1, j=len; j<=wlen; i++, j++){
Integer newkey = makeKey(i,j,wlen);
ArrayList<String> newVars = new ArrayList<String>();
//V(ij)
if(len == 1){ //��, 11 22 33 44 55...�� ���
String findkey = w.substring(i-1, i); //�ɺ� ����
ArrayList<String> ruleVar = ruleMap.get(findkey); //�ɺ��� ���� �ִ� ���� ã��
if(ruleVar != null && !ruleVar.isEmpty()){
for(String var : ruleVar){