//2071018 김채리
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class CykMain {
	private static int ruleCnt = 0;
	private static HashMap<String, ArrayList<String>> ruleMap = new HashMap<String, ArrayList<String>>();//key가 String, value가 ArrayList<String>로 객체 생성
	private static String w;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("규칙의 개수를 입력하세요=>");
		ruleCnt = sc.nextInt();//입력된 규칙의 개수가 ruleCnt에 저장된다.
		sc.nextLine();
		System.out.println(ruleCnt + "개의 규칙을 입력하세요");
		
		for(int i = 0; i<ruleCnt; i++){//ruleCnt의 수만큼 production rule을 입력한다.
			String lnstr = sc.nextLine();//lnstr에 규칙 저장
			String[] str = lnstr.split(">");//">"를 기준으로 분리, ">"를 기준으로 좌변은 value이고 우변은 key이다
			if(str.length == 2){//str의 배열의 길이가 2라면
				String key = str[1];
				ArrayList<String> lst = ruleMap.get(key.trim());
				if(lst == null){//HashMap에 key가 없으면 실행
					lst = new ArrayList<String>();//객체 생성
					lst.add(str[0].trim()); //해당 룰에 변수를 추가
					ruleMap.put(key, lst);//key,value를 HashMap에 넣음
				}
				else
					lst.add(str[0].trim()); //해당 룰에 변수를 추가
			}
			else{ //error handle
				System.out.println("오류!!다시입력하세요");
			}
		}
		HashMap<Integer, ArrayList<String>> parseVarMap = new HashMap<Integer, ArrayList<String>>();//key가 Integer, value가 ArrayList<String>로 객체 생성 
		System.out.println("\n멤버 확인이 필요한 문자열을 입력하세요.");
		w = sc.nextLine().trim();//w에 문자열 저장
		int wlen = w.length();//w의 길이가 wlen에 저장

		for(int len=1; len<=wlen; len++){ //길이를 하나씩 증가
			for(int i=1, j=len; j<=wlen; i++, j++){
				Integer newkey = makeKey(i,j,wlen);
				ArrayList<String> newVars = new ArrayList<String>();
				//V(ij)의 위치정보를 정수로 바꾸어준다
				if(len == 1){ //즉, 11 22 33 44 55...인 경우
					String findkey = w.substring(i-1, i); //심볼 추출
					ArrayList<String> ruleVar = ruleMap.get(findkey); //심볼을 갖고 있는 변수 찾기
					if(ruleVar != null && !ruleVar.isEmpty()){
						for(String var : ruleVar){//value가 여러개 일수도 있기 때문에 for문을 통해 변수를 다 newVars에 추가함
							newVars.add(var);
						}
						parseVarMap.put(newkey, newVars);//찾은 변수들을 parseVarMap에 집어넣어줌
					}
					continue;
				}
				else{
					for(int k=i; k<j; k++){//즉, 11 22 33 44 55...가 아니라 V(ij)=V(i,k)V(k+1,j)인 경우
						Integer key1 = makeKey(i,k,wlen);//V(i,k)의 위치정보를 정수로 바꾸어준다
						Integer key2 = makeKey(k+1,j,wlen);//V(k+1,j)의 위치정보를 정수로 바꾸어준다
						for(String var1 : parseVarMap.get(key1)){//key1에 대응 되는 value들을 var1에 다 넣을 때까지 반복
							for(String var2 : parseVarMap.get(key2)){//key2에 대응 되는 value들을 var2에 다 넣을 때까지 반복
								String findkey = var1+var2;//각자 심볼 추출해서 더해주기
								ArrayList<String> ruleVar = ruleMap.get(findkey);//심볼을 갖고 있는 변수 찾기
								if(ruleVar != null && !ruleVar.isEmpty()){
									for(String var : ruleVar){//value가 여러개 일수도 있기 때문에 for문을 통해 변수를 다 newVars에 추가함
										if(!newVars.contains(var)) 
											newVars.add(var);
									}
									parseVarMap.put(newkey, newVars);//찾은 변수들을 parseVarMap에 집어넣어줌
								}
							}
						}
						parseVarMap.put(newkey, newVars);
					}
				}
			}
		}
		//최종에 S가 있는지 확인
		Integer lastkey = makeKey(1, wlen, wlen);
		boolean bAccept = false;
		for(String var : parseVarMap.get(lastkey)){//parseVarMap에서 최종에 있는 모든 심볼들을 var에 넣어줄 때까지 반복
			if(var.contains("S")){//최종에 S가 있으면 실행
				bAccept = true;
				break;//최종에 S가 있으면 for문을 빠져나간다.
			}
		}

		if(bAccept) 
			System.out.println("Accept");//최종에 S가 있기 때문에 bAccept이 true로 바뀌어 Accept 출력
		else 
			System.out.println("Reject");//최종에 S가 없기 때문에 bAccept는 false로 바뀌어 Reject 출력
	}
				
	// (i, j) Key 만드는 메소드
	private static int makeKey(int i, int j, int len){//V(ij)의 위치정보를 컴퓨터가 더 알아보기 쉽게 정수로 바꾸어주는 메소드이다.
		int key = (i*len) + j;
		return key;
	}
}
				