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
System.out.print("규칙의 개수를 입력하세요=>");
ruleCnt = sc.nextInt();
sc.nextLine();
System.out.println(ruleCnt + "개의 규칙을 입력하세요");
for(int i = 0; i<ruleCnt; i++){
String lnstr = sc.nextLine();
String[] str = lnstr.split(">");
if(str.length == 2){
String key = str[1];
ArrayList<String> lst = ruleMap.get(key.trim());
if(lst == null){
lst = new ArrayList<String>();
lst.add(str[0].trim()); //해당 룰에 변수를 추가
ruleMap.put(key, lst);
}
else
lst.add(str[0].trim()); //해당 룰에 변수를 추가
}
else{ //error handle
}
}
HashMap<Integer, ArrayList<String>> parseVarMap = new HashMap<Integer, ArrayList<String>>();
System.out.println("\n멤버 확인이 필요한 문자열을 입력하세요.");
w = sc.nextLine().trim();
int wlen = w.length();
for(int len=1; len<=wlen; len++){ //길이를 하나씩 증가
for(int i=1, j=len; j<=wlen; i++, j++){
Integer newkey = makeKey(i,j,wlen);
ArrayList<String> newVars = new ArrayList<String>();
//V(ij)
if(len == 1){ //즉, 11 22 33 44 55...인 경우
String findkey = w.substring(i-1, i); //심볼 추출
ArrayList<String> ruleVar = ruleMap.get(findkey); //심볼을 갖고 있는 변수 찾기
if(ruleVar != null && !ruleVar.isEmpty()){
for(String var : ruleVar){