1�����ù��̰汾�ţ���cmd��ǰĿ¼��ִ������������������޸ĵ�ǰĿ¼��pom�еİ汾�ż����й����µ�pom�汾�š�
mvn versions:set -DnewVersion=2.1.10
		ע�⣺����ʹ�ð汾��Ϊx.x.x-SNAPSHOT����ʽ��汾��x.x.x
		
2������ϵͳ�汾�ţ���pkuhit-appĿ¼��ִ������������������޸�pkuhit-app��settings.properties��pkuhit.iih.ui�е�package.json�İ汾�š�
mvn package -P version
		ע�⣺ִ�и������ֻ���޸�build��ţ������Ǹ��ݵ�ǰ���+1.
3��mvn package -P init
		
ÿ���ڰ汾������ɺ󣬸��İ汾�ţ������ύ��