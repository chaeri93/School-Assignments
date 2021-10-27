//2071018 ��ä��
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class CykMain {
	private static int ruleCnt = 0;
	private static HashMap<String, ArrayList<String>> ruleMap = new HashMap<String, ArrayList<String>>();//key�� String, value�� ArrayList<String>�� ��ü ����
	private static String w;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("��Ģ�� ������ �Է��ϼ���=>");
		ruleCnt = sc.nextInt();//�Էµ� ��Ģ�� ������ ruleCnt�� ����ȴ�.
		sc.nextLine();
		System.out.println(ruleCnt + "���� ��Ģ�� �Է��ϼ���");
		
		for(int i = 0; i<ruleCnt; i++){//ruleCnt�� ����ŭ production rule�� �Է��Ѵ�.
			String lnstr = sc.nextLine();//lnstr�� ��Ģ ����
			String[] str = lnstr.split(">");//">"�� �������� �и�, ">"�� �������� �º��� value�̰� �캯�� key�̴�
			if(str.length == 2){//str�� �迭�� ���̰� 2���
				String key = str[1];
				ArrayList<String> lst = ruleMap.get(key.trim());
				if(lst == null){//HashMap�� key�� ������ ����
					lst = new ArrayList<String>();//��ü ����
					lst.add(str[0].trim()); //�ش� �꿡 ������ �߰�
					ruleMap.put(key, lst);//key,value�� HashMap�� ����
				}
				else
					lst.add(str[0].trim()); //�ش� �꿡 ������ �߰�
			}
			else{ //error handle
				System.out.println("����!!�ٽ��Է��ϼ���");
			}
		}
		HashMap<Integer, ArrayList<String>> parseVarMap = new HashMap<Integer, ArrayList<String>>();//key�� Integer, value�� ArrayList<String>�� ��ü ���� 
		System.out.println("\n��� Ȯ���� �ʿ��� ���ڿ��� �Է��ϼ���.");
		w = sc.nextLine().trim();//w�� ���ڿ� ����
		int wlen = w.length();//w�� ���̰� wlen�� ����

		for(int len=1; len<=wlen; len++){ //���̸� �ϳ��� ����
			for(int i=1, j=len; j<=wlen; i++, j++){
				Integer newkey = makeKey(i,j,wlen);
				ArrayList<String> newVars = new ArrayList<String>();
				//V(ij)�� ��ġ������ ������ �ٲپ��ش�
				if(len == 1){ //��, 11 22 33 44 55...�� ���
					String findkey = w.substring(i-1, i); //�ɺ� ����
					ArrayList<String> ruleVar = ruleMap.get(findkey); //�ɺ��� ���� �ִ� ���� ã��
					if(ruleVar != null && !ruleVar.isEmpty()){
						for(String var : ruleVar){//value�� ������ �ϼ��� �ֱ� ������ for���� ���� ������ �� newVars�� �߰���
							newVars.add(var);
						}
						parseVarMap.put(newkey, newVars);//ã�� �������� parseVarMap�� ����־���
					}
					continue;
				}
				else{
					for(int k=i; k<j; k++){//��, 11 22 33 44 55...�� �ƴ϶� V(ij)=V(i,k)V(k+1,j)�� ���
						Integer key1 = makeKey(i,k,wlen);//V(i,k)�� ��ġ������ ������ �ٲپ��ش�
						Integer key2 = makeKey(k+1,j,wlen);//V(k+1,j)�� ��ġ������ ������ �ٲپ��ش�
						for(String var1 : parseVarMap.get(key1)){//key1�� ���� �Ǵ� value���� var1�� �� ���� ������ �ݺ�
							for(String var2 : parseVarMap.get(key2)){//key2�� ���� �Ǵ� value���� var2�� �� ���� ������ �ݺ�
								String findkey = var1+var2;//���� �ɺ� �����ؼ� �����ֱ�
								ArrayList<String> ruleVar = ruleMap.get(findkey);//�ɺ��� ���� �ִ� ���� ã��
								if(ruleVar != null && !ruleVar.isEmpty()){
									for(String var : ruleVar){//value�� ������ �ϼ��� �ֱ� ������ for���� ���� ������ �� newVars�� �߰���
										if(!newVars.contains(var)) 
											newVars.add(var);
									}
									parseVarMap.put(newkey, newVars);//ã�� �������� parseVarMap�� ����־���
								}
							}
						}
						parseVarMap.put(newkey, newVars);
					}
				}
			}
		}
		//������ S�� �ִ��� Ȯ��
		Integer lastkey = makeKey(1, wlen, wlen);
		boolean bAccept = false;
		for(String var : parseVarMap.get(lastkey)){//parseVarMap���� ������ �ִ� ��� �ɺ����� var�� �־��� ������ �ݺ�
			if(var.contains("S")){//������ S�� ������ ����
				bAccept = true;
				break;//������ S�� ������ for���� ����������.
			}
		}

		if(bAccept) 
			System.out.println("Accept");//������ S�� �ֱ� ������ bAccept�� true�� �ٲ�� Accept ���
		else 
			System.out.println("Reject");//������ S�� ���� ������ bAccept�� false�� �ٲ�� Reject ���
	}
				
	// (i, j) Key ����� �޼ҵ�
	private static int makeKey(int i, int j, int len){//V(ij)�� ��ġ������ ��ǻ�Ͱ� �� �˾ƺ��� ���� ������ �ٲپ��ִ� �޼ҵ��̴�.
		int key = (i*len) + j;
		return key;
	}
}
				