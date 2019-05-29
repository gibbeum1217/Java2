/*�� �������κ��� ��ӹ޴� ��� �߿��� ��������� �̸��� ���ų� �޼����� ����ΰ� ��ġ�ϰ� ���� ������ �ٸ��ٸ� 
�� �� �������κ��� ��ӹ޴� �ڼ�Ŭ������ ��� ������ ���� ��ӹް� �Ǵ°����� �� �� ����. ��� �������κ����� ����� �����ϴ���, �̸��� �浹���� �ʵ��� ����Ŭ������ �����ϴ� ���ۿ� ����.abstract

�ڹٵ� �������̽��� �̿��ϸ� ���߻���� �����ϴٶ�� �ϴ� ���� �� �ڹٿ��� �������̽��� ���߻���� �����ϴ� ���� ���� ����
�������̽��� static����� �����Ҽ� �����Ƿ� ����Ŭ������ ��������� �浹�ϴ� ���� ���� ����
�浹�ȴ� �ϴ��� Ŭ���� �̸��� �ٿ��� ������ �����ϴ�
�׸��� �߻�޼���� ���������� ���� �����Ƿ� ����Ŭ������ �޼���� ����ΰ� ��ġ�ϴ� ��쿡�� �翬�� ���� Ŭ���� ���� �޼��带 ��ӹ����� �ǹǷ� �������� �ʴ´�
�׷���, �̷��� �ϸ� ��ӹ޴� ����� �浹�� ���� �� ������, ���߻���� ������ �Ұ� �ȴ�

������� ������ ���� TvŬ������ VCRŬ������ ������ TVCRŬ������ �ۼ��ϱ����� �� Ŭ�����κ��� ����� ���� ���� ������ �������� ���߻���� ������� �����Ƿ�
�� �ʸ� �����Ͽ� ��ӹް� ������ �� ���� Ŭ���� ���� ���Խ��Ѽ� ���������� �ν��Ͻ��� �����ؼ� ����ϵ��� �Ѵ�
*/



package interface0;

interface Parseable{ //Parseable �������̽��� �����м�(parsing)�� �����ϴ� ����� ������ �������� �߻�޼��� parse(String fileName)�� �����ߴ�
	public abstract void parse(String fileName);
}


class ParserManager{
	             // ����Ÿ��           �̸�
	public static Parseable getParser(String type) { //ParserManager Ŭ������ getParser�޼���� �Ű������� �Ѱܹ޴� type�� ���� ���� XMLParser�ν��Ͻ�
		//�Ǵ� HTMLParser�ν��Ͻ��� ��ȯ�Ѵ�   getParser�޼����� �������� �������� parser�� XMLParser�ν��Ͻ��� �ּҰ��� ���� �ȴ�
		//��ġ Parseable parser = new XMLParser();�� ���صȰͰ� ����
		
		if(type.equals("XML")){
			return new XMLParser();
		}else {
			Parseable p = new HTMLParser();
			return p;
			
		}
	}
}

class XMLParser implements Parseable{ //�׸��� XMLParserŬ������ HTMLParserŬ������ Parseable �������̽��� �����Ͽ���
	public void parse(String fileName) {
		System.out.println(fileName + "-XML parsing completed.");
	}
}

class HTMLParser implements Parseable{
	
	public void parse(String fileName) {
		System.out.println(fileName + "-HTML parsing completed.");
	}
}


public class ParserTest {
	public static void main(String args[]) {
		Parseable parser = ParserManager.getParser("XML");  //ParserMangagerŬ������ ����ƽ�޼��� getParser!!
		parser.parse("document.xml");     //���� ���� parser�� ���� parse()�� ȣ���ϸ� parser�� �����ϰ��ִ� XMLParser�ν��Ͻ��� parse�޼��尡 ȣ��ȴ�
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
